package com.accenture.PocVivoPublishEventBilling.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.Objects;

/**
 * The event data structure
 */
@ApiModel(description = "The event data structure")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-11-06T21:16:01.493Z")


public class FinancialAccountAttributeValueChangeEventPayload   {
  @JsonProperty("financialAccount")
  private FinancialAccount financialAccount = null;

  public FinancialAccountAttributeValueChangeEventPayload financialAccount(FinancialAccount financialAccount) {
    this.financialAccount = financialAccount;
    return this;
  }

  /**
   * The involved resource data for the event
   * @return financialAccount
  **/
  @ApiModelProperty(value = "The involved resource data for the event")

  @Valid

  public FinancialAccount getFinancialAccount() {
    return financialAccount;
  }

  public void setFinancialAccount(FinancialAccount financialAccount) {
    this.financialAccount = financialAccount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FinancialAccountAttributeValueChangeEventPayload financialAccountAttributeValueChangeEventPayload = (FinancialAccountAttributeValueChangeEventPayload) o;
    return Objects.equals(this.financialAccount, financialAccountAttributeValueChangeEventPayload.financialAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(financialAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinancialAccountAttributeValueChangeEventPayload {\n");
    
    sb.append("    financialAccount: ").append(toIndentedString(financialAccount)).append("\n");
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

