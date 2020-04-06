package io.mycat.myweb.core.rest;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import javax.json.Json;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import io.mycat.dao.bean.RestResult;
import io.mycat.myweb.core.domain.User;
import io.mycat.myweb.core.service.TokenService;
import io.mycat.myweb.core.service.UserService;
import io.mycat.myweb.core.util.TokenUtil;

@RestController
public class UserController {
	@Autowired
	UserService userService;
	@Autowired
	TokenService tokenService;

	// 登录
	@PostMapping("/login")
	public RestResult login(User user) {
		RestResult rest = new RestResult();
		Optional<User> userForBase = userService.findByUserName(user.getName());
		User dbuser = userForBase.get();
		if (dbuser == null) {
			rest.data = Json.createValue("登录失败,用户不存在");
			rest.retCode = 410;
			return rest;
		} else {
			if (!dbuser.getPassword().equals(user.getPassword())) {
				rest.data = Json.createValue("登录失败,密码错误");
				rest.retCode = 411;
				return rest;
			} else {
				String token = tokenService.getToken(dbuser);
				Map<String, Object> data = new HashMap<>();
				data.put("token", token);
				data.put("user", user.getName());
				rest.data = Json.createObjectBuilder(data).build();
				return rest;
			}
		}
	}

	@RequestMapping(value = "/getMessage", method = RequestMethod.GET)
	public String getMessage() {

		// 取出token中带的用户id 进行操作
		System.out.println(TokenUtil.getTokenUserId());

		return "您已通过验证";
	}
}