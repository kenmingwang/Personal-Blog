package com.nek.blog.service;

import com.nek.blog.po.User;

public interface UserService {
    User checkUser(String username, String password);

}
