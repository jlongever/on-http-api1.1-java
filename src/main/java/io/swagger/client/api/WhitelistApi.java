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
public class WhitelistApi {
  private ApiClient apiClient;

  public WhitelistApi() {
    this(Configuration.getDefaultApiClient());
  }

  public WhitelistApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Add a whitelist of specified mac address
   * Add a whitelist of specified mac address
   * @param macaddress Mac addresses and unique aliases to identify the node by, |\nexpect a string or an array of strings.
   * @param body 
   * @return InlineResponse200
   */
  public InlineResponse200 nodesMacaddressDhcpWhitelistPost(String macaddress,  body) throws ApiException {
    Object postBody = body;
    
     // verify the required parameter 'macaddress' is set
     if (macaddress == null) {
        throw new ApiException(400, "Missing the required parameter 'macaddress' when calling nodesMacaddressDhcpWhitelistPost");
     }
     
    // create path and map variables
    String path = "/nodes/{macaddress}/dhcp/whitelist".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "macaddress" + "\\}", apiClient.escapeString(macaddress.toString()));

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
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Remove a whitelist of specified mac address
   * Remove a whitelist of specified mac address
   * @param macaddress Mac addresses and unique aliases to identify the node by, |\nexpect a string or an array of strings.
   * @return void
   */
  public void nodesMacaddressDhcpWhitelistDelete(String macaddress) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'macaddress' is set
     if (macaddress == null) {
        throw new ApiException(400, "Missing the required parameter 'macaddress' when calling nodesMacaddressDhcpWhitelistDelete");
     }
     
    // create path and map variables
    String path = "/nodes/{macaddress}/dhcp/whitelist".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "macaddress" + "\\}", apiClient.escapeString(macaddress.toString()));

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

    
    apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, null);
    
  }
  
}
