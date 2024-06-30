package com.firstProject.banking_app.mapper;

import com.firstProject.banking_app.dto.AccountDto;
import com.firstProject.banking_app.entity.Account;

public class AccountMapper {

    public static Account mapToAccount(AccountDto accountDto) {
        return new Account(
                accountDto.getId(),
                accountDto.getAccountHolderName(),
                accountDto.getBalance()
        );
    }
    public static Account mapToAccountDto(Account account) {
        return new Account(
                account.getId(),
                account.getAccountHolderName(),
                account.getBalance()
        );
    }
}
