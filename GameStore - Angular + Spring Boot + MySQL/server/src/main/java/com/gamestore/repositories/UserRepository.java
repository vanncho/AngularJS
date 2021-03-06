package com.gamestore.repositories;

import com.gamestore.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findOneByUsername(String username);

    @Query(value = "SELECT COUNT(1) FROM users", nativeQuery = true)
    int getUsersCount();
}
