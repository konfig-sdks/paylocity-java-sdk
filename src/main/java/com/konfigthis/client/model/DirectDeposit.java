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
import java.util.ArrayList;
import java.util.List;

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
 * The Direct Deposit model
 */
@ApiModel(description = "The Direct Deposit model")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class DirectDeposit {
  public static final String SERIALIZED_NAME_ADDITIONAL_DIRECT_DEPOSIT = "additionalDirectDeposit";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_DIRECT_DEPOSIT)
  private List<Object> additionalDirectDeposit = null;

  public static final String SERIALIZED_NAME_MAIN_DIRECT_DEPOSIT = "mainDirectDeposit";
  @SerializedName(SERIALIZED_NAME_MAIN_DIRECT_DEPOSIT)
  private Object mainDirectDeposit;

  public DirectDeposit() {
  }

  public DirectDeposit additionalDirectDeposit(List<Object> additionalDirectDeposit) {
    
    
    
    
    this.additionalDirectDeposit = additionalDirectDeposit;
    return this;
  }

  public DirectDeposit addAdditionalDirectDepositItem(Object additionalDirectDepositItem) {
    if (this.additionalDirectDeposit == null) {
      this.additionalDirectDeposit = new ArrayList<>();
    }
    this.additionalDirectDeposit.add(additionalDirectDepositItem);
    return this;
  }

   /**
   * Additional Direct Deposits that are not the main Direct Deposit.
   * @return additionalDirectDeposit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Additional Direct Deposits that are not the main Direct Deposit.")

  public List<Object> getAdditionalDirectDeposit() {
    return additionalDirectDeposit;
  }


  public void setAdditionalDirectDeposit(List<Object> additionalDirectDeposit) {
    
    
    
    this.additionalDirectDeposit = additionalDirectDeposit;
  }


  public DirectDeposit mainDirectDeposit(Object mainDirectDeposit) {
    
    
    
    
    this.mainDirectDeposit = mainDirectDeposit;
    return this;
  }

   /**
   * The main Direct Deposit account.
   * @return mainDirectDeposit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The main Direct Deposit account.")

  public Object getMainDirectDeposit() {
    return mainDirectDeposit;
  }


  public void setMainDirectDeposit(Object mainDirectDeposit) {
    
    
    
    this.mainDirectDeposit = mainDirectDeposit;
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
   * @return the DirectDeposit instance itself
   */
  public DirectDeposit putAdditionalProperty(String key, Object value) {
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
    DirectDeposit directDeposit = (DirectDeposit) o;
    return Objects.equals(this.additionalDirectDeposit, directDeposit.additionalDirectDeposit) &&
        Objects.equals(this.mainDirectDeposit, directDeposit.mainDirectDeposit)&&
        Objects.equals(this.additionalProperties, directDeposit.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalDirectDeposit, mainDirectDeposit, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirectDeposit {\n");
    sb.append("    additionalDirectDeposit: ").append(toIndentedString(additionalDirectDeposit)).append("\n");
    sb.append("    mainDirectDeposit: ").append(toIndentedString(mainDirectDeposit)).append("\n");
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
    openapiFields.add("additionalDirectDeposit");
    openapiFields.add("mainDirectDeposit");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DirectDeposit
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DirectDeposit.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DirectDeposit is not found in the empty JSON string", DirectDeposit.openapiRequiredFields.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("additionalDirectDeposit") != null && !jsonObj.get("additionalDirectDeposit").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `additionalDirectDeposit` to be an array in the JSON string but got `%s`", jsonObj.get("additionalDirectDeposit").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DirectDeposit.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DirectDeposit' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DirectDeposit> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DirectDeposit.class));

       return (TypeAdapter<T>) new TypeAdapter<DirectDeposit>() {
           @Override
           public void write(JsonWriter out, DirectDeposit value) throws IOException {
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
           public DirectDeposit read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             DirectDeposit instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of DirectDeposit given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DirectDeposit
  * @throws IOException if the JSON string is invalid with respect to DirectDeposit
  */
  public static DirectDeposit fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DirectDeposit.class);
  }

 /**
  * Convert an instance of DirectDeposit to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
