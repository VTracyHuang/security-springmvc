package com.tracy.security.service;

import com.tracy.security.model.AuthenticationRequest;
import com.tracy.security.model.UserDto;

/**
 * 功能描述：
 *
 * @Author Tracy
 * @Date 2020/5/7 16:13
 */
public interface AuthenticationService {

    /**
     * 实现功能描述: 用户认证
     *
     * @param authenticationRequest 用户认证请求，账号和密码
     * @return UserDto 认证成功后的用户信息
     */
    UserDto authentication(AuthenticationRequest authenticationRequest);
}
