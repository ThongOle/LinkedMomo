package com.thong.linkedmomo.service.User;

import com.thong.linkedmomo.entity.User;
import com.thong.linkedmomo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserImpl implements UserService{
    @Autowired
    UserRepository userRes;
    @Override
    public User findByUserName(String userName) {
        User user = userRes.findByUserName(userName);
        return user;
    }
}
