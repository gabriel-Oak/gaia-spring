package com.example.gaiaapi.Repositories;

import com.example.gaiaapi.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}
