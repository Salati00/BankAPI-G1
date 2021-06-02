/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.25).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.AuthToken;
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
public interface LoginApi {

    @Operation(summary = "Logs user in and gets auth key", description = "", security = {
        @SecurityRequirement(name = "JWT-Token")    }, tags={ "Users" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Authentication token", content = @Content(array = @ArraySchema(schema = @Schema(implementation = AuthToken.class)))),
        
        @ApiResponse(responseCode = "400", description = "Login failed, incorrect login/password.") })
    @RequestMapping(value = "/login",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<AuthToken>> loginUser(@NotNull @Parameter(in = ParameterIn.QUERY, description = "login name" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "username", required = true) String username, @NotNull @Parameter(in = ParameterIn.QUERY, description = "login password" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "password", required = true) String password);

}

