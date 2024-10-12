package com.task.users.repository;

import com.task.users.model.User;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.lang.NonNull;
import org.springframework.security.access.prepost.PreAuthorize;

import java.util.Optional;

@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UserRepository extends CrudRepository<User, Long> {

    // CREATE/UPDATE
    // @Override
    // @PreAuthorize("hasRole('ADMIN') or hasRole('MODERATOR')")
    // <S extends User> S save(S entity);

    //READ - Find by ID
    @Override
    @PreAuthorize("hasRole('ADMIN') or hasRole('USER') or hasRole('MODERATOR')")
    @NonNull
    Optional<User> findById(Long id);

    // READ - Find all
    @Override
    @PreAuthorize("hasRole('ADMIN') or hasRole('USER') or hasRole('MODERATOR')")
    @NonNull
    Iterable<User> findAll();

    // READ - Find all by IDs
    @Override
    @PreAuthorize("hasRole('ADMIN') or hasRole('USER') or hasRole('MODERATOR')")
    @NonNull
    Iterable<User> findAllById(@NonNull Iterable<Long> ids);

    // DELETE by entity
    @Override
    @PreAuthorize("hasRole('ADMIN')")
    void delete(User entity);

    // DELETE by ID
    @Override
    @PreAuthorize("hasRole('ADMIN')")
    void deleteById(Long id);

    // DELETE all
    @Override
    @PreAuthorize("hasRole('ADMIN')")
    void deleteAll();

    // DELETE all by iterable
    @Override
    @PreAuthorize("hasRole('ADMIN')")
    void deleteAll(Iterable<? extends User> entities);

    // COUNT
    @Override
    @PreAuthorize("hasRole('ADMIN')")
    long count();

    Optional<User> findByUsername(String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);
}
