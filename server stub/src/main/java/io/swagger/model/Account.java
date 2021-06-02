package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.AccountType;
import io.swagger.model.User;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Account
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-06-02T19:51:50.934Z[GMT]")


public class Account   {
  @JsonProperty("iban")
  private String iban = null;

  @JsonProperty("balance")
  private BigDecimal balance = null;

  @JsonProperty("dailylimit")
  private BigDecimal dailylimit = null;

  @JsonProperty("Absolutelimit")
  private BigDecimal absolutelimit = null;

  @JsonProperty("AccountType")
  private AccountType accountType = null;

  @JsonProperty("User")
  private User user = null;

  public Account iban(String iban) {
    this.iban = iban;
    return this;
  }

  /**
   * Get iban
   * @return iban
   **/
  @Schema(example = "NL91 ABNA 0417 1643 00", description = "")
  
    public String getIban() {
    return iban;
  }

  public void setIban(String iban) {
    this.iban = iban;
  }

  public Account balance(BigDecimal balance) {
    this.balance = balance;
    return this;
  }

  /**
   * Get balance
   * @return balance
   **/
  @Schema(example = "5000", required = true, description = "")
      @NotNull

    @Valid
    public BigDecimal getBalance() {
    return balance;
  }

  public void setBalance(BigDecimal balance) {
    this.balance = balance;
  }

  public Account dailylimit(BigDecimal dailylimit) {
    this.dailylimit = dailylimit;
    return this;
  }

  /**
   * Get dailylimit
   * @return dailylimit
   **/
  @Schema(example = "10000", required = true, description = "")
      @NotNull

    @Valid
    public BigDecimal getDailylimit() {
    return dailylimit;
  }

  public void setDailylimit(BigDecimal dailylimit) {
    this.dailylimit = dailylimit;
  }

  public Account absolutelimit(BigDecimal absolutelimit) {
    this.absolutelimit = absolutelimit;
    return this;
  }

  /**
   * Get absolutelimit
   * @return absolutelimit
   **/
  @Schema(example = "0", required = true, description = "")
      @NotNull

    @Valid
    public BigDecimal getAbsolutelimit() {
    return absolutelimit;
  }

  public void setAbsolutelimit(BigDecimal absolutelimit) {
    this.absolutelimit = absolutelimit;
  }

  public Account accountType(AccountType accountType) {
    this.accountType = accountType;
    return this;
  }

  /**
   * Get accountType
   * @return accountType
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public AccountType getAccountType() {
    return accountType;
  }

  public void setAccountType(AccountType accountType) {
    this.accountType = accountType;
  }

  public Account user(User user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
   **/
  @Schema(description = "")
  
    @Valid
    public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Account account = (Account) o;
    return Objects.equals(this.iban, account.iban) &&
        Objects.equals(this.balance, account.balance) &&
        Objects.equals(this.dailylimit, account.dailylimit) &&
        Objects.equals(this.absolutelimit, account.absolutelimit) &&
        Objects.equals(this.accountType, account.accountType) &&
        Objects.equals(this.user, account.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iban, balance, dailylimit, absolutelimit, accountType, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    dailylimit: ").append(toIndentedString(dailylimit)).append("\n");
    sb.append("    absolutelimit: ").append(toIndentedString(absolutelimit)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
