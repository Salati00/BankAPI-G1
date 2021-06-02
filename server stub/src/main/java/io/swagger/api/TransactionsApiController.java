package io.swagger.api;

import io.swagger.model.Transaction;
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
public class TransactionsApiController implements TransactionsApi {

    private static final Logger log = LoggerFactory.getLogger(TransactionsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public TransactionsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Transaction> getTransferById(@Parameter(in = ParameterIn.PATH, description = "Numeric id of the transaction to get", required=true, schema=@Schema()) @PathVariable("id") Integer id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Transaction>(objectMapper.readValue("{\n  \"Amount\" : 123.45,\n  \"To\" : \"NL91 ABNA 0417 1643 00\",\n  \"From\" : \"NL91 ABNA 0417 1643 00\",\n  \"Date\" : \"01/01/2000\"\n}", Transaction.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Transaction>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Transaction>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Transaction>> getTransfers(@Parameter(in = ParameterIn.QUERY, description = "amount of transactions to return" ,schema=@Schema()) @Valid @RequestParam(value = "count", required = false) Integer count,@Parameter(in = ParameterIn.QUERY, description = "iban of account whose transactions to retrieve" ,schema=@Schema()) @Valid @RequestParam(value = "iban", required = false) String iban,@Parameter(in = ParameterIn.QUERY, description = "date of transaction to return from which to start" ,schema=@Schema()) @Valid @RequestParam(value = "startDate", required = false) String startDate,@Parameter(in = ParameterIn.QUERY, description = "final date of transaction to return" ,schema=@Schema()) @Valid @RequestParam(value = "endDate", required = false) String endDate) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Transaction>>(objectMapper.readValue("[ {\n  \"Amount\" : 123.45,\n  \"To\" : \"NL91 ABNA 0417 1643 00\",\n  \"From\" : \"NL91 ABNA 0417 1643 00\",\n  \"Date\" : \"01/01/2000\"\n}, {\n  \"Amount\" : 123.45,\n  \"To\" : \"NL91 ABNA 0417 1643 00\",\n  \"From\" : \"NL91 ABNA 0417 1643 00\",\n  \"Date\" : \"01/01/2000\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Transaction>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Transaction>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Transaction>> transferMoney(@Parameter(in = ParameterIn.DEFAULT, description = "Amount of money to deposit", schema=@Schema()) @Valid @RequestBody Transaction body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Transaction>>(objectMapper.readValue("[ {\n  \"Amount\" : 123.45,\n  \"To\" : \"NL91 ABNA 0417 1643 00\",\n  \"From\" : \"NL91 ABNA 0417 1643 00\",\n  \"Date\" : \"01/01/2000\"\n}, {\n  \"Amount\" : 123.45,\n  \"To\" : \"NL91 ABNA 0417 1643 00\",\n  \"From\" : \"NL91 ABNA 0417 1643 00\",\n  \"Date\" : \"01/01/2000\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Transaction>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Transaction>>(HttpStatus.NOT_IMPLEMENTED);
    }

}
