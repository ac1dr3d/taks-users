package com.task.users.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.task.users.model.ERole;
import com.task.users.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}