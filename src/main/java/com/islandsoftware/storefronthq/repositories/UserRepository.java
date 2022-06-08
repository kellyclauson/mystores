package com.islandsoftware.storefronthq.repositories;

import com.islandsoftware.storefronthq.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserRepository extends JpaRepository<User, Integer> {

    //User findById(long id);

    List<User> findAll();

}
