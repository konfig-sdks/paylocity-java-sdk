/*
 * WebLink API
 * For documentation about this API, please visit https://developer.paylocity.com/integrations/reference/weblink-overview
 *
 * The version of the OpenAPI document: v2
 * Contact: webservices@paylocity.com
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * NewStateTax
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class NewStateTax {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Double amount;

  public static final String SERIALIZED_NAME_EXEMPTIONS = "exemptions";
  @SerializedName(SERIALIZED_NAME_EXEMPTIONS)
  private Double exemptions;

  public static final String SERIALIZED_NAME_EXEMPTIONS2 = "exemptions2";
  @SerializedName(SERIALIZED_NAME_EXEMPTIONS2)
  private Double exemptions2;

  public static final String SERIALIZED_NAME_FILING_STATUS = "filingStatus";
  @SerializedName(SERIALIZED_NAME_FILING_STATUS)
  private String filingStatus;

  public static final String SERIALIZED_NAME_GROSS_WAGE_PERCENTAGE = "grossWagePercentage";
  @SerializedName(SERIALIZED_NAME_GROSS_WAGE_PERCENTAGE)
  private Double grossWagePercentage;

  public static final String SERIALIZED_NAME_PERCENTAGE = "percentage";
  @SerializedName(SERIALIZED_NAME_PERCENTAGE)
  private Double percentage;

  public static final String SERIALIZED_NAME_PRIMARY_TAX = "primaryTax";
  @SerializedName(SERIALIZED_NAME_PRIMARY_TAX)
  private Boolean primaryTax;

  public static final String SERIALIZED_NAME_RECIPROCAL = "reciprocal";
  @SerializedName(SERIALIZED_NAME_RECIPROCAL)
  private String reciprocal;

  public static final String SERIALIZED_NAME_SPECIAL_CHECK_CALC = "specialCheckCalc";
  @SerializedName(SERIALIZED_NAME_SPECIAL_CHECK_CALC)
  private String specialCheckCalc;

  public static final String SERIALIZED_NAME_TAX_CALC_CODE = "taxCalcCode";
  @SerializedName(SERIALIZED_NAME_TAX_CALC_CODE)
  private String taxCalcCode;

  public static final String SERIALIZED_NAME_T_CODE = "tCode";
  @SerializedName(SERIALIZED_NAME_T_CODE)
  private String tCode;

  public NewStateTax() {
  }

  public NewStateTax amount(Double amount) {
    
    
    
    
    this.amount = amount;
    return this;
  }

  public NewStateTax amount(Integer amount) {
    
    
    
    
    this.amount = amount.doubleValue();
    return this;
  }

   /**
   * State tax code.&lt;br  /&gt; Max length: 50
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "State tax code.<br  /> Max length: 50")

  public Double getAmount() {
    return amount;
  }


  public void setAmount(Double amount) {
    
    
    
    this.amount = amount;
  }


  public NewStateTax exemptions(Double exemptions) {
    
    
    
    
    this.exemptions = exemptions;
    return this;
  }

  public NewStateTax exemptions(Integer exemptions) {
    
    
    
    
    this.exemptions = exemptions.doubleValue();
    return this;
  }

   /**
   * State tax exemptions value.&lt;br  /&gt;Decimal (12,2)
   * @return exemptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "State tax exemptions value.<br  />Decimal (12,2)")

  public Double getExemptions() {
    return exemptions;
  }


  public void setExemptions(Double exemptions) {
    
    
    
    this.exemptions = exemptions;
  }


  public NewStateTax exemptions2(Double exemptions2) {
    
    
    
    
    this.exemptions2 = exemptions2;
    return this;
  }

  public NewStateTax exemptions2(Integer exemptions2) {
    
    
    
    
    this.exemptions2 = exemptions2.doubleValue();
    return this;
  }

   /**
   * State tax exemptions 2 value.&lt;br  /&gt;Decimal (12,2)
   * @return exemptions2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "State tax exemptions 2 value.<br  />Decimal (12,2)")

  public Double getExemptions2() {
    return exemptions2;
  }


  public void setExemptions2(Double exemptions2) {
    
    
    
    this.exemptions2 = exemptions2;
  }


  public NewStateTax filingStatus(String filingStatus) {
    
    
    
    
    this.filingStatus = filingStatus;
    return this;
  }

   /**
   * Employee state tax filing status. Common values are *S* (Single), *M* (Married).&lt;br  /&gt;Max length: 50
   * @return filingStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Employee state tax filing status. Common values are *S* (Single), *M* (Married).<br  />Max length: 50")

  public String getFilingStatus() {
    return filingStatus;
  }


  public void setFilingStatus(String filingStatus) {
    
    
    
    this.filingStatus = filingStatus;
  }


  public NewStateTax grossWagePercentage(Double grossWagePercentage) {
    
    
    
    
    this.grossWagePercentage = grossWagePercentage;
    return this;
  }

  public NewStateTax grossWagePercentage(Integer grossWagePercentage) {
    
    
    
    
    this.grossWagePercentage = grossWagePercentage.doubleValue();
    return this;
  }

   /**
   * Gross Wage Percentage value. &lt;br  /&gt;Decimal (12,2)
   * @return grossWagePercentage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Gross Wage Percentage value. <br  />Decimal (12,2)")

  public Double getGrossWagePercentage() {
    return grossWagePercentage;
  }


  public void setGrossWagePercentage(Double grossWagePercentage) {
    
    
    
    this.grossWagePercentage = grossWagePercentage;
  }


  public NewStateTax percentage(Double percentage) {
    
    
    
    
    this.percentage = percentage;
    return this;
  }

  public NewStateTax percentage(Integer percentage) {
    
    
    
    
    this.percentage = percentage.doubleValue();
    return this;
  }

   /**
   * State Tax percentage. &lt;br  /&gt;Decimal (12,2)
   * @return percentage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "State Tax percentage. <br  />Decimal (12,2)")

  public Double getPercentage() {
    return percentage;
  }


  public void setPercentage(Double percentage) {
    
    
    
    this.percentage = percentage;
  }


  public NewStateTax primaryTax(Boolean primaryTax) {
    
    
    
    
    this.primaryTax = primaryTax;
    return this;
  }

   /**
   * Indicates if primary tax.
   * @return primaryTax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates if primary tax.")

  public Boolean getPrimaryTax() {
    return primaryTax;
  }


  public void setPrimaryTax(Boolean primaryTax) {
    
    
    
    this.primaryTax = primaryTax;
  }


  public NewStateTax reciprocal(String reciprocal) {
    
    
    
    
    this.reciprocal = reciprocal;
    return this;
  }

   /**
   * Indicates if state tax is reciprocal.
   * @return reciprocal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates if state tax is reciprocal.")

  public String getReciprocal() {
    return reciprocal;
  }


  public void setReciprocal(String reciprocal) {
    
    
    
    this.reciprocal = reciprocal;
  }


  public NewStateTax specialCheckCalc(String specialCheckCalc) {
    
    
    
    
    this.specialCheckCalc = specialCheckCalc;
    return this;
  }

   /**
   * Supplemental check calculation code. Common values are *Blocked* (Taxes blocked on Supplemental checks), *Supp* (Use supplemental Tax Rate-Code). &lt;br  /&gt;Max length: 10
   * @return specialCheckCalc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Supplemental check calculation code. Common values are *Blocked* (Taxes blocked on Supplemental checks), *Supp* (Use supplemental Tax Rate-Code). <br  />Max length: 10")

  public String getSpecialCheckCalc() {
    return specialCheckCalc;
  }


  public void setSpecialCheckCalc(String specialCheckCalc) {
    
    
    
    this.specialCheckCalc = specialCheckCalc;
  }


  public NewStateTax taxCalcCode(String taxCalcCode) {
    
    
    
    
    this.taxCalcCode = taxCalcCode;
    return this;
  }

   /**
   * Tax calculation code. Common values are *F* (Flat), *P* (Percentage), *FDFP* (Flat Dollar Amount plus Fixed Percentage). &lt;br  /&gt;Max length: 10
   * @return taxCalcCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tax calculation code. Common values are *F* (Flat), *P* (Percentage), *FDFP* (Flat Dollar Amount plus Fixed Percentage). <br  />Max length: 10")

  public String getTaxCalcCode() {
    return taxCalcCode;
  }


  public void setTaxCalcCode(String taxCalcCode) {
    
    
    
    this.taxCalcCode = taxCalcCode;
  }


  public NewStateTax tCode(String tCode) {
    
    
    
    
    this.tCode = tCode;
    return this;
  }

   /**
   * State tax code.&lt;br  /&gt; Max length: 50
   * @return tCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "State tax code.<br  /> Max length: 50")

  public String gettCode() {
    return tCode;
  }


  public void settCode(String tCode) {
    
    
    
    this.tCode = tCode;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the NewStateTax instance itself
   */
  public NewStateTax putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewStateTax newStateTax = (NewStateTax) o;
    return Objects.equals(this.amount, newStateTax.amount) &&
        Objects.equals(this.exemptions, newStateTax.exemptions) &&
        Objects.equals(this.exemptions2, newStateTax.exemptions2) &&
        Objects.equals(this.filingStatus, newStateTax.filingStatus) &&
        Objects.equals(this.grossWagePercentage, newStateTax.grossWagePercentage) &&
        Objects.equals(this.percentage, newStateTax.percentage) &&
        Objects.equals(this.primaryTax, newStateTax.primaryTax) &&
        Objects.equals(this.reciprocal, newStateTax.reciprocal) &&
        Objects.equals(this.specialCheckCalc, newStateTax.specialCheckCalc) &&
        Objects.equals(this.taxCalcCode, newStateTax.taxCalcCode) &&
        Objects.equals(this.tCode, newStateTax.tCode)&&
        Objects.equals(this.additionalProperties, newStateTax.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, exemptions, exemptions2, filingStatus, grossWagePercentage, percentage, primaryTax, reciprocal, specialCheckCalc, taxCalcCode, tCode, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewStateTax {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    exemptions: ").append(toIndentedString(exemptions)).append("\n");
    sb.append("    exemptions2: ").append(toIndentedString(exemptions2)).append("\n");
    sb.append("    filingStatus: ").append(toIndentedString(filingStatus)).append("\n");
    sb.append("    grossWagePercentage: ").append(toIndentedString(grossWagePercentage)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    primaryTax: ").append(toIndentedString(primaryTax)).append("\n");
    sb.append("    reciprocal: ").append(toIndentedString(reciprocal)).append("\n");
    sb.append("    specialCheckCalc: ").append(toIndentedString(specialCheckCalc)).append("\n");
    sb.append("    taxCalcCode: ").append(toIndentedString(taxCalcCode)).append("\n");
    sb.append("    tCode: ").append(toIndentedString(tCode)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("amount");
    openapiFields.add("exemptions");
    openapiFields.add("exemptions2");
    openapiFields.add("filingStatus");
    openapiFields.add("grossWagePercentage");
    openapiFields.add("percentage");
    openapiFields.add("primaryTax");
    openapiFields.add("reciprocal");
    openapiFields.add("specialCheckCalc");
    openapiFields.add("taxCalcCode");
    openapiFields.add("tCode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to NewStateTax
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!NewStateTax.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NewStateTax is not found in the empty JSON string", NewStateTax.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("filingStatus") != null && !jsonObj.get("filingStatus").isJsonNull()) && !jsonObj.get("filingStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `filingStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("filingStatus").toString()));
      }
      if ((jsonObj.get("reciprocal") != null && !jsonObj.get("reciprocal").isJsonNull()) && !jsonObj.get("reciprocal").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reciprocal` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reciprocal").toString()));
      }
      if ((jsonObj.get("specialCheckCalc") != null && !jsonObj.get("specialCheckCalc").isJsonNull()) && !jsonObj.get("specialCheckCalc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `specialCheckCalc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("specialCheckCalc").toString()));
      }
      if ((jsonObj.get("taxCalcCode") != null && !jsonObj.get("taxCalcCode").isJsonNull()) && !jsonObj.get("taxCalcCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `taxCalcCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("taxCalcCode").toString()));
      }
      if ((jsonObj.get("tCode") != null && !jsonObj.get("tCode").isJsonNull()) && !jsonObj.get("tCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tCode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NewStateTax.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NewStateTax' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NewStateTax> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NewStateTax.class));

       return (TypeAdapter<T>) new TypeAdapter<NewStateTax>() {
           @Override
           public void write(JsonWriter out, NewStateTax value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public NewStateTax read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             NewStateTax instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NewStateTax given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NewStateTax
  * @throws IOException if the JSON string is invalid with respect to NewStateTax
  */
  public static NewStateTax fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NewStateTax.class);
  }

 /**
  * Convert an instance of NewStateTax to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

