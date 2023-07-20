package io.matoshri.boot.service;

import io.matoshri.boot.entity.User;

import java.util.List;

public interface UserService {
    public User createNewUser(User user);
    public User updateUser(User user);
    public User getUserById(long userId);
    public User getUserByEmail(String email);
    public List<User> getAllUsers();
}
