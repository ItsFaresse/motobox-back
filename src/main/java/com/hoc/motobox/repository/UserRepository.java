package com.hoc.motobox.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hoc.motobox.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}
