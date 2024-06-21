package com.anjali.chatapp.Repository;

import com.anjali.chatapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
        User findByUsername(String username);
}

