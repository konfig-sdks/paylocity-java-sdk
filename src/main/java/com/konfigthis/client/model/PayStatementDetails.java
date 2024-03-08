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
 * The pay statement details model
 */
@ApiModel(description = "The pay statement details model")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PayStatementDetails {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Object amount;

  public static final String SERIALIZED_NAME_CHECK_DATE = "checkDate";
  @SerializedName(SERIALIZED_NAME_CHECK_DATE)
  private Object checkDate;

  public static final String SERIALIZED_NAME_DET = "det";
  @SerializedName(SERIALIZED_NAME_DET)
  private Object det;

  public static final String SERIALIZED_NAME_DET_CODE = "detCode";
  @SerializedName(SERIALIZED_NAME_DET_CODE)
  private Object detCode;

  public static final String SERIALIZED_NAME_DET_TYPE = "detType";
  @SerializedName(SERIALIZED_NAME_DET_TYPE)
  private Object detType;

  public static final String SERIALIZED_NAME_ELIGIBLE_COMPENSATION = "eligibleCompensation";
  @SerializedName(SERIALIZED_NAME_ELIGIBLE_COMPENSATION)
  private Object eligibleCompensation;

  public static final String SERIALIZED_NAME_HOURS = "hours";
  @SerializedName(SERIALIZED_NAME_HOURS)
  private Object hours;

  public static final String SERIALIZED_NAME_RATE = "rate";
  @SerializedName(SERIALIZED_NAME_RATE)
  private Object rate;

  public static final String SERIALIZED_NAME_TRANSACTION_NUMBER = "transactionNumber";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_NUMBER)
  private Integer transactionNumber;

  public static final String SERIALIZED_NAME_TRANSACTION_TYPE = "transactionType";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_TYPE)
  private Object transactionType;

  public static final String SERIALIZED_NAME_YEAR = "year";
  @SerializedName(SERIALIZED_NAME_YEAR)
  private Integer year;

  public PayStatementDetails() {
  }

  public PayStatementDetails amount(Object amount) {
    
    
    
    
    this.amount = amount;
    return this;
  }

   /**
   * .&lt;br /&gt;
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = ".<br />")

  public Object getAmount() {
    return amount;
  }


  public void setAmount(Object amount) {
    
    
    
    this.amount = amount;
  }


  public PayStatementDetails checkDate(Object checkDate) {
    
    
    
    
    this.checkDate = checkDate;
    return this;
  }

   /**
   * .&lt;br /&gt;
   * @return checkDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = ".<br />")

  public Object getCheckDate() {
    return checkDate;
  }


  public void setCheckDate(Object checkDate) {
    
    
    
    this.checkDate = checkDate;
  }


  public PayStatementDetails det(Object det) {
    
    
    
    
    this.det = det;
    return this;
  }

   /**
   * .&lt;br /&gt;
   * @return det
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = ".<br />")

  public Object getDet() {
    return det;
  }


  public void setDet(Object det) {
    
    
    
    this.det = det;
  }


  public PayStatementDetails detCode(Object detCode) {
    
    
    
    
    this.detCode = detCode;
    return this;
  }

   /**
   * .&lt;br /&gt;
   * @return detCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = ".<br />")

  public Object getDetCode() {
    return detCode;
  }


  public void setDetCode(Object detCode) {
    
    
    
    this.detCode = detCode;
  }


  public PayStatementDetails detType(Object detType) {
    
    
    
    
    this.detType = detType;
    return this;
  }

   /**
   * .&lt;br /&gt;
   * @return detType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = ".<br />")

  public Object getDetType() {
    return detType;
  }


  public void setDetType(Object detType) {
    
    
    
    this.detType = detType;
  }


  public PayStatementDetails eligibleCompensation(Object eligibleCompensation) {
    
    
    
    
    this.eligibleCompensation = eligibleCompensation;
    return this;
  }

   /**
   * .&lt;br /&gt;
   * @return eligibleCompensation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = ".<br />")

  public Object getEligibleCompensation() {
    return eligibleCompensation;
  }


  public void setEligibleCompensation(Object eligibleCompensation) {
    
    
    
    this.eligibleCompensation = eligibleCompensation;
  }


  public PayStatementDetails hours(Object hours) {
    
    
    
    
    this.hours = hours;
    return this;
  }

   /**
   * .&lt;br /&gt;
   * @return hours
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = ".<br />")

  public Object getHours() {
    return hours;
  }


  public void setHours(Object hours) {
    
    
    
    this.hours = hours;
  }


  public PayStatementDetails rate(Object rate) {
    
    
    
    
    this.rate = rate;
    return this;
  }

   /**
   * .&lt;br /&gt;
   * @return rate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = ".<br />")

  public Object getRate() {
    return rate;
  }


  public void setRate(Object rate) {
    
    
    
    this.rate = rate;
  }


  public PayStatementDetails transactionNumber(Integer transactionNumber) {
    
    
    
    
    this.transactionNumber = transactionNumber;
    return this;
  }

   /**
   * &lt;br /&gt;
   * @return transactionNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<br />")

  public Integer getTransactionNumber() {
    return transactionNumber;
  }


  public void setTransactionNumber(Integer transactionNumber) {
    
    
    
    this.transactionNumber = transactionNumber;
  }


  public PayStatementDetails transactionType(Object transactionType) {
    
    
    
    
    this.transactionType = transactionType;
    return this;
  }

   /**
   * .&lt;br /&gt;
   * @return transactionType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = ".<br />")

  public Object getTransactionType() {
    return transactionType;
  }


  public void setTransactionType(Object transactionType) {
    
    
    
    this.transactionType = transactionType;
  }


  public PayStatementDetails year(Integer year) {
    
    
    
    
    this.year = year;
    return this;
  }

   /**
   * .&lt;br /&gt;
   * @return year
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = ".<br />")

  public Integer getYear() {
    return year;
  }


  public void setYear(Integer year) {
    
    
    
    this.year = year;
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
   * @return the PayStatementDetails instance itself
   */
  public PayStatementDetails putAdditionalProperty(String key, Object value) {
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
    PayStatementDetails payStatementDetails = (PayStatementDetails) o;
    return Objects.equals(this.amount, payStatementDetails.amount) &&
        Objects.equals(this.checkDate, payStatementDetails.checkDate) &&
        Objects.equals(this.det, payStatementDetails.det) &&
        Objects.equals(this.detCode, payStatementDetails.detCode) &&
        Objects.equals(this.detType, payStatementDetails.detType) &&
        Objects.equals(this.eligibleCompensation, payStatementDetails.eligibleCompensation) &&
        Objects.equals(this.hours, payStatementDetails.hours) &&
        Objects.equals(this.rate, payStatementDetails.rate) &&
        Objects.equals(this.transactionNumber, payStatementDetails.transactionNumber) &&
        Objects.equals(this.transactionType, payStatementDetails.transactionType) &&
        Objects.equals(this.year, payStatementDetails.year)&&
        Objects.equals(this.additionalProperties, payStatementDetails.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, checkDate, det, detCode, detType, eligibleCompensation, hours, rate, transactionNumber, transactionType, year, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayStatementDetails {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    checkDate: ").append(toIndentedString(checkDate)).append("\n");
    sb.append("    det: ").append(toIndentedString(det)).append("\n");
    sb.append("    detCode: ").append(toIndentedString(detCode)).append("\n");
    sb.append("    detType: ").append(toIndentedString(detType)).append("\n");
    sb.append("    eligibleCompensation: ").append(toIndentedString(eligibleCompensation)).append("\n");
    sb.append("    hours: ").append(toIndentedString(hours)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    transactionNumber: ").append(toIndentedString(transactionNumber)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
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
    openapiFields.add("checkDate");
    openapiFields.add("det");
    openapiFields.add("detCode");
    openapiFields.add("detType");
    openapiFields.add("eligibleCompensation");
    openapiFields.add("hours");
    openapiFields.add("rate");
    openapiFields.add("transactionNumber");
    openapiFields.add("transactionType");
    openapiFields.add("year");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PayStatementDetails
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PayStatementDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PayStatementDetails is not found in the empty JSON string", PayStatementDetails.openapiRequiredFields.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PayStatementDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PayStatementDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PayStatementDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PayStatementDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<PayStatementDetails>() {
           @Override
           public void write(JsonWriter out, PayStatementDetails value) throws IOException {
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
           public PayStatementDetails read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PayStatementDetails instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PayStatementDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PayStatementDetails
  * @throws IOException if the JSON string is invalid with respect to PayStatementDetails
  */
  public static PayStatementDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PayStatementDetails.class);
  }

 /**
  * Convert an instance of PayStatementDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
