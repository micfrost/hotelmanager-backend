/*
 * hotelmanager_backend API
 * hotelmanager_backend API
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * Hotelzimmer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-11T10:18:43.786388586+02:00[Europe/Berlin]")
public class Hotelzimmer {
  public static final String SERIALIZED_NAME_ZIMMERNUMMER = "zimmernummer";
  @SerializedName(SERIALIZED_NAME_ZIMMERNUMMER)
  private Long zimmernummer;

  /**
   * Gets or Sets zimmergroesse
   */
  @JsonAdapter(ZimmergroesseEnum.Adapter.class)
  public enum ZimmergroesseEnum {
    EINZELZIMMER("EINZELZIMMER"),
    
    DOPPELZIMMER("DOPPELZIMMER"),
    
    SUITE("SUITE");

    private String value;

    ZimmergroesseEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ZimmergroesseEnum fromValue(String value) {
      for (ZimmergroesseEnum b : ZimmergroesseEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ZimmergroesseEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ZimmergroesseEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ZimmergroesseEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ZimmergroesseEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ZIMMERGROESSE = "zimmergroesse";
  @SerializedName(SERIALIZED_NAME_ZIMMERGROESSE)
  private ZimmergroesseEnum zimmergroesse;

  public Hotelzimmer() {
  }

  public Hotelzimmer zimmernummer(Long zimmernummer) {
    
    this.zimmernummer = zimmernummer;
    return this;
  }

   /**
   * Get zimmernummer
   * @return zimmernummer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getZimmernummer() {
    return zimmernummer;
  }


  public void setZimmernummer(Long zimmernummer) {
    this.zimmernummer = zimmernummer;
  }


  public Hotelzimmer zimmergroesse(ZimmergroesseEnum zimmergroesse) {
    
    this.zimmergroesse = zimmergroesse;
    return this;
  }

   /**
   * Get zimmergroesse
   * @return zimmergroesse
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ZimmergroesseEnum getZimmergroesse() {
    return zimmergroesse;
  }


  public void setZimmergroesse(ZimmergroesseEnum zimmergroesse) {
    this.zimmergroesse = zimmergroesse;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Hotelzimmer hotelzimmer = (Hotelzimmer) o;
    return Objects.equals(this.zimmernummer, hotelzimmer.zimmernummer) &&
        Objects.equals(this.zimmergroesse, hotelzimmer.zimmergroesse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(zimmernummer, zimmergroesse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Hotelzimmer {\n");
    sb.append("    zimmernummer: ").append(toIndentedString(zimmernummer)).append("\n");
    sb.append("    zimmergroesse: ").append(toIndentedString(zimmergroesse)).append("\n");
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
    openapiFields.add("zimmernummer");
    openapiFields.add("zimmergroesse");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Hotelzimmer
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Hotelzimmer.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Hotelzimmer is not found in the empty JSON string", Hotelzimmer.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Hotelzimmer.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Hotelzimmer` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("zimmergroesse") != null && !jsonObj.get("zimmergroesse").isJsonNull()) && !jsonObj.get("zimmergroesse").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `zimmergroesse` to be a primitive type in the JSON string but got `%s`", jsonObj.get("zimmergroesse").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Hotelzimmer.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Hotelzimmer' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Hotelzimmer> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Hotelzimmer.class));

       return (TypeAdapter<T>) new TypeAdapter<Hotelzimmer>() {
           @Override
           public void write(JsonWriter out, Hotelzimmer value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Hotelzimmer read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Hotelzimmer given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Hotelzimmer
  * @throws IOException if the JSON string is invalid with respect to Hotelzimmer
  */
  public static Hotelzimmer fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Hotelzimmer.class);
  }

 /**
  * Convert an instance of Hotelzimmer to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

