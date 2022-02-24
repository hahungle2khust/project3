package com.hung.soict.user.service;

import com.hung.soict.user.entities.Users;

import java.util.List;

public interface UserService {
    public List<Users> getListUsers();
    public void saveUser(Users user);
    public Users getUserById(Integer uid);
    public Users deleteUser(Integer uid);
}
