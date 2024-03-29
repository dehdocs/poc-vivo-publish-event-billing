package com.accenture.PocVivoPublishEventBilling.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * BillingCycleSpecification reference. A description of when to initiate a billing cycle and the various sub steps of a billing cycle.
 */
@ApiModel(description = "BillingCycleSpecification reference. A description of when to initiate a billing cycle and the various sub steps of a billing cycle.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-11-06T21:16:01.493Z")


public class BillingCycleSpecificationRef   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("dateShift")
  private Integer dateShift = null;

  @JsonProperty("frequency")
  private String frequency = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("@baseType")
  private String baseType = null;

  @JsonProperty("@schemaLocation")
  private String schemaLocation = null;

  @JsonProperty("@type")
  private String type = null;

  @JsonProperty("@referredType")
  private String referredType = null;

  public BillingCycleSpecificationRef id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the billing cycle specification
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Unique identifier of the billing cycle specification")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public BillingCycleSpecificationRef href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Reference of the billing cycle specification
   * @return href
  **/
  @ApiModelProperty(value = "Reference of the billing cycle specification")


  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public BillingCycleSpecificationRef dateShift(Integer dateShift) {
    this.dateShift = dateShift;
    return this;
  }

  /**
   * An offset of a billing/settlement date. The offset is expressed as number of days with regard to the start of the billing/settlement period.
   * @return dateShift
  **/
  @ApiModelProperty(value = "An offset of a billing/settlement date. The offset is expressed as number of days with regard to the start of the billing/settlement period.")


  public Integer getDateShift() {
    return dateShift;
  }

  public void setDateShift(Integer dateShift) {
    this.dateShift = dateShift;
  }

  public BillingCycleSpecificationRef frequency(String frequency) {
    this.frequency = frequency;
    return this;
  }

  /**
   * Frequency of the billing cycle (monthly for instance)
   * @return frequency
  **/
  @ApiModelProperty(value = "Frequency of the billing cycle (monthly for instance)")


  public String getFrequency() {
    return frequency;
  }

  public void setFrequency(String frequency) {
    this.frequency = frequency;
  }

  public BillingCycleSpecificationRef name(String name) {
    this.name = name;
    return this;
  }

  /**
   * A short descriptive name
   * @return name
  **/
  @ApiModelProperty(value = "A short descriptive name")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BillingCycleSpecificationRef baseType(String baseType) {
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

  public BillingCycleSpecificationRef schemaLocation(String schemaLocation) {
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

  public BillingCycleSpecificationRef type(String type) {
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

  public BillingCycleSpecificationRef referredType(String referredType) {
    this.referredType = referredType;
    return this;
  }

  /**
   * The actual type of the target instance when needed for disambiguation.
   * @return referredType
  **/
  @ApiModelProperty(value = "The actual type of the target instance when needed for disambiguation.")


  public String getReferredType() {
    return referredType;
  }

  public void setReferredType(String referredType) {
    this.referredType = referredType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingCycleSpecificationRef billingCycleSpecificationRef = (BillingCycleSpecificationRef) o;
    return Objects.equals(this.id, billingCycleSpecificationRef.id) &&
        Objects.equals(this.href, billingCycleSpecificationRef.href) &&
        Objects.equals(this.dateShift, billingCycleSpecificationRef.dateShift) &&
        Objects.equals(this.frequency, billingCycleSpecificationRef.frequency) &&
        Objects.equals(this.name, billingCycleSpecificationRef.name) &&
        Objects.equals(this.baseType, billingCycleSpecificationRef.baseType) &&
        Objects.equals(this.schemaLocation, billingCycleSpecificationRef.schemaLocation) &&
        Objects.equals(this.type, billingCycleSpecificationRef.type) &&
        Objects.equals(this.referredType, billingCycleSpecificationRef.referredType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, dateShift, frequency, name, baseType, schemaLocation, type, referredType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingCycleSpecificationRef {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    dateShift: ").append(toIndentedString(dateShift)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    referredType: ").append(toIndentedString(referredType)).append("\n");
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

