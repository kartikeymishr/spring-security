package com.kartikeymishr.springsecurityclient.repository;

import com.kartikeymishr.springsecurityclient.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
