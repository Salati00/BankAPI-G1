package nl.inholland.first.BankingAPI.Service;


import nl.inholland.first.BankingAPI.Dao.AccountRepository;
import nl.inholland.first.BankingAPI.Dao.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private TransactionRepository transactionRepository;




}
