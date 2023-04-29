package com.coderscampus.assignment14.repository;

import com.coderscampus.assignment14.domain.User;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

@Repository
public class UserRepository {
    private static Set<User> users = new HashSet<>();


    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public User addUser(User user) {

        users.add(user);
        return user;
    }
}
