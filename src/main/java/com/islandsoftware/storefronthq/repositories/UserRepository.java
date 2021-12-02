package com.islandsoftware.storefronthq.repositories;

import com.islandsoftware.storefronthq.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    User findById(long id);

    List<User> findAll();
}
