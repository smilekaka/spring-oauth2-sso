package com.learning.springoauth2.sso.service;


import com.learning.springoauth2.sso.domain.SysUser;

public interface UserService {

    /**
     * 根据用户名获取系统用户
     */
    SysUser getUserByName(String username);

}
