package com.hung.soict.user.repository;

import com.hung.soict.user.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Users, Integer> {

}
