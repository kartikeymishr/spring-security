package com.kartikeymishr.oauthserver.repository;

import com.kartikeymishr.oauthserver.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
