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
 * The Non-Primary State Tax model
 */
@ApiModel(description = "The Non-Primary State Tax model")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class NonPrimaryStateTax {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Object amount;

  public static final String SERIALIZED_NAME_DEDUCTIONS_AMOUNT = "deductionsAmount";
  @SerializedName(SERIALIZED_NAME_DEDUCTIONS_AMOUNT)
  private Double deductionsAmount;

  public static final String SERIALIZED_NAME_DEPENDENTS_AMOUNT = "dependentsAmount";
  @SerializedName(SERIALIZED_NAME_DEPENDENTS_AMOUNT)
  private Double dependentsAmount;

  public static final String SERIALIZED_NAME_EXEMPTIONS = "exemptions";
  @SerializedName(SERIALIZED_NAME_EXEMPTIONS)
  private Object exemptions;

  public static final String SERIALIZED_NAME_EXEMPTIONS2 = "exemptions2";
  @SerializedName(SERIALIZED_NAME_EXEMPTIONS2)
  private Object exemptions2;

  public static final String SERIALIZED_NAME_FILING_STATUS = "filingStatus";
  @SerializedName(SERIALIZED_NAME_FILING_STATUS)
  private Object filingStatus;

  public static final String SERIALIZED_NAME_HIGHER_RATE = "higherRate";
  @SerializedName(SERIALIZED_NAME_HIGHER_RATE)
  private Boolean higherRate;

  public static final String SERIALIZED_NAME_OTHER_INCOME_AMOUNT = "otherIncomeAmount";
  @SerializedName(SERIALIZED_NAME_OTHER_INCOME_AMOUNT)
  private Double otherIncomeAmount;

  public static final String SERIALIZED_NAME_PERCENTAGE = "percentage";
  @SerializedName(SERIALIZED_NAME_PERCENTAGE)
  private Object percentage;

  public static final String SERIALIZED_NAME_RECIPROCITY_CODE = "reciprocityCode";
  @SerializedName(SERIALIZED_NAME_RECIPROCITY_CODE)
  private Object reciprocityCode;

  public static final String SERIALIZED_NAME_SPECIAL_CHECK_CALC = "specialCheckCalc";
  @SerializedName(SERIALIZED_NAME_SPECIAL_CHECK_CALC)
  private Object specialCheckCalc;

  public static final String SERIALIZED_NAME_TAX_CALCULATION_CODE = "taxCalculationCode";
  @SerializedName(SERIALIZED_NAME_TAX_CALCULATION_CODE)
  private Object taxCalculationCode;

  public static final String SERIALIZED_NAME_TAX_CODE = "taxCode";
  @SerializedName(SERIALIZED_NAME_TAX_CODE)
  private Object taxCode;

  public static final String SERIALIZED_NAME_W4_FORM_YEAR = "w4FormYear";
  @SerializedName(SERIALIZED_NAME_W4_FORM_YEAR)
  private Integer w4FormYear;

  public NonPrimaryStateTax() {
  }

  public NonPrimaryStateTax amount(Object amount) {
    
    
    
    
    this.amount = amount;
    return this;
  }

   /**
   * State tax code.&lt;br  /&gt; Max length: 50
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "State tax code.<br  /> Max length: 50")

  public Object getAmount() {
    return amount;
  }


  public void setAmount(Object amount) {
    
    
    
    this.amount = amount;
  }


  public NonPrimaryStateTax deductionsAmount(Double deductionsAmount) {
    
    
    
    
    this.deductionsAmount = deductionsAmount;
    return this;
  }

  public NonPrimaryStateTax deductionsAmount(Integer deductionsAmount) {
    
    
    
    
    this.deductionsAmount = deductionsAmount.doubleValue();
    return this;
  }

   /**
   * Box 4(b) on form W4 (year 2020 or later): Deductions amount. &lt;br  /&gt;Decimal (12,2)
   * @return deductionsAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Box 4(b) on form W4 (year 2020 or later): Deductions amount. <br  />Decimal (12,2)")

  public Double getDeductionsAmount() {
    return deductionsAmount;
  }


  public void setDeductionsAmount(Double deductionsAmount) {
    
    
    
    this.deductionsAmount = deductionsAmount;
  }


  public NonPrimaryStateTax dependentsAmount(Double dependentsAmount) {
    
    
    
    
    this.dependentsAmount = dependentsAmount;
    return this;
  }

  public NonPrimaryStateTax dependentsAmount(Integer dependentsAmount) {
    
    
    
    
    this.dependentsAmount = dependentsAmount.doubleValue();
    return this;
  }

   /**
   * Box 3 on form W4 (year 2020 or later): Total dependents amount. &lt;br  /&gt;Decimal (12,2)
   * @return dependentsAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Box 3 on form W4 (year 2020 or later): Total dependents amount. <br  />Decimal (12,2)")

  public Double getDependentsAmount() {
    return dependentsAmount;
  }


  public void setDependentsAmount(Double dependentsAmount) {
    
    
    
    this.dependentsAmount = dependentsAmount;
  }


  public NonPrimaryStateTax exemptions(Object exemptions) {
    
    
    
    
    this.exemptions = exemptions;
    return this;
  }

   /**
   * State tax exemptions value.&lt;br  /&gt;Decimal (12,2)
   * @return exemptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "State tax exemptions value.<br  />Decimal (12,2)")

  public Object getExemptions() {
    return exemptions;
  }


  public void setExemptions(Object exemptions) {
    
    
    
    this.exemptions = exemptions;
  }


  public NonPrimaryStateTax exemptions2(Object exemptions2) {
    
    
    
    
    this.exemptions2 = exemptions2;
    return this;
  }

   /**
   * State tax exemptions 2 value.&lt;br  /&gt;Decimal (12,2)
   * @return exemptions2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "State tax exemptions 2 value.<br  />Decimal (12,2)")

  public Object getExemptions2() {
    return exemptions2;
  }


  public void setExemptions2(Object exemptions2) {
    
    
    
    this.exemptions2 = exemptions2;
  }


  public NonPrimaryStateTax filingStatus(Object filingStatus) {
    
    
    
    
    this.filingStatus = filingStatus;
    return this;
  }

   /**
   * Employee state tax filing status. Common values are *S* (Single), *M* (Married).&lt;br  /&gt;Max length: 50
   * @return filingStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Employee state tax filing status. Common values are *S* (Single), *M* (Married).<br  />Max length: 50")

  public Object getFilingStatus() {
    return filingStatus;
  }


  public void setFilingStatus(Object filingStatus) {
    
    
    
    this.filingStatus = filingStatus;
  }


  public NonPrimaryStateTax higherRate(Boolean higherRate) {
    
    
    
    
    this.higherRate = higherRate;
    return this;
  }

   /**
   * Box 2(c) on form W4 (year 2020 or later): Multiple Jobs or Spouse Works. &lt;br  /&gt;Boolean
   * @return higherRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Box 2(c) on form W4 (year 2020 or later): Multiple Jobs or Spouse Works. <br  />Boolean")

  public Boolean getHigherRate() {
    return higherRate;
  }


  public void setHigherRate(Boolean higherRate) {
    
    
    
    this.higherRate = higherRate;
  }


  public NonPrimaryStateTax otherIncomeAmount(Double otherIncomeAmount) {
    
    
    
    
    this.otherIncomeAmount = otherIncomeAmount;
    return this;
  }

  public NonPrimaryStateTax otherIncomeAmount(Integer otherIncomeAmount) {
    
    
    
    
    this.otherIncomeAmount = otherIncomeAmount.doubleValue();
    return this;
  }

   /**
   * Box 4(a) on form W4 (year 2020 or later): Other income amount. &lt;br  /&gt;Decimal (12,2)
   * @return otherIncomeAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Box 4(a) on form W4 (year 2020 or later): Other income amount. <br  />Decimal (12,2)")

  public Double getOtherIncomeAmount() {
    return otherIncomeAmount;
  }


  public void setOtherIncomeAmount(Double otherIncomeAmount) {
    
    
    
    this.otherIncomeAmount = otherIncomeAmount;
  }


  public NonPrimaryStateTax percentage(Object percentage) {
    
    
    
    
    this.percentage = percentage;
    return this;
  }

   /**
   * State Tax percentage. &lt;br  /&gt;Decimal (12,2)
   * @return percentage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "State Tax percentage. <br  />Decimal (12,2)")

  public Object getPercentage() {
    return percentage;
  }


  public void setPercentage(Object percentage) {
    
    
    
    this.percentage = percentage;
  }


  public NonPrimaryStateTax reciprocityCode(Object reciprocityCode) {
    
    
    
    
    this.reciprocityCode = reciprocityCode;
    return this;
  }

   /**
   * Non-primary state tax reciprocity code.&lt;br  /&gt; Max length: 50
   * @return reciprocityCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Non-primary state tax reciprocity code.<br  /> Max length: 50")

  public Object getReciprocityCode() {
    return reciprocityCode;
  }


  public void setReciprocityCode(Object reciprocityCode) {
    
    
    
    this.reciprocityCode = reciprocityCode;
  }


  public NonPrimaryStateTax specialCheckCalc(Object specialCheckCalc) {
    
    
    
    
    this.specialCheckCalc = specialCheckCalc;
    return this;
  }

   /**
   * Supplemental check calculation code. Common values are *Blocked* (Taxes blocked on Supplemental checks), *Supp* (Use supplemental Tax Rate-Code). &lt;br  /&gt;Max length: 10
   * @return specialCheckCalc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Supplemental check calculation code. Common values are *Blocked* (Taxes blocked on Supplemental checks), *Supp* (Use supplemental Tax Rate-Code). <br  />Max length: 10")

  public Object getSpecialCheckCalc() {
    return specialCheckCalc;
  }


  public void setSpecialCheckCalc(Object specialCheckCalc) {
    
    
    
    this.specialCheckCalc = specialCheckCalc;
  }


  public NonPrimaryStateTax taxCalculationCode(Object taxCalculationCode) {
    
    
    
    
    this.taxCalculationCode = taxCalculationCode;
    return this;
  }

   /**
   * Tax calculation code. Common values are *F* (Flat), *P* (Percentage), *FDFP* (Flat Dollar Amount plus Fixed Percentage). &lt;br  /&gt;Max length: 10
   * @return taxCalculationCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tax calculation code. Common values are *F* (Flat), *P* (Percentage), *FDFP* (Flat Dollar Amount plus Fixed Percentage). <br  />Max length: 10")

  public Object getTaxCalculationCode() {
    return taxCalculationCode;
  }


  public void setTaxCalculationCode(Object taxCalculationCode) {
    
    
    
    this.taxCalculationCode = taxCalculationCode;
  }


  public NonPrimaryStateTax taxCode(Object taxCode) {
    
    
    
    
    this.taxCode = taxCode;
    return this;
  }

   /**
   * State tax code.&lt;br  /&gt; Max length: 50
   * @return taxCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "State tax code.<br  /> Max length: 50")

  public Object getTaxCode() {
    return taxCode;
  }


  public void setTaxCode(Object taxCode) {
    
    
    
    this.taxCode = taxCode;
  }


  public NonPrimaryStateTax w4FormYear(Integer w4FormYear) {
    
    
    
    
    this.w4FormYear = w4FormYear;
    return this;
  }

   /**
   * The state W4 form year &lt;br  /&gt;Integer
   * @return w4FormYear
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The state W4 form year <br  />Integer")

  public Integer getW4FormYear() {
    return w4FormYear;
  }


  public void setW4FormYear(Integer w4FormYear) {
    
    
    
    this.w4FormYear = w4FormYear;
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
   * @return the NonPrimaryStateTax instance itself
   */
  public NonPrimaryStateTax putAdditionalProperty(String key, Object value) {
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
    NonPrimaryStateTax nonPrimaryStateTax = (NonPrimaryStateTax) o;
    return Objects.equals(this.amount, nonPrimaryStateTax.amount) &&
        Objects.equals(this.deductionsAmount, nonPrimaryStateTax.deductionsAmount) &&
        Objects.equals(this.dependentsAmount, nonPrimaryStateTax.dependentsAmount) &&
        Objects.equals(this.exemptions, nonPrimaryStateTax.exemptions) &&
        Objects.equals(this.exemptions2, nonPrimaryStateTax.exemptions2) &&
        Objects.equals(this.filingStatus, nonPrimaryStateTax.filingStatus) &&
        Objects.equals(this.higherRate, nonPrimaryStateTax.higherRate) &&
        Objects.equals(this.otherIncomeAmount, nonPrimaryStateTax.otherIncomeAmount) &&
        Objects.equals(this.percentage, nonPrimaryStateTax.percentage) &&
        Objects.equals(this.reciprocityCode, nonPrimaryStateTax.reciprocityCode) &&
        Objects.equals(this.specialCheckCalc, nonPrimaryStateTax.specialCheckCalc) &&
        Objects.equals(this.taxCalculationCode, nonPrimaryStateTax.taxCalculationCode) &&
        Objects.equals(this.taxCode, nonPrimaryStateTax.taxCode) &&
        Objects.equals(this.w4FormYear, nonPrimaryStateTax.w4FormYear)&&
        Objects.equals(this.additionalProperties, nonPrimaryStateTax.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, deductionsAmount, dependentsAmount, exemptions, exemptions2, filingStatus, higherRate, otherIncomeAmount, percentage, reciprocityCode, specialCheckCalc, taxCalculationCode, taxCode, w4FormYear, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NonPrimaryStateTax {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    deductionsAmount: ").append(toIndentedString(deductionsAmount)).append("\n");
    sb.append("    dependentsAmount: ").append(toIndentedString(dependentsAmount)).append("\n");
    sb.append("    exemptions: ").append(toIndentedString(exemptions)).append("\n");
    sb.append("    exemptions2: ").append(toIndentedString(exemptions2)).append("\n");
    sb.append("    filingStatus: ").append(toIndentedString(filingStatus)).append("\n");
    sb.append("    higherRate: ").append(toIndentedString(higherRate)).append("\n");
    sb.append("    otherIncomeAmount: ").append(toIndentedString(otherIncomeAmount)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    reciprocityCode: ").append(toIndentedString(reciprocityCode)).append("\n");
    sb.append("    specialCheckCalc: ").append(toIndentedString(specialCheckCalc)).append("\n");
    sb.append("    taxCalculationCode: ").append(toIndentedString(taxCalculationCode)).append("\n");
    sb.append("    taxCode: ").append(toIndentedString(taxCode)).append("\n");
    sb.append("    w4FormYear: ").append(toIndentedString(w4FormYear)).append("\n");
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
    openapiFields.add("deductionsAmount");
    openapiFields.add("dependentsAmount");
    openapiFields.add("exemptions");
    openapiFields.add("exemptions2");
    openapiFields.add("filingStatus");
    openapiFields.add("higherRate");
    openapiFields.add("otherIncomeAmount");
    openapiFields.add("percentage");
    openapiFields.add("reciprocityCode");
    openapiFields.add("specialCheckCalc");
    openapiFields.add("taxCalculationCode");
    openapiFields.add("taxCode");
    openapiFields.add("w4FormYear");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to NonPrimaryStateTax
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!NonPrimaryStateTax.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NonPrimaryStateTax is not found in the empty JSON string", NonPrimaryStateTax.openapiRequiredFields.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NonPrimaryStateTax.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NonPrimaryStateTax' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NonPrimaryStateTax> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NonPrimaryStateTax.class));

       return (TypeAdapter<T>) new TypeAdapter<NonPrimaryStateTax>() {
           @Override
           public void write(JsonWriter out, NonPrimaryStateTax value) throws IOException {
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
           public NonPrimaryStateTax read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             NonPrimaryStateTax instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of NonPrimaryStateTax given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NonPrimaryStateTax
  * @throws IOException if the JSON string is invalid with respect to NonPrimaryStateTax
  */
  public static NonPrimaryStateTax fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NonPrimaryStateTax.class);
  }

 /**
  * Convert an instance of NonPrimaryStateTax to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

