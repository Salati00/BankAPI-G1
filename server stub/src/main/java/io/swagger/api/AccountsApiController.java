package io.swagger.api;

import io.swagger.model.Account;
import java.math.BigDecimal;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.service.AccountService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-06-02T19:51:50.934Z[GMT]")
@RestController
public class AccountsApiController implements AccountsApi {

    private static final Logger log = LoggerFactory.getLogger(AccountsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    private AccountService accountservice;


    @org.springframework.beans.factory.annotation.Autowired
    public AccountsApiController(ObjectMapper objectMapper, HttpServletRequest request , AccountService accountservice) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.accountservice = accountservice;
    }

    public ResponseEntity<Void> createcurrentaccount(@Parameter(in = ParameterIn.DEFAULT, description = "Created account object", required=true, schema=@Schema()) @Valid @RequestBody Account body) {
        String accept = request.getHeader("Accept");
        accountservice.createAccount(body);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteaccount(@Parameter(in = ParameterIn.PATH, description = "The ID of the account that needs to be deleted", required=true, schema=@Schema()) @PathVariable("iban") String iban) throws ApiException {
        String accept = request.getHeader("Accept");
        accountservice.deleteAccount(iban);
        return new ResponseEntity<Void>(HttpStatus.OK);

    }

    public ResponseEntity<Void> depositMoney(@Parameter(in = ParameterIn.DEFAULT, description = "Amount of money to deposit", schema=@Schema()) @Valid @RequestBody BigDecimal body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Account> getAccountByIban(@Parameter(in = ParameterIn.PATH, description = "Iban of account to return", required=true, schema=@Schema()) @PathVariable("Iban") String iban) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Account>(accountservice.getAccountByIban(iban),HttpStatus.OK);

    }

    public ResponseEntity<Void> updateAccount(@Parameter(in = ParameterIn.DEFAULT, description = "Updating an existing account", required=true, schema=@Schema()) @Valid @RequestBody Account body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> withdrawMoney(@Parameter(in = ParameterIn.DEFAULT, description = "Amount of money to withdraw", schema=@Schema()) @Valid @RequestBody BigDecimal body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
