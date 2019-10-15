package com.mkyong.service;


import com.mkyong.entity.User;

public interface UserService {
    void save(User user);

    User findByUserName(String userName);

}
