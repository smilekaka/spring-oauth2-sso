package com.learning.springoauth2.sso.service.impl;

import com.learning.springoauth2.sso.dao.UserDao;
import com.learning.springoauth2.sso.domain.SysUser;
import com.learning.springoauth2.sso.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public SysUser getUserByName(String username) {
        return userDao.selectByName(username);
    }
}
