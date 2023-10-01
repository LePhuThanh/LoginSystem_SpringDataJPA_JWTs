package com.lpt.LoginSystem.repositories;

import com.lpt.LoginSystem.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@EnableJpaRepositories
public interface RoleRepository extends JpaRepository<Role, Integer> {
    Optional<Role> findRoleByAuthority(String authority);
}
