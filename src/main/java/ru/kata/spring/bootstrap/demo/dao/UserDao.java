package ru.kata.spring.bootstrap.demo.dao;

import ru.kata.spring.bootstrap.demo.model.User;

import java.util.List;

public interface UserDao {
    public List<User> getAllUsers();

    public User getUserByUsername(String username);

    public User getUser(Long id);

    public void save(User user);

    public void update(Long id, User updatedUser);

    public void delete(Long id);
}
