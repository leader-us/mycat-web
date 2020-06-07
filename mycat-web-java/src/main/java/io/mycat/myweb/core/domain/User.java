package io.mycat.myweb.core.domain;

import org.springframework.data.annotation.Id;

public class User {
    @Id // 标记属性为主键
    private Long id;
    private String name;
    private String password;
    // 逗号分隔的角色列表
    private String roles;

    public User() {

    }

    public User(Long id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

}