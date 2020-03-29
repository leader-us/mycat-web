package io.mycat.myweb.core.domain;

import org.springframework.data.annotation.Id;

public class Account {
    @Id // 标记属性为主键
    private Long id;
    private String loginName;
    private String password;

    public Account(Long id, String loginName, String password) {
        this.id = id;
        this.loginName = loginName;
        this.password = password;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

	public Long getId() {
		return this.id;
	}

}