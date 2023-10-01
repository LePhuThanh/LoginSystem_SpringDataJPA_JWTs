package com.lpt.LoginSystem.services;

import com.lpt.LoginSystem.entities.ApplicationUser;
import com.lpt.LoginSystem.entities.Role;
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
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("In the user details service");
        if (!username.equals("phuthanh")) throw new UsernameNotFoundException("Not phuthanh");

        Set<Role> roles = new HashSet<>();
        roles.add(new Role(1,"USER"));
        return new ApplicationUser(1,"phuthanh",encoder.encode("password"), roles);
    }
}
