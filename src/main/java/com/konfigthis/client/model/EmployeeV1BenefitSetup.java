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
 * Benefit Setup
 */
@ApiModel(description = "Benefit Setup")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class EmployeeV1BenefitSetup {
  public static final String SERIALIZED_NAME_BENEFIT_CLASS = "benefitClass";
  @SerializedName(SERIALIZED_NAME_BENEFIT_CLASS)
  private String benefitClass;

  public static final String SERIALIZED_NAME_BENEFIT_CLASS_EFFECTIVE_DATE = "benefitClassEffectiveDate";
  @SerializedName(SERIALIZED_NAME_BENEFIT_CLASS_EFFECTIVE_DATE)
  private String benefitClassEffectiveDate;

  public static final String SERIALIZED_NAME_BENEFIT_SALARY = "benefitSalary";
  @SerializedName(SERIALIZED_NAME_BENEFIT_SALARY)
  private Double benefitSalary;

  public static final String SERIALIZED_NAME_BENEFIT_SALARY_EFFECTIVE_DATE = "benefitSalaryEffectiveDate";
  @SerializedName(SERIALIZED_NAME_BENEFIT_SALARY_EFFECTIVE_DATE)
  private String benefitSalaryEffectiveDate;

  public static final String SERIALIZED_NAME_DO_NOT_APPLY_ADMINISTRATIVE_PERIOD = "doNotApplyAdministrativePeriod";
  @SerializedName(SERIALIZED_NAME_DO_NOT_APPLY_ADMINISTRATIVE_PERIOD)
  private Boolean doNotApplyAdministrativePeriod;

  public static final String SERIALIZED_NAME_MEASURE_A_C_A_ELIGIBILITY = "measureACAEligibility";
  @SerializedName(SERIALIZED_NAME_MEASURE_A_C_A_ELIGIBILITY)
  private Boolean measureACAEligibility;

  public EmployeeV1BenefitSetup() {
  }

  public EmployeeV1BenefitSetup benefitClass(String benefitClass) {
    
    
    
    
    this.benefitClass = benefitClass;
    return this;
  }

   /**
   * Benefit Class code. Values are configured in Paylocity Payroll/HR solution Company &gt; Setup &gt; Benefits &gt; Classes.&lt;br  /&gt;Max length: 30
   * @return benefitClass
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Benefit Class code. Values are configured in Paylocity Payroll/HR solution Company > Setup > Benefits > Classes.<br  />Max length: 30")

  public String getBenefitClass() {
    return benefitClass;
  }


  public void setBenefitClass(String benefitClass) {
    
    
    
    this.benefitClass = benefitClass;
  }


  public EmployeeV1BenefitSetup benefitClassEffectiveDate(String benefitClassEffectiveDate) {
    
    
    
    
    this.benefitClassEffectiveDate = benefitClassEffectiveDate;
    return this;
  }

   /**
   * Date when Benefit Class takes effect. Common formats are *MM-DD-CCYY, CCYY-MM-DD*.
   * @return benefitClassEffectiveDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date when Benefit Class takes effect. Common formats are *MM-DD-CCYY, CCYY-MM-DD*.")

  public String getBenefitClassEffectiveDate() {
    return benefitClassEffectiveDate;
  }


  public void setBenefitClassEffectiveDate(String benefitClassEffectiveDate) {
    
    
    
    this.benefitClassEffectiveDate = benefitClassEffectiveDate;
  }


  public EmployeeV1BenefitSetup benefitSalary(Double benefitSalary) {
    
    
    
    
    this.benefitSalary = benefitSalary;
    return this;
  }

  public EmployeeV1BenefitSetup benefitSalary(Integer benefitSalary) {
    
    
    
    
    this.benefitSalary = benefitSalary.doubleValue();
    return this;
  }

   /**
   * Salary used to configure benefits.&lt;br  /&gt;Decimal(12,2)
   * @return benefitSalary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Salary used to configure benefits.<br  />Decimal(12,2)")

  public Double getBenefitSalary() {
    return benefitSalary;
  }


  public void setBenefitSalary(Double benefitSalary) {
    
    
    
    this.benefitSalary = benefitSalary;
  }


  public EmployeeV1BenefitSetup benefitSalaryEffectiveDate(String benefitSalaryEffectiveDate) {
    
    
    
    
    this.benefitSalaryEffectiveDate = benefitSalaryEffectiveDate;
    return this;
  }

   /**
   * Date when Benefit Salary takes effect. Common formats are *MM-DD-CCYY, CCYY-MM-DD*.
   * @return benefitSalaryEffectiveDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date when Benefit Salary takes effect. Common formats are *MM-DD-CCYY, CCYY-MM-DD*.")

  public String getBenefitSalaryEffectiveDate() {
    return benefitSalaryEffectiveDate;
  }


  public void setBenefitSalaryEffectiveDate(String benefitSalaryEffectiveDate) {
    
    
    
    this.benefitSalaryEffectiveDate = benefitSalaryEffectiveDate;
  }


  public EmployeeV1BenefitSetup doNotApplyAdministrativePeriod(Boolean doNotApplyAdministrativePeriod) {
    
    
    
    
    this.doNotApplyAdministrativePeriod = doNotApplyAdministrativePeriod;
    return this;
  }

   /**
   * Applicable only for ACA Enhanced clients and Benefit Classes with ACA Employment Type of Full Time.
   * @return doNotApplyAdministrativePeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Applicable only for ACA Enhanced clients and Benefit Classes with ACA Employment Type of Full Time.")

  public Boolean getDoNotApplyAdministrativePeriod() {
    return doNotApplyAdministrativePeriod;
  }


  public void setDoNotApplyAdministrativePeriod(Boolean doNotApplyAdministrativePeriod) {
    
    
    
    this.doNotApplyAdministrativePeriod = doNotApplyAdministrativePeriod;
  }


  public EmployeeV1BenefitSetup measureACAEligibility(Boolean measureACAEligibility) {
    
    
    
    
    this.measureACAEligibility = measureACAEligibility;
    return this;
  }

   /**
   * Only valid for ACA Enhanced clients and Benefit Classes that are ACA Employment Type of Full Time.
   * @return measureACAEligibility
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Only valid for ACA Enhanced clients and Benefit Classes that are ACA Employment Type of Full Time.")

  public Boolean getMeasureACAEligibility() {
    return measureACAEligibility;
  }


  public void setMeasureACAEligibility(Boolean measureACAEligibility) {
    
    
    
    this.measureACAEligibility = measureACAEligibility;
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
   * @return the EmployeeV1BenefitSetup instance itself
   */
  public EmployeeV1BenefitSetup putAdditionalProperty(String key, Object value) {
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
    EmployeeV1BenefitSetup employeeV1BenefitSetup = (EmployeeV1BenefitSetup) o;
    return Objects.equals(this.benefitClass, employeeV1BenefitSetup.benefitClass) &&
        Objects.equals(this.benefitClassEffectiveDate, employeeV1BenefitSetup.benefitClassEffectiveDate) &&
        Objects.equals(this.benefitSalary, employeeV1BenefitSetup.benefitSalary) &&
        Objects.equals(this.benefitSalaryEffectiveDate, employeeV1BenefitSetup.benefitSalaryEffectiveDate) &&
        Objects.equals(this.doNotApplyAdministrativePeriod, employeeV1BenefitSetup.doNotApplyAdministrativePeriod) &&
        Objects.equals(this.measureACAEligibility, employeeV1BenefitSetup.measureACAEligibility)&&
        Objects.equals(this.additionalProperties, employeeV1BenefitSetup.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(benefitClass, benefitClassEffectiveDate, benefitSalary, benefitSalaryEffectiveDate, doNotApplyAdministrativePeriod, measureACAEligibility, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeV1BenefitSetup {\n");
    sb.append("    benefitClass: ").append(toIndentedString(benefitClass)).append("\n");
    sb.append("    benefitClassEffectiveDate: ").append(toIndentedString(benefitClassEffectiveDate)).append("\n");
    sb.append("    benefitSalary: ").append(toIndentedString(benefitSalary)).append("\n");
    sb.append("    benefitSalaryEffectiveDate: ").append(toIndentedString(benefitSalaryEffectiveDate)).append("\n");
    sb.append("    doNotApplyAdministrativePeriod: ").append(toIndentedString(doNotApplyAdministrativePeriod)).append("\n");
    sb.append("    measureACAEligibility: ").append(toIndentedString(measureACAEligibility)).append("\n");
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
    openapiFields.add("benefitClass");
    openapiFields.add("benefitClassEffectiveDate");
    openapiFields.add("benefitSalary");
    openapiFields.add("benefitSalaryEffectiveDate");
    openapiFields.add("doNotApplyAdministrativePeriod");
    openapiFields.add("measureACAEligibility");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EmployeeV1BenefitSetup
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EmployeeV1BenefitSetup.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EmployeeV1BenefitSetup is not found in the empty JSON string", EmployeeV1BenefitSetup.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("benefitClass") != null && !jsonObj.get("benefitClass").isJsonNull()) && !jsonObj.get("benefitClass").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `benefitClass` to be a primitive type in the JSON string but got `%s`", jsonObj.get("benefitClass").toString()));
      }
      if ((jsonObj.get("benefitClassEffectiveDate") != null && !jsonObj.get("benefitClassEffectiveDate").isJsonNull()) && !jsonObj.get("benefitClassEffectiveDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `benefitClassEffectiveDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("benefitClassEffectiveDate").toString()));
      }
      if ((jsonObj.get("benefitSalaryEffectiveDate") != null && !jsonObj.get("benefitSalaryEffectiveDate").isJsonNull()) && !jsonObj.get("benefitSalaryEffectiveDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `benefitSalaryEffectiveDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("benefitSalaryEffectiveDate").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EmployeeV1BenefitSetup.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EmployeeV1BenefitSetup' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EmployeeV1BenefitSetup> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EmployeeV1BenefitSetup.class));

       return (TypeAdapter<T>) new TypeAdapter<EmployeeV1BenefitSetup>() {
           @Override
           public void write(JsonWriter out, EmployeeV1BenefitSetup value) throws IOException {
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
           public EmployeeV1BenefitSetup read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             EmployeeV1BenefitSetup instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of EmployeeV1BenefitSetup given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EmployeeV1BenefitSetup
  * @throws IOException if the JSON string is invalid with respect to EmployeeV1BenefitSetup
  */
  public static EmployeeV1BenefitSetup fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmployeeV1BenefitSetup.class);
  }

 /**
  * Convert an instance of EmployeeV1BenefitSetup to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

