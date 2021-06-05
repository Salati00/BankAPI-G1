package io.swagger.service;


import io.swagger.api.ApiException;
import io.swagger.model.Account;
import io.swagger.model.User;
import io.swagger.repository.AccountRepository;
import io.swagger.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    private AccountRepository accountRepository;


    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public List<Account> getAccountsByIban(String iban) throws ApiException {
        return accountRepository.getAccountsIban(iban);
    }

    public void createAccount(Account body) {
            accountRepository.save(body);
    }


    public void deleteAccount(String iban) throws ApiException {

            Account account = accountRepository.findById(iban).orElseThrow(IllegalArgumentException::new);
            if (account.getBalance() != null){
                throw new ApiException(405, "This account still has money in it, and can't be deleted");
            }else accountRepository.delete(account);
        }
    }



