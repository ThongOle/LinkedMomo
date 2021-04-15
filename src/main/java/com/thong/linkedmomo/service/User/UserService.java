package com.thong.linkedmomo.service.User;

import com.thong.linkedmomo.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User findByUserName(String userName);
}
