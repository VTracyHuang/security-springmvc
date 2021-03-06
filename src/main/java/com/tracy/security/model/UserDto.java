package com.tracy.security.model;

import java.util.Set;

/**
 * 功能描述：
 *
 * @Author Tracy
 * @Date 2020/5/7 16:15
 */
public class UserDto {
    //用户身份信息
    private String id;
    private String username;
    private String password;
    private String fullname;
    private String mobile;

    public static final String SESSION_USER_KEY = "_user";


    private Set<String> authorities;

    public UserDto() {

    }

    public UserDto(String id, String username, String password, String fullname, String mobile, Set<String> authorities) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.fullname = fullname;
        this.mobile = mobile;
        this.authorities = authorities;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Set<String> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Set<String> authorities) {
        this.authorities = authorities;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", fullname='" + fullname + '\'' +
                ", mobile='" + mobile + '\'' +
                ", authorities=" + authorities +
                '}';
    }
}
