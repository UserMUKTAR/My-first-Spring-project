package com.Muktar.banking.app.service;

import com.Muktar.banking.app.dto.AccountDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AccountService {
    AccountDto createAccount(AccountDto accountDto);

    AccountDto getAccountById(long id);

    AccountDto deposit(Long id, double amount);

    AccountDto withdraw(Long id, double amount);

    List<AccountDto> getAllAccounts();

    AccountDto deleteAccount(long id);
}
