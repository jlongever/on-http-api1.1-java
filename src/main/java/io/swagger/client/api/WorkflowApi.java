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
public class WorkflowApi {
  private ApiClient apiClient;

  public WorkflowApi() {
    this(Configuration.getDefaultApiClient());
  }

  public WorkflowApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
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
   * Fetch workflows
   * Fetch workflows
   * @return InlineResponse200
   */
  public InlineResponse200 workflowsGet() throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/workflows".replaceAll("\\{format\\}","json");

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
   * define new workflow
   * define new workflow
   * @param body 
   * @return InlineResponse200
   */
  public InlineResponse200 workflowsPut( body) throws ApiException {
    Object postBody = body;
    
    // create path and map variables
    String path = "/workflows".replaceAll("\\{format\\}","json");

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
  
  /**
   * List all workflows available to run
   * List all workflows available to run
   * @return InlineResponse200
   */
  public InlineResponse200 workflowsLibraryGet() throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/workflows/library".replaceAll("\\{format\\}","json");

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
   * List all workflows available to run
   * List all workflows available to run
   * @param injectableName 
   * @return InlineResponse200
   */
  public InlineResponse200 workflowsLibraryInjectableNameGet(String injectableName) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'injectableName' is set
     if (injectableName == null) {
        throw new ApiException(400, "Missing the required parameter 'injectableName' when calling workflowsLibraryInjectableNameGet");
     }
     
    // create path and map variables
    String path = "/workflows/library/{injectableName}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "injectableName" + "\\}", apiClient.escapeString(injectableName.toString()));

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
   * Fetch tasks from task library
   * Fetch tasks from task library
   * @return InlineResponse200
   */
  public InlineResponse200 workflowsTasksGet() throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/workflows/tasks".replaceAll("\\{format\\}","json");

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
   * Add tasks to task library
   * Add tasks to task library
   * @param body 
   * @return InlineResponse200
   */
  public InlineResponse200 workflowsTasksPut( body) throws ApiException {
    Object postBody = body;
    
    // create path and map variables
    String path = "/workflows/tasks".replaceAll("\\{format\\}","json");

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
   * List workflow tasks library
   * List workflow tasks library
   * @return InlineResponse200
   */
  public InlineResponse200 workflowsTasksLibraryGet() throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/workflows/tasks/library".replaceAll("\\{format\\}","json");

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
   * Fetch workflow by instance ID
   * Fetch workflow by instance ID
   * @param instanceId 
   * @return InlineResponse200
   */
  public InlineResponse200 workflowsInstanceIdGet(String instanceId) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'instanceId' is set
     if (instanceId == null) {
        throw new ApiException(400, "Missing the required parameter 'instanceId' when calling workflowsInstanceIdGet");
     }
     
    // create path and map variables
    String path = "/workflows/{instanceId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "instanceId" + "\\}", apiClient.escapeString(instanceId.toString()));

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
