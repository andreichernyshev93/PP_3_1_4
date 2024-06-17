package ru.kata.spring.bootstrap.demo.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import ru.kata.spring.bootstrap.demo.model.User;

import java.util.List;

public interface UserService extends UserDetailsService {
    public List<User> getAllUsers();

    public User getUserByUsername(String username);

    public User getUser(Long id);

    public void save(User user);

    public void update(Long id, User updatedUser);

    public void delete(Long id);
}
