package com.coderscampus.assignment14.service;

import com.coderscampus.assignment14.domain.User;
import com.coderscampus.assignment14.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private static Long id = 0L;

    @Autowired
    private UserRepository userRepository;

    public User createUser(String name) {
        User user = new User();
        user.setName(name);
        user.setId(id++);
        return userRepository.addUser(user);
    }
}
