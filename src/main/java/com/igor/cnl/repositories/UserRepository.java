package com.igor.cnl.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.igor.cnl.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
}
