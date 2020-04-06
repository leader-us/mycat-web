package io.mycat.myweb.core.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.exceptions.JWTVerificationException;

import io.mycat.myweb.core.config.properties.ExcludeUrlsProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import io.mycat.myweb.core.service.TokenService;
import io.mycat.myweb.core.service.UserService;

import java.nio.file.PathMatcher;

/**
 * 权限验证，基于Token
 */
@Component
public class MyAuthInterceptor extends HandlerInterceptorAdapter {
    Logger log = LoggerFactory.getLogger(MyAuthInterceptor.class);
    @Autowired
    UserService userService;
    @Autowired
    TokenService tokenService;
    @Autowired
    ExcludeUrlsProperties excludeUrlsProperties;

    @Autowired
    AntPathMatcher antPathMatcher;

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
            Object object) throws Exception {
        String token = httpServletRequest.getHeader("token");// 从 http 请求头中取出 token
        // 检查有没有需要用户权限的注解
        if (needToken(httpServletRequest)) {
            // 执行认证
            if (token == null) {
                throw new RuntimeException("无token，请重新登录");
            }
            // 验证 token
            JWTVerifier jwtVerifier = JWT.require(Algorithm.HMAC256(tokenService.getTokenSecret())).build();
            try {
                jwtVerifier.verify(token);
            } catch (JWTVerificationException e) {
                throw new RuntimeException("401");
            }
            // 获取 token 中的 user id
            Long userId;
            try {
                userId = Long.valueOf(JWT.decode(token).getAudience().get(0));
            } catch (JWTDecodeException j) {
                throw new RuntimeException("401");
            }
            log.info("success checked token for {} ",userId);
            return true;
        }
        return true;

    }

    private boolean needToken(HttpServletRequest httpServletRequest) {
        String requestURI = httpServletRequest.getRequestURI();
        for(String url : excludeUrlsProperties.getTokenValidationUrls()) {
            if (antPathMatcher.match(url, requestURI)) {
                return false;
            }
        }
        return true;
    }
}