package ru.kata.spring.bootstrap.demo.dao;

import ru.kata.spring.bootstrap.demo.model.Role;

import java.util.List;

public interface RoleDao {

    public List<Role> getAllRoles();

    public List<Role> getRoleById(Long[] rolesId);

    public void addRole(Role role);
}
