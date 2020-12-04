package com.lifebeat.springbootvue.repositories;

import com.lifebeat.springbootvue.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}