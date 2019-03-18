package com.hoc.motobox.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Service;

import com.hoc.motobox.entity.Role;
import com.hoc.motobox.repository.RoleRepository;

@Service
public class InitialDataLoader implements ApplicationListener<ContextRefreshedEvent> {

    boolean alreadySetup = false;

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        if (alreadySetup) {
            return;
        }
        createRoleIfNotFound("JUNKYARD");
        createRoleIfNotFound("USER");
        alreadySetup = true;

    }

    @Transactional
    private Role createRoleIfNotFound(String name) {
        Role role = roleRepository.findByName(name);
        if (role == null) {
            role = new Role();
            role.setName(name);
            roleRepository.save(role);
        }
        return role;
    }
}
