package com.lpt.LoginSystem.services;

import com.lpt.LoginSystem.entities.ApplicationUser;
import com.lpt.LoginSystem.entities.Role;
import com.lpt.LoginSystem.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserService implements UserDetailsService {
    @Autowired
    private PasswordEncoder encoder;
    @Autowired
    private UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("In the user details service");
        return  userRepository.findUserByUsername(username).orElseThrow(() -> new UsernameNotFoundException("User is not valid"));
    }
}
