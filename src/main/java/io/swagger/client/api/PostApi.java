package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import io.swagger.client.model.Error;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-30T15:00:31.422-04:00")
public class PostApi {
  private ApiClient apiClient;

  public PostApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PostApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * put file based on filename
   * Put file based on filename, returns the uuid of the stored file.
   * @param fileidentifier filename of the file you want to store (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object filesFileidentifierPut(String fileidentifier) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'fileidentifier' is set
    if (fileidentifier == null) {
      throw new ApiException(400, "Missing the required parameter 'fileidentifier' when calling filesFileidentifierPut");
    }
    
    // create path and map variables
    String localVarPath = "/files/{fileidentifier}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "fileidentifier" + "\\}", apiClient.escapeString(fileidentifier.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json", "application/x-gzip"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "auth_token" };

    
    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * post id
   * post id
   * @param id id of thing to lookup (required)
   * @param content foo (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object lookupsIdPost(String id, Object content) throws ApiException {
    Object localVarPostBody = content;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling lookupsIdPost");
    }
    
    // verify the required parameter 'content' is set
    if (content == null) {
      throw new ApiException(400, "Missing the required parameter 'content' when calling lookupsIdPost");
    }
    
    // create path and map variables
    String localVarPath = "/lookups/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json", "application/x-gzip"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "auth_token" };

    
    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * find all
   * put all
   * @param content foo (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object lookupsPost(Object content) throws ApiException {
    Object localVarPostBody = content;
    
    // verify the required parameter 'content' is set
    if (content == null) {
      throw new ApiException(400, "Missing the required parameter 'content' when calling lookupsPost");
    }
    
    // create path and map variables
    String localVarPath = "/lookups".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json", "application/x-gzip"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "auth_token" };

    
    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Enable or disable identify light on node through OBM (if supported)
   * Enable or disable identify light on node through OBM (if supported)
   * @param identifier Mac addresses and unique aliases to identify the node by, |\nexpect a string or an array of strings. (required)
   * @param body obm settings to apply. (required)
   * @throws ApiException if fails to make API call
   */
  public void nodesIdentifierObmIdentifyPost(String identifier, Boolean body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'identifier' is set
    if (identifier == null) {
      throw new ApiException(400, "Missing the required parameter 'identifier' when calling nodesIdentifierObmIdentifyPost");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling nodesIdentifierObmIdentifyPost");
    }
    
    // create path and map variables
    String localVarPath = "/nodes/{identifier}/obm/identify".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json", "application/x-gzip"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "auth_token" };

    
    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * set the obm settings associated with a node.
   * set he obm settings associated with a node.
   * @param identifier Mac addresses and unique aliases to identify the node by, |\nexpect a string or an array of strings. (required)
   * @param body obm settings to apply. (required)
   * @throws ApiException if fails to make API call
   */
  public void nodesIdentifierObmPost(String identifier, Object body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'identifier' is set
    if (identifier == null) {
      throw new ApiException(400, "Missing the required parameter 'identifier' when calling nodesIdentifierObmPost");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling nodesIdentifierObmPost");
    }
    
    // create path and map variables
    String localVarPath = "/nodes/{identifier}/obm".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json", "application/x-gzip"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "auth_token" };

    
    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * create workflow for specified node
   * create workflow for specified node
   * @param identifier The node unique identifier (required)
   * @param name The injectable Graph name (required)
   * @param body  (optional)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object nodesIdentifierWorkflowsPost(String identifier, String name, Object body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'identifier' is set
    if (identifier == null) {
      throw new ApiException(400, "Missing the required parameter 'identifier' when calling nodesIdentifierWorkflowsPost");
    }
    
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling nodesIdentifierWorkflowsPost");
    }
    
    // create path and map variables
    String localVarPath = "/nodes/{identifier}/workflows".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));
    

    

    

    final String[] localVarAccepts = {
      "application/json", "application/x-gzip"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "auth_token" };

    
    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Add a whitelist of specified mac address
   * Add a whitelist of specified mac address
   * @param macaddress Mac addresses and unique aliases to identify the node by, |\nexpect a string or an array of strings. (required)
   * @param body  (optional)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object nodesMacaddressDhcpWhitelistPost(String macaddress, Object body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'macaddress' is set
    if (macaddress == null) {
      throw new ApiException(400, "Missing the required parameter 'macaddress' when calling nodesMacaddressDhcpWhitelistPost");
    }
    
    // create path and map variables
    String localVarPath = "/nodes/{macaddress}/dhcp/whitelist".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "macaddress" + "\\}", apiClient.escapeString(macaddress.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json", "application/x-gzip"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "auth_token" };

    
    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * post
   * post
   * @param identifiers Mac addresses and unique aliases to identify the node by, |\nexpect a string or an array of strings. (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object nodesPost(Object identifiers) throws ApiException {
    Object localVarPostBody = identifiers;
    
    // verify the required parameter 'identifiers' is set
    if (identifiers == null) {
      throw new ApiException(400, "Missing the required parameter 'identifiers' when calling nodesPost");
    }
    
    // create path and map variables
    String localVarPath = "/nodes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json", "application/x-gzip"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "auth_token" };

    
    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * create a sku
   * create a sku
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object skusPost() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/skus".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json", "application/x-gzip"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "auth_token" };

    
    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * create unbound workflow
   * create unbound workflow
   * @param name The injectable Graph name (required)
   * @param body  (optional)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object workflowsPost(String name, Object body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling workflowsPost");
    }
    
    // create path and map variables
    String localVarPath = "/workflows".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));
    

    

    

    final String[] localVarAccepts = {
      "application/json", "application/x-gzip"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "auth_token" };

    
    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
}
