package io.exiled.psb.dao;

import io.exiled.psb.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {
    /**
     * Method for getting user by username
     *
     * @param username - username to look for in database
     * @return specific User from database
     */
    User findByUsername(String username);
}
