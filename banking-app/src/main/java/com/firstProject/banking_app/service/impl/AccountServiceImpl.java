package com.firstProject.banking_app.service.impl;

import com.firstProject.banking_app.dto.AccountDto;
import com.firstProject.banking_app.entity.Account;
import com.firstProject.banking_app.mapper.AccountMapper;
import com.firstProject.banking_app.repository.AccountRepository;
import com.firstProject.banking_app.service.AccountService;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    private AccountRepository accountRepository;



    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }
    @Override
    public Account createAccount(AccountDto accountDto) {
        Account account = AccountMapper.mapToAccount(accountDto);
        accountRepository.save(account);
        return AccountMapper.mapToAccountDto(savedAccount);
    }
}
