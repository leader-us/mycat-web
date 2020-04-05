package io.mycat.myweb.core.service;
import java.util.Date;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import io.mycat.myweb.core.domain.User;

/***
 * 用户Token下发
 */
@Service
public class TokenService {
	@Value("${myapp.tokenSecret")
     String tokenSecret;

	public String getToken(User user) {
		Date start = new Date();
		// 互联网大部分应用默认一小时有效时间
		long currentTime = System.currentTimeMillis() + 60 * 60 * 1000;
		Date end = new Date(currentTime);
		String token = "";

		token = JWT.create().withAudience(user.getId() + "",user.getName()).withIssuedAt(start).withExpiresAt(end)
				.sign(Algorithm.HMAC256(getTokenSecret()));
		return token;
	}

	public String getTokenSecret() {
		return this.tokenSecret;
	}
}