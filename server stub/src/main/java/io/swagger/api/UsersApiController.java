package io.swagger.api;

import io.swagger.model.User;
import com.fasterxml.jackson.databind.ObjectMapper;
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
public class UsersApiController implements UsersApi {

    private static final Logger log = LoggerFactory.getLogger(UsersApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public UsersApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<User>> editUser(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") Integer id,@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody User body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<User>>(objectMapper.readValue("[ {\n  \"Transactionlimit\" : 10000,\n  \"Role\" : \"User\",\n  \"firstName\" : \"John\",\n  \"lastName\" : \"Doe\",\n  \"phone\" : \"0612345678\",\n  \"id\" : 123,\n  \"email\" : \"JohnDoe123@hotmail.com\",\n  \"username\" : \"JohnDoe123\"\n}, {\n  \"Transactionlimit\" : 10000,\n  \"Role\" : \"User\",\n  \"firstName\" : \"John\",\n  \"lastName\" : \"Doe\",\n  \"phone\" : \"0612345678\",\n  \"id\" : 123,\n  \"email\" : \"JohnDoe123@hotmail.com\",\n  \"username\" : \"JohnDoe123\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<User>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<User>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<User>> findAllUsers(@Parameter(in = ParameterIn.QUERY, description = "amount of transactions to return" ,schema=@Schema()) @Valid @RequestParam(value = "count", required = false) Integer count,@Parameter(in = ParameterIn.QUERY, description = "search by surname" ,schema=@Schema()) @Valid @RequestParam(value = "surname", required = false) String surname,@Parameter(in = ParameterIn.QUERY, description = "search by account number" ,schema=@Schema()) @Valid @RequestParam(value = "Account number", required = false) String accountNumber) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<User>>(objectMapper.readValue("[ {\n  \"Transactionlimit\" : 10000,\n  \"Role\" : \"User\",\n  \"firstName\" : \"John\",\n  \"lastName\" : \"Doe\",\n  \"phone\" : \"0612345678\",\n  \"id\" : 123,\n  \"email\" : \"JohnDoe123@hotmail.com\",\n  \"username\" : \"JohnDoe123\"\n}, {\n  \"Transactionlimit\" : 10000,\n  \"Role\" : \"User\",\n  \"firstName\" : \"John\",\n  \"lastName\" : \"Doe\",\n  \"phone\" : \"0612345678\",\n  \"id\" : 123,\n  \"email\" : \"JohnDoe123@hotmail.com\",\n  \"username\" : \"JohnDoe123\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<User>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<User>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<User>> getUserById(@Parameter(in = ParameterIn.PATH, description = "user id", required=true, schema=@Schema()) @PathVariable("id") Integer id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<User>>(objectMapper.readValue("[ {\n  \"Transactionlimit\" : 10000,\n  \"Role\" : \"User\",\n  \"firstName\" : \"John\",\n  \"lastName\" : \"Doe\",\n  \"phone\" : \"0612345678\",\n  \"id\" : 123,\n  \"email\" : \"JohnDoe123@hotmail.com\",\n  \"username\" : \"JohnDoe123\"\n}, {\n  \"Transactionlimit\" : 10000,\n  \"Role\" : \"User\",\n  \"firstName\" : \"John\",\n  \"lastName\" : \"Doe\",\n  \"phone\" : \"0612345678\",\n  \"id\" : 123,\n  \"email\" : \"JohnDoe123@hotmail.com\",\n  \"username\" : \"JohnDoe123\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<User>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<User>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> registerUser(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody User body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
