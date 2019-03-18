package com.hoc.motobox.service;

import javax.persistence.EntityExistsException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import com.hoc.motobox.entity.Role;
import com.hoc.motobox.entity.User;
import com.hoc.motobox.repository.RoleRepository;
import com.hoc.motobox.repository.UserRepository;
import com.hoc.motobox.utils.SuperRestService;

@Service
public class UserService extends InitialDataLoader implements SuperRestService<User> {

	private static final Logger LOGGER = LogManager.getLogger(User.class);
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private RoleRepository roleReposytory;

	@Override
	public JpaRepository<User, Long> getDao() {
		return userRepository;
	}

	public UserService(UserRepository userRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
		this.userRepository = userRepository;
		this.bCryptPasswordEncoder = bCryptPasswordEncoder;
	}

	@Override
	public User save(User user) throws EntityExistsException {
		LOGGER.debug("create user {}", user);

		if (emailExists(user.getEmail())) {
			throw new EntityExistsException("There is an account with that email adress: " + user.getEmail());
		}
		User createUser = new User();


        createUser.setEmail(user.getEmail());
        createUser.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        createUser.setFirstName(user.getFirstName());
        createUser.setLastName(user.getLastName());
        createUser.setPhone(user.getPhone());
        createUser.setAddress(user.getAddress());
        
        Role userRole;
        if (user.getRole() != null) {
        	userRole = roleReposytory.findByName(user.getRole().getName());
        } else {
        	userRole = roleReposytory.findByName("USER");
        }
        createUser.setRole(userRole);

		return userRepository.save(createUser);

	}

	private boolean emailExists(final String email) {
		return userRepository.findByEmail(email) != null;
	}
	
	
}
