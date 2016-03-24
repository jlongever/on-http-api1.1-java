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

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-24T14:20:02.281-04:00")
public class NodesApi {
  private ApiClient apiClient;

  public NodesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public NodesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * List of all nodes or if there are none an empty object
   * List of all nodes or if there are none an empty object
   * @return List<Object>
   * @throws ApiException if fails to make API call
   */
  public List<Object> nodesGet() throws ApiException {
    Object localVarPostBody = null;
    
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

    
    GenericType<List<Object>> localVarReturnType = new GenericType<List<Object>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Fetch catalog of specified node
   * Fetch catalog of specified node
   * @param identifier Mac addresses and unique aliases to identify the node by, |\nexpect a string or an array of strings. (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object nodesIdentifierCatalogsGet(String identifier) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'identifier' is set
    if (identifier == null) {
      throw new ApiException(400, "Missing the required parameter 'identifier' when calling nodesIdentifierCatalogsGet");
    }
    
    // create path and map variables
    String localVarPath = "/nodes/{identifier}/catalogs".replaceAll("\\{format\\}","json")
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

    
    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Fetch catalog of specified node for given source
   * Fetch catalog of specified node for given source
   * @param identifier Mac addresses and unique aliases to identify the node by, |\nexpect a string or an array of strings. (required)
   * @param source Source catalog name to fetch (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object nodesIdentifierCatalogsSourceGet(String identifier, String source) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'identifier' is set
    if (identifier == null) {
      throw new ApiException(400, "Missing the required parameter 'identifier' when calling nodesIdentifierCatalogsSourceGet");
    }
    
    // verify the required parameter 'source' is set
    if (source == null) {
      throw new ApiException(400, "Missing the required parameter 'source' when calling nodesIdentifierCatalogsSourceGet");
    }
    
    // create path and map variables
    String localVarPath = "/nodes/{identifier}/catalogs/{source}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()))
      .replaceAll("\\{" + "source" + "\\}", apiClient.escapeString(source.toString()));

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
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Delete specified node.
   * Delete specified node.
   * @param identifier Mac addresses and unique aliases to identify the node by, |\nexpect a string or an array of strings. (required)
   * @throws ApiException if fails to make API call
   */
  public void nodesIdentifierDelete(String identifier) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'identifier' is set
    if (identifier == null) {
      throw new ApiException(400, "Missing the required parameter 'identifier' when calling nodesIdentifierDelete");
    }
    
    // create path and map variables
    String localVarPath = "/nodes/{identifier}".replaceAll("\\{format\\}","json")
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

    
    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * List of all nodes or if there are none an empty object
   * List of all nodes or if there are none an empty object
   * @param identifier Mac addresses and unique aliases to identify the node by, |\nexpect a string or an array of strings. (required)
   * @return List<Object>
   * @throws ApiException if fails to make API call
   */
  public List<Object> nodesIdentifierGet(String identifier) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'identifier' is set
    if (identifier == null) {
      throw new ApiException(400, "Missing the required parameter 'identifier' when calling nodesIdentifierGet");
    }
    
    // create path and map variables
    String localVarPath = "/nodes/{identifier}".replaceAll("\\{format\\}","json")
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

    
    GenericType<List<Object>> localVarReturnType = new GenericType<List<Object>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * get the obm settings associated with a node.
   * get the obm settings associated with a node.
   * @param identifier Mac addresses and unique aliases to identify the node by, |\nexpect a string or an array of strings. (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object nodesIdentifierObmGet(String identifier) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'identifier' is set
    if (identifier == null) {
      throw new ApiException(400, "Missing the required parameter 'identifier' when calling nodesIdentifierObmGet");
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

    
    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Fetch status of identify light on node through OBM (if supported)
   * Fetch status of identify light on node through OBM (if supported)
   * @param identifier Mac addresses and unique aliases to identify the node by, |\nexpect a string or an array of strings. (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object nodesIdentifierObmIdentifyGet(String identifier) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'identifier' is set
    if (identifier == null) {
      throw new ApiException(400, "Missing the required parameter 'identifier' when calling nodesIdentifierObmIdentifyGet");
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

    
    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
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
   * Patch specified node
   * Patch specified node
   * @param identifier Mac addresses and unique aliases to identify the node by, |\nexpect a string or an array of strings. (required)
   * @param body object patches to apply. (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object nodesIdentifierPatch(String identifier, Object body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'identifier' is set
    if (identifier == null) {
      throw new ApiException(400, "Missing the required parameter 'identifier' when calling nodesIdentifierPatch");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling nodesIdentifierPatch");
    }
    
    // create path and map variables
    String localVarPath = "/nodes/{identifier}".replaceAll("\\{format\\}","json")
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

    
    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Fetch all pollers for specified node
   * Fetch all pollers for specified node
   * @param identifier Mac addresses and unique aliases to identify the node by, |\nexpect a string or an array of strings. (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object nodesIdentifierPollersGet(String identifier) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'identifier' is set
    if (identifier == null) {
      throw new ApiException(400, "Missing the required parameter 'identifier' when calling nodesIdentifierPollersGet");
    }
    
    // create path and map variables
    String localVarPath = "/nodes/{identifier}/pollers".replaceAll("\\{format\\}","json")
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

    
    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Cancel currently running workflows for specified node
   * Cancel currently running workflows for specified node
   * @param identifier Mac addresses and unique aliases to identify the node by, |\nexpect a string or an array of strings. (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object nodesIdentifierWorkflowsActiveDelete(String identifier) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'identifier' is set
    if (identifier == null) {
      throw new ApiException(400, "Missing the required parameter 'identifier' when calling nodesIdentifierWorkflowsActiveDelete");
    }
    
    // create path and map variables
    String localVarPath = "/nodes/{identifier}/workflows/active".replaceAll("\\{format\\}","json")
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

    
    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Fetch currently running workflows for specified node
   * Fetch currently running workflows for specified node
   * @param identifier Mac addresses and unique aliases to identify the node by, |\nexpect a string or an array of strings. (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object nodesIdentifierWorkflowsActiveGet(String identifier) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'identifier' is set
    if (identifier == null) {
      throw new ApiException(400, "Missing the required parameter 'identifier' when calling nodesIdentifierWorkflowsActiveGet");
    }
    
    // create path and map variables
    String localVarPath = "/nodes/{identifier}/workflows/active".replaceAll("\\{format\\}","json")
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

    
    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Fetch all workflows for specified node
   * Fetch all workflows for specified node
   * @param identifier Mac addresses and unique aliases to identify the node by, |\nexpect a string or an array of strings. (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object nodesIdentifierWorkflowsGet(String identifier) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'identifier' is set
    if (identifier == null) {
      throw new ApiException(400, "Missing the required parameter 'identifier' when calling nodesIdentifierWorkflowsGet");
    }
    
    // create path and map variables
    String localVarPath = "/nodes/{identifier}/workflows".replaceAll("\\{format\\}","json")
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

    
    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
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
   * Remove a whitelist of specified mac address
   * Remove a whitelist of specified mac address
   * @param macaddress Mac addresses and unique aliases to identify the node by, |\nexpect a string or an array of strings. (required)
   * @throws ApiException if fails to make API call
   */
  public void nodesMacaddressDhcpWhitelistDelete(String macaddress) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'macaddress' is set
    if (macaddress == null) {
      throw new ApiException(400, "Missing the required parameter 'macaddress' when calling nodesMacaddressDhcpWhitelistDelete");
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

    
    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
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
   * get nodes for specific sku
   * get nodes for specific sku
   * @param identifier The profile name. (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object skusIdentifierNodesGet(String identifier) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'identifier' is set
    if (identifier == null) {
      throw new ApiException(400, "Missing the required parameter 'identifier' when calling skusIdentifierNodesGet");
    }
    
    // create path and map variables
    String localVarPath = "/skus/{identifier}/nodes".replaceAll("\\{format\\}","json")
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

    
    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
}
