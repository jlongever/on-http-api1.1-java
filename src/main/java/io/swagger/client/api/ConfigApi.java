package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import io.swagger.client.model.InlineResponse200;
import io.swagger.client.model.Error;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-05T13:17:45.132-04:00")
public class ConfigApi {
  private ApiClient apiClient;

  public ConfigApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ConfigApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * get server configuration
   * Get server configuration.
   * @return InlineResponse200
   */
  public InlineResponse200 configGet() throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/config".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json", "application/x-gzip"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "auth_token" };

    
    GenericType<InlineResponse200> returnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * patch/update server configuration
   * Patch/update server configurationm and then return the patched configuration.
   * @param body 
   * @return InlineResponse200
   */
  public InlineResponse200 configPatch( body) throws ApiException {
    Object postBody = body;
    
     // verify the required parameter 'body' is set
     if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling configPatch");
     }
     
    // create path and map variables
    String path = "/config".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json", "application/x-gzip"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "auth_token" };

    
    GenericType<InlineResponse200> returnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(path, "PATCH", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
