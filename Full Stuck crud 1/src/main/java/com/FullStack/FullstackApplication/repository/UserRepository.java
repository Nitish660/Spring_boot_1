package com.FullStack.FullstackApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.FullStack.FullstackApplication.model.User; // Ensure correct import

public interface UserRepository extends JpaRepository<User, Long> {
    // Add custom query methods if needed
}
