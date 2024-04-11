# DefaultApi

All URIs are relative to *https://hotelmanager_backend*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addHotelzimmer**](DefaultApi.md#addHotelzimmer) | **POST** /api/hotelzimmer | POST api/hotelzimmer |
| [**deleteHotelzimmerById**](DefaultApi.md#deleteHotelzimmerById) | **DELETE** /api/hotelzimmer/{hotelzimmerId} | DELETE api/hotelzimmer/{hotelzimmerId} |
| [**findAll**](DefaultApi.md#findAll) | **GET** /api/hotelzimmer | GET api/hotelzimmer |
| [**getHotelzimmerById**](DefaultApi.md#getHotelzimmerById) | **GET** /api/hotelzimmer/{hotelzimmerId} | GET api/hotelzimmer/{hotelzimmerId} |
| [**updateHotelzimmer**](DefaultApi.md#updateHotelzimmer) | **PUT** /api/hotelzimmer | PUT api/hotelzimmer |


<a name="addHotelzimmer"></a>
# **addHotelzimmer**
> Hotelzimmer addHotelzimmer(hotelzimmer)

POST api/hotelzimmer

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://hotelmanager_backend");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Hotelzimmer hotelzimmer = new Hotelzimmer(); // Hotelzimmer | 
    try {
      Hotelzimmer result = apiInstance.addHotelzimmer(hotelzimmer);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#addHotelzimmer");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **hotelzimmer** | [**Hotelzimmer**](Hotelzimmer.md)|  | |

### Return type

[**Hotelzimmer**](Hotelzimmer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="deleteHotelzimmerById"></a>
# **deleteHotelzimmerById**
> String deleteHotelzimmerById(hotelzimmerId)

DELETE api/hotelzimmer/{hotelzimmerId}

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://hotelmanager_backend");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Long hotelzimmerId = 56L; // Long | 
    try {
      String result = apiInstance.deleteHotelzimmerById(hotelzimmerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#deleteHotelzimmerById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **hotelzimmerId** | **Long**|  | |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="findAll"></a>
# **findAll**
> List&lt;Hotelzimmer&gt; findAll()

GET api/hotelzimmer

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://hotelmanager_backend");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      List<Hotelzimmer> result = apiInstance.findAll();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#findAll");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Hotelzimmer&gt;**](Hotelzimmer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getHotelzimmerById"></a>
# **getHotelzimmerById**
> Hotelzimmer getHotelzimmerById(hotelzimmerId)

GET api/hotelzimmer/{hotelzimmerId}

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://hotelmanager_backend");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Long hotelzimmerId = 56L; // Long | 
    try {
      Hotelzimmer result = apiInstance.getHotelzimmerById(hotelzimmerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getHotelzimmerById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **hotelzimmerId** | **Long**|  | |

### Return type

[**Hotelzimmer**](Hotelzimmer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateHotelzimmer"></a>
# **updateHotelzimmer**
> Hotelzimmer updateHotelzimmer(hotelzimmer)

PUT api/hotelzimmer

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://hotelmanager_backend");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Hotelzimmer hotelzimmer = new Hotelzimmer(); // Hotelzimmer | 
    try {
      Hotelzimmer result = apiInstance.updateHotelzimmer(hotelzimmer);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#updateHotelzimmer");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **hotelzimmer** | [**Hotelzimmer**](Hotelzimmer.md)|  | |

### Return type

[**Hotelzimmer**](Hotelzimmer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

