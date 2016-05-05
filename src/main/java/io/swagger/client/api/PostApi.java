package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import io.swagger.client.model.InlineResponse200;
import io.swagger.client.model.Error;
import io.swagger.client.model.Content;
import io.swagger.client.model.Content1;
import io.swagger.client.model.Identifiers;
import io.swagger.client.model.Body1;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-05T13:17:45.132-04:00")
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
   * @param fileidentifier filename of the file you want to store
   * @return InlineResponse200
   */
  public InlineResponse200 filesFileidentifierPut(String fileidentifier) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'fileidentifier' is set
     if (fileidentifier == null) {
        throw new ApiException(400, "Missing the required parameter 'fileidentifier' when calling filesFileidentifierPut");
     }
     
    // create path and map variables
    String path = "/files/{fileidentifier}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "fileidentifier" + "\\}", apiClient.escapeString(fileidentifier.toString()));

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
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * find all
   * put all
   * @param content foo
   * @return InlineResponse200
   */
  public InlineResponse200 lookupsPost(Content content) throws ApiException {
    Object postBody = content;
    
     // verify the required parameter 'content' is set
     if (content == null) {
        throw new ApiException(400, "Missing the required parameter 'content' when calling lookupsPost");
     }
     
    // create path and map variables
    String path = "/lookups".replaceAll("\\{format\\}","json");

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
   * post id
   * post id
   * @param id id of thing to lookup
   * @param content foo
   * @return InlineResponse200
   */
  public InlineResponse200 lookupsIdPost(String id, Content1 content) throws ApiException {
    Object postBody = content;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling lookupsIdPost");
     }
     
     // verify the required parameter 'content' is set
     if (content == null) {
        throw new ApiException(400, "Missing the required parameter 'content' when calling lookupsIdPost");
     }
     
    // create path and map variables
    String path = "/lookups/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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
   * create a sku
   * create a sku
   * @return InlineResponse200
   */
  public InlineResponse200 skusPost() throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/skus".replaceAll("\\{format\\}","json");

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
   * create an unbound workflow
   * create an unbound workflow
   * @param name The injectable Graph name
   * @param body 
   * @return InlineResponse200
   */
  public InlineResponse200 workflowsPost(String name,  body) throws ApiException {
    Object postBody = body;
    
     // verify the required parameter 'name' is set
     if (name == null) {
        throw new ApiException(400, "Missing the required parameter 'name' when calling workflowsPost");
     }
     
    // create path and map variables
    String path = "/workflows".replaceAll("\\{format\\}","json");

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
  
}
