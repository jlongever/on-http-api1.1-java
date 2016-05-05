package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import io.swagger.client.model.InlineResponse200;
import io.swagger.client.model.Error;
import io.swagger.client.model.Identifiers;
import io.swagger.client.model.Body;
import io.swagger.client.model.Body1;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-05T13:17:45.132-04:00")
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
   * @return List<InlineResponse200>
   */
  public List<InlineResponse200> nodesGet() throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/nodes".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<InlineResponse200>> returnType = new GenericType<List<InlineResponse200>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * post
   * post
   * @param identifiers Mac addresses and unique aliases to identify the node by, |\nexpect a string or an array of strings.
   * @return InlineResponse200
   */
  public InlineResponse200 nodesPost(Identifiers identifiers) throws ApiException {
    Object postBody = identifiers;
    
     // verify the required parameter 'identifiers' is set
     if (identifiers == null) {
        throw new ApiException(400, "Missing the required parameter 'identifiers' when calling nodesPost");
     }
     
    // create path and map variables
    String path = "/nodes".replaceAll("\\{format\\}","json");

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
   * List of all nodes or if there are none an empty object
   * List of all nodes or if there are none an empty object
   * @param identifier Mac addresses and unique aliases to identify the node by, |\nexpect a string or an array of strings.
   * @return List<InlineResponse200>
   */
  public List<InlineResponse200> nodesIdentifierGet(String identifier) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling nodesIdentifierGet");
     }
     
    // create path and map variables
    String path = "/nodes/{identifier}".replaceAll("\\{format\\}","json")
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

    
    GenericType<List<InlineResponse200>> returnType = new GenericType<List<InlineResponse200>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Delete specified node.
   * Delete specified node.
   * @param identifier Mac addresses and unique aliases to identify the node by, |\nexpect a string or an array of strings.
   * @return void
   */
  public void nodesIdentifierDelete(String identifier) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling nodesIdentifierDelete");
     }
     
    // create path and map variables
    String path = "/nodes/{identifier}".replaceAll("\\{format\\}","json")
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

    
    apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, null);
    
  }
  
  /**
   * Patch specified node
   * Patch specified node
   * @param identifier Mac addresses and unique aliases to identify the node by, |\nexpect a string or an array of strings.
   * @param body object patches to apply.
   * @return InlineResponse200
   */
  public InlineResponse200 nodesIdentifierPatch(String identifier, Body body) throws ApiException {
    Object postBody = body;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling nodesIdentifierPatch");
     }
     
     // verify the required parameter 'body' is set
     if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling nodesIdentifierPatch");
     }
     
    // create path and map variables
    String path = "/nodes/{identifier}".replaceAll("\\{format\\}","json")
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
    return apiClient.invokeAPI(path, "PATCH", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Fetch catalog of specified node
   * Fetch catalog of specified node
   * @param identifier Mac addresses and unique aliases to identify the node by, |\nexpect a string or an array of strings.
   * @return InlineResponse200
   */
  public InlineResponse200 nodesIdentifierCatalogsGet(String identifier) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling nodesIdentifierCatalogsGet");
     }
     
    // create path and map variables
    String path = "/nodes/{identifier}/catalogs".replaceAll("\\{format\\}","json")
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
   * Fetch catalog of specified node for given source
   * Fetch catalog of specified node for given source
   * @param identifier Mac addresses and unique aliases to identify the node by, |\nexpect a string or an array of strings.
   * @param source Source catalog name to fetch
   * @return InlineResponse200
   */
  public InlineResponse200 nodesIdentifierCatalogsSourceGet(String identifier, String source) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling nodesIdentifierCatalogsSourceGet");
     }
     
     // verify the required parameter 'source' is set
     if (source == null) {
        throw new ApiException(400, "Missing the required parameter 'source' when calling nodesIdentifierCatalogsSourceGet");
     }
     
    // create path and map variables
    String path = "/nodes/{identifier}/catalogs/{source}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()))
      .replaceAll("\\{" + "source" + "\\}", apiClient.escapeString(source.toString()));

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
   * get the obm settings associated with a node.
   * get the obm settings associated with a node.
   * @param identifier Mac addresses and unique aliases to identify the node by, |\nexpect a string or an array of strings.
   * @return InlineResponse200
   */
  public InlineResponse200 nodesIdentifierObmGet(String identifier) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling nodesIdentifierObmGet");
     }
     
    // create path and map variables
    String path = "/nodes/{identifier}/obm".replaceAll("\\{format\\}","json")
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
   * set the obm settings associated with a node.
   * set he obm settings associated with a node.
   * @param identifier Mac addresses and unique aliases to identify the node by, |\nexpect a string or an array of strings.
   * @param body obm settings to apply.
   * @return void
   */
  public void nodesIdentifierObmPost(String identifier, Body1 body) throws ApiException {
    Object postBody = body;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling nodesIdentifierObmPost");
     }
     
     // verify the required parameter 'body' is set
     if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling nodesIdentifierObmPost");
     }
     
    // create path and map variables
    String path = "/nodes/{identifier}/obm".replaceAll("\\{format\\}","json")
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
  
  /**
   * Fetch all pollers for specified node
   * Fetch all pollers for specified node
   * @param identifier Mac addresses and unique aliases to identify the node by, |\nexpect a string or an array of strings.
   * @return InlineResponse200
   */
  public InlineResponse200 nodesIdentifierPollersGet(String identifier) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling nodesIdentifierPollersGet");
     }
     
    // create path and map variables
    String path = "/nodes/{identifier}/pollers".replaceAll("\\{format\\}","json")
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
   * Fetch all workflows for specified node
   * Fetch all workflows for specified node
   * @param identifier Mac addresses and unique aliases to identify the node by, |\nexpect a string or an array of strings.
   * @return InlineResponse200
   */
  public InlineResponse200 nodesIdentifierWorkflowsGet(String identifier) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling nodesIdentifierWorkflowsGet");
     }
     
    // create path and map variables
    String path = "/nodes/{identifier}/workflows".replaceAll("\\{format\\}","json")
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
   * create workflow for specified node
   * create workflow for specified node
   * @param identifier The node unique identifier
   * @param name The injectable Graph name
   * @param body 
   * @return InlineResponse200
   */
  public InlineResponse200 nodesIdentifierWorkflowsPost(String identifier, String name,  body) throws ApiException {
    Object postBody = body;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling nodesIdentifierWorkflowsPost");
     }
     
     // verify the required parameter 'name' is set
     if (name == null) {
        throw new ApiException(400, "Missing the required parameter 'name' when calling nodesIdentifierWorkflowsPost");
     }
     
    // create path and map variables
    String path = "/nodes/{identifier}/workflows".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "name", name));
    

    

    

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
   * Fetch currently running workflows for specified node
   * Fetch currently running workflows for specified node
   * @param identifier Mac addresses and unique aliases to identify the node by, |\nexpect a string or an array of strings.
   * @return InlineResponse200
   */
  public InlineResponse200 nodesIdentifierWorkflowsActiveGet(String identifier) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling nodesIdentifierWorkflowsActiveGet");
     }
     
    // create path and map variables
    String path = "/nodes/{identifier}/workflows/active".replaceAll("\\{format\\}","json")
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
   * Cancel currently running workflows for specified node
   * Cancel currently running workflows for specified node
   * @param identifier Mac addresses and unique aliases to identify the node by, |\nexpect a string or an array of strings.
   * @return InlineResponse200
   */
  public InlineResponse200 nodesIdentifierWorkflowsActiveDelete(String identifier) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling nodesIdentifierWorkflowsActiveDelete");
     }
     
    // create path and map variables
    String path = "/nodes/{identifier}/workflows/active".replaceAll("\\{format\\}","json")
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
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
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
  
  /**
   * get nodes for specific sku
   * get nodes for specific sku
   * @param identifier The profile name.
   * @return InlineResponse200
   */
  public InlineResponse200 skusIdentifierNodesGet(String identifier) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling skusIdentifierNodesGet");
     }
     
    // create path and map variables
    String path = "/skus/{identifier}/nodes".replaceAll("\\{format\\}","json")
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
  
}
