package com.example.repository;

import com.example.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

public interface UserRepository extends JpaRepository<User,Long> {
    public User findByEmail(String username);

}
