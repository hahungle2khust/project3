package com.hung.soict.products.repository;

import com.hung.soict.products.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Users, Integer> {

}
