package com.firstProject.banking_app.controller;

import com.firstProject.banking_app.dto.AccountDto;
import com.firstProject.banking_app.entity.Account;
import com.firstProject.banking_app.service.AccountService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/accounts")

public class AccountController {

  private AccountService accountService;

  public AccountController(AccountService accountService) {
      this.accountService = accountService;

  }

  // Add Account Rest Api

    public ResponseEntity<AccountDto> addAccount(AccountDto accountDto) {
      return  new ResponseEntity<>(accountService.createAccount(accountDto), HttpStatus.CREATED);

    }

}
