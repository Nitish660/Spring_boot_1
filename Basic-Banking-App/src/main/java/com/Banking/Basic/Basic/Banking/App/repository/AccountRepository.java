package com.Banking.Basic.Basic.Banking.App.repository;

import com.Banking.Basic.Basic.Banking.App.entity.Account;
import org.aspectj.apache.bcel.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public  class AccountRepository extends JpaRepository<Account, Long> {
}