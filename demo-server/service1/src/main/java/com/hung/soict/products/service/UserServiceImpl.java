package com.hung.soict.products.service;

import com.hung.soict.products.entities.Users;
import com.hung.soict.products.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepo userRepo;

    @Override
    public List<Users> getListUsers() {
        return userRepo.findAll();
    }

    @Override
    public void saveUser(Users user) {
        userRepo.save(user);
    }

    @Override
    public Users getUserById(Integer uid) {
        return userRepo.findById(uid).get();
    }

    @Override
    public Users deleteUser(Integer uid) {
        userRepo.deleteById(uid);
        return null;
    }
}
