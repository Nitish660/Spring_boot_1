package com.firstProject.banking_app.service;

import com.firstProject.banking_app.dto.AccountDto;
import com.firstProject.banking_app.entity.Account;


public interface AccountService {

    Account createAccount(AccountDto accountDto);
}
