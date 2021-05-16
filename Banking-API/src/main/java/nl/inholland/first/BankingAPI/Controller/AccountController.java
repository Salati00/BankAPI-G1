package nl.inholland.first.BankingAPI.Controller;

import nl.inholland.first.BankingAPI.Model.Iban;
import nl.inholland.first.BankingAPI.Service.AccountService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AccountController {

    private AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @RequestMapping(value = "{iban}", method = RequestMethod.GET , produces =  MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getAccountbyIban(@PathVariable Iban iban)
    {

    }
}
