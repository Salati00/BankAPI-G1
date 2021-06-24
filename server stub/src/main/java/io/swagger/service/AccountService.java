package io.swagger.service;

import io.swagger.api.ApiException;
import io.swagger.model.Account;
import io.swagger.repository.AccountRepository;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    private AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }


    public void createAccount(Account body) {
        accountRepository.save(body);
    }

    public Account getAccountByIban(String iban){

      return accountRepository.findById(iban).orElseThrow(IllegalArgumentException::new);
    }

    public void deleteAccount(String iban) throws ApiException {

            Account account = accountRepository.findById(iban).orElseThrow(IllegalArgumentException::new);
            if (account.getBalance() == null){
                throw new ApiException(405, "This account still has money in it, and can't be deleted");
            }else accountRepository.delete(account);
    }

}
