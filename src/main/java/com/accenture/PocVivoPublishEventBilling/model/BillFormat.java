package com.accenture.PocVivoPublishEventBilling.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * A detailed description of the way in which a bill is presented.
 */
@ApiModel(description = "A detailed description of the way in which a bill is presented.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-11-06T21:16:01.493Z")


public class BillFormat   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("@baseType")
  private String baseType = null;

  @JsonProperty("@schemaLocation")
  private String schemaLocation = null;

  @JsonProperty("@type")
  private String type = null;

  public BillFormat id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the bill format
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier of the bill format")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public BillFormat href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Reference of the bill format
   * @return href
  **/
  @ApiModelProperty(value = "Reference of the bill format")


  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public BillFormat description(String description) {
    this.description = description;
    return this;
  }

  /**
   * An explanatory text for this bill format
   * @return description
  **/
  @ApiModelProperty(value = "An explanatory text for this bill format")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BillFormat name(String name) {
    this.name = name;
    return this;
  }

  /**
   * A short descriptive name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "A short descriptive name")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BillFormat baseType(String baseType) {
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

  public BillFormat schemaLocation(String schemaLocation) {
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

  public BillFormat type(String type) {
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
    BillFormat billFormat = (BillFormat) o;
    return Objects.equals(this.id, billFormat.id) &&
        Objects.equals(this.href, billFormat.href) &&
        Objects.equals(this.description, billFormat.description) &&
        Objects.equals(this.name, billFormat.name) &&
        Objects.equals(this.baseType, billFormat.baseType) &&
        Objects.equals(this.schemaLocation, billFormat.schemaLocation) &&
        Objects.equals(this.type, billFormat.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, description, name, baseType, schemaLocation, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillFormat {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

