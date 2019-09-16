package com.igor.cnl.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.igor.cnl.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
}
