package com.thoughtworks.repository;

import com.thoughtworks.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByName(String username);

    User findByNameAndPassword(String name, String password);
}
