package com.example.gaiaapi.Repositories;

import com.example.gaiaapi.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
