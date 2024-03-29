package com.accenture.PocVivoPublishEventBilling.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Balances linked to the account
 */
@ApiModel(description = "Balances linked to the account")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-11-06T21:16:01.493Z")


public class AccountBalance   {
  @JsonProperty("balanceType")
  private String balanceType = null;

  @JsonProperty("amount")
  private Money amount = null;

  @JsonProperty("validFor")
  private TimePeriod validFor = null;

  @JsonProperty("@baseType")
  private String baseType = null;

  @JsonProperty("@schemaLocation")
  private String schemaLocation = null;

  @JsonProperty("@type")
  private String type = null;

  public AccountBalance balanceType(String balanceType) {
    this.balanceType = balanceType;
    return this;
  }

  /**
   * Type of the balance : deposit balance, disputed balance, loyalty balance, receivable balance...
   * @return balanceType
  **/
  @ApiModelProperty(required = true, value = "Type of the balance : deposit balance, disputed balance, loyalty balance, receivable balance...")
  @NotNull


  public String getBalanceType() {
    return balanceType;
  }

  public void setBalanceType(String balanceType) {
    this.balanceType = balanceType;
  }

  public AccountBalance amount(Money amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Balance amount
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "Balance amount")
  @NotNull

  @Valid

  public Money getAmount() {
    return amount;
  }

  public void setAmount(Money amount) {
    this.amount = amount;
  }

  public AccountBalance validFor(TimePeriod validFor) {
    this.validFor = validFor;
    return this;
  }

  /**
   * Balance validity period
   * @return validFor
  **/
  @ApiModelProperty(required = true, value = "Balance validity period")
  @NotNull

  @Valid

  public TimePeriod getValidFor() {
    return validFor;
  }

  public void setValidFor(TimePeriod validFor) {
    this.validFor = validFor;
  }

  public AccountBalance baseType(String baseType) {
    this.baseType = baseType;
    return this;
  }

  /**
   * When sub-classing, this defines the super-class
   * @return baseType
  **/
  @ApiModelProperty(value = "When sub-classing, this defines the super-class")


  public String getBaseType() {
    return baseType;
  }

  public void setBaseType(String baseType) {
    this.baseType = baseType;
  }

  public AccountBalance schemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
    return this;
  }

  /**
   * A URI to a JSON-Schema file that defines additional attributes and relationships
   * @return schemaLocation
  **/
  @ApiModelProperty(value = "A URI to a JSON-Schema file that defines additional attributes and relationships")


  public String getSchemaLocation() {
    return schemaLocation;
  }

  public void setSchemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
  }

  public AccountBalance type(String type) {
    this.type = type;
    return this;
  }

  /**
   * When sub-classing, this defines the sub-class entity name
   * @return type
  **/
  @ApiModelProperty(value = "When sub-classing, this defines the sub-class entity name")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountBalance accountBalance = (AccountBalance) o;
    return Objects.equals(this.balanceType, accountBalance.balanceType) &&
        Objects.equals(this.amount, accountBalance.amount) &&
        Objects.equals(this.validFor, accountBalance.validFor) &&
        Objects.equals(this.baseType, accountBalance.baseType) &&
        Objects.equals(this.schemaLocation, accountBalance.schemaLocation) &&
        Objects.equals(this.type, accountBalance.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balanceType, amount, validFor, baseType, schemaLocation, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountBalance {\n");
    
    sb.append("    balanceType: ").append(toIndentedString(balanceType)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

