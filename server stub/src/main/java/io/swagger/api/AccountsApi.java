/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.25).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Account;
import java.math.BigDecimal;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-06-02T19:51:50.934Z[GMT]")
@Validated
public interface AccountsApi {

    @Operation(summary = "Create an Account", description = "This can only be done by the logged in user.", security = {
        @SecurityRequirement(name = "JWT-Token")    }, tags={ "Accounts" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "400", description = "operation failed"),
        
        @ApiResponse(responseCode = "404", description = "Account was not added") })
    @RequestMapping(value = "/Accounts",
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> createcurrentaccount(@Parameter(in = ParameterIn.DEFAULT, description = "Created account object", required=true, schema=@Schema()) @Valid @RequestBody Account body);


    @Operation(summary = "Delete account", description = "", security = {
        @SecurityRequirement(name = "JWT-Token")    }, tags={ "Accounts" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        
        @ApiResponse(responseCode = "404", description = "ID not found") })
    @RequestMapping(value = "/Accounts/{iban}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteaccount(@Parameter(in = ParameterIn.PATH, description = "The ID of the account that needs to be deleted", required=true, schema=@Schema()) @PathVariable("iban") String iban) throws ApiException;


    @Operation(summary = "Deposits money", description = "Deposits money into logged in account", security = {
        @SecurityRequirement(name = "JWT-Token")    }, tags={ "Accounts" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Money deposited"),
        
        @ApiResponse(responseCode = "400", description = "Error in the transaction"),
        
        @ApiResponse(responseCode = "403", description = "Error: unauthorized") })
    @RequestMapping(value = "/Accounts/Deposit",
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> depositMoney(@Parameter(in = ParameterIn.DEFAULT, description = "Amount of money to deposit", schema=@Schema()) @Valid @RequestBody BigDecimal body);


    @Operation(summary = "Find Account by Iban", description = "Returns a single Account", security = {
        @SecurityRequirement(name = "JWT-Token")    }, tags={ "Accounts" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = Account.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid Iban supplied") })
    @RequestMapping(value = "/Accounts/{Iban}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Account> getAccountByIban(@Parameter(in = ParameterIn.PATH, description = "Iban of account to return", required=true, schema=@Schema()) @PathVariable("Iban") String iban);


    @Operation(summary = "Update an existing account", description = "", security = {
        @SecurityRequirement(name = "JWT-Token")    }, tags={ "Accounts" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "404", description = "Account not found"),
        
        @ApiResponse(responseCode = "405", description = "Validation exception") })
    @RequestMapping(value = "/Accounts",
        consumes = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Void> updateAccount(@Parameter(in = ParameterIn.DEFAULT, description = "Updating an existing account", required=true, schema=@Schema()) @Valid @RequestBody Account body);


    @Operation(summary = "Withdraws money", description = "Withdraws money from logged in account", security = {
        @SecurityRequirement(name = "JWT-Token")    }, tags={ "Accounts" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Money Withdrawn"),
        
        @ApiResponse(responseCode = "400", description = "Error in the transaction"),
        
        @ApiResponse(responseCode = "403", description = "Error: unauthorized") })
    @RequestMapping(value = "/Accounts/Witdraw",
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> withdrawMoney(@Parameter(in = ParameterIn.DEFAULT, description = "Amount of money to withdraw", schema=@Schema()) @Valid @RequestBody BigDecimal body);

}

