package com.tracy.security.model;

/**
 * 功能描述：
 *
 * @Author Tracy
 * @Date 2020/5/7 16:16
 */
public class AuthenticationRequest {


    private String username;

    private String password;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
