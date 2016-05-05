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
public class IdentifyApi {
  private ApiClient apiClient;

  public IdentifyApi() {
    this(Configuration.getDefaultApiClient());
  }

  public IdentifyApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Fetch status of identify light on node through OBM (if supported)
   * Fetch status of identify light on node through OBM (if supported)
   * @param identifier Mac addresses and unique aliases to identify the node by, |\nexpect a string or an array of strings.
   * @return InlineResponse200
   */
  public InlineResponse200 nodesIdentifierObmIdentifyGet(String identifier) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling nodesIdentifierObmIdentifyGet");
     }
     
    // create path and map variables
    String path = "/nodes/{identifier}/obm/identify".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

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
   * Enable or disable identify light on node through OBM (if supported)
   * Enable or disable identify light on node through OBM (if supported)
   * @param identifier Mac addresses and unique aliases to identify the node by, |\nexpect a string or an array of strings.
   * @param body obm settings to apply.
   * @return void
   */
  public void nodesIdentifierObmIdentifyPost(String identifier, Boolean body) throws ApiException {
    Object postBody = body;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling nodesIdentifierObmIdentifyPost");
     }
     
     // verify the required parameter 'body' is set
     if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling nodesIdentifierObmIdentifyPost");
     }
     
    // create path and map variables
    String path = "/nodes/{identifier}/obm/identify".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

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

    
    apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, null);
    
  }
  
}
