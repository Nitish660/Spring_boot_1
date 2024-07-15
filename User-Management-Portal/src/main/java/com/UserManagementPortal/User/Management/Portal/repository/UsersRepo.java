package com.UserManagementPortal.User.Management.Portal.repository;

import com.UserManagementPortal.User.Management.Portal.entity.OurUsers;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepo extends JpaRepository<OurUsers,Integer> {
    Optional<OurUsers> findByEmail(String email);


}
