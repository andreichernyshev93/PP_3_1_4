package ru.kata.spring.bootstrap.demo.service;

import ru.kata.spring.bootstrap.demo.model.Role;

import java.util.List;

public interface RoleService {
    public List<Role> getAllRoles();

    public List<Role> getRoleById(Long[] rolesId);

    public void addRole(Role role);
}
