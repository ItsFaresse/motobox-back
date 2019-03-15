package com.hoc.motobox.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hoc.motobox.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
