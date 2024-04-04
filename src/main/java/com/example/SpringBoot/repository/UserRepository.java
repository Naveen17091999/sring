package com.example.SpringBoot.repository;

import com.example.SpringBoot.model.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserDetails, Integer> {
}
