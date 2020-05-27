package com.patkadevelopment.Service;

import com.patkadevelopment.Model.User;

import java.util.List;

public interface UserService {

    User createUser(User user);

    void deleteUser(final Long userId);

    List<User> getUsers();

    User updateUser (User user);
    User getUser(Long userId);
}