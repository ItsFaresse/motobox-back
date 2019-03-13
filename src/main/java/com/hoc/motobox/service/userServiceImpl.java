package com.hoc.motobox.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.hoc.motobox.entity.User;
import com.hoc.motobox.repository.UserRepository;

@Service
public class userServiceImpl implements UserService {

    private static final Logger LOGGER = LogManager.getLogger(User.class);

    @Autowired
    private UserRepository userRepository;

    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public userServiceImpl(UserRepository userRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.userRepository = userRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @Override
    public User createUser(User user) {
        LOGGER.debug("create user = {}", user);
        User createUser = new User();
        createUser.setEmail(user.getEmail());
        createUser.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        createUser.setFirstName(user.getFirstName());
        createUser.setLastName(user.getLastName());
        createUser.setPhone(user.getPhone());
        createUser.setAddress(user.getAddress());

        return userRepository.save(createUser);

    }

}
