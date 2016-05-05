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

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-05T13:17:45.132-04:00")
public class LookupsApi {
  private ApiClient apiClient;

  public LookupsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public LookupsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * find all or by query parameter
   * find all or by query parameter
   * @param q query object to pass through to waterline.
   * @return List<InlineResponse200>
   */
  public List<InlineResponse200> lookupsGet(String q) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/lookups".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "q", q));
    

    

    

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
   * lookup id
   * lookup id
   * @param id id of thing to lookup
   * @return List<InlineResponse200>
   */
  public List<InlineResponse200> lookupsIdGet(String id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling lookupsIdGet");
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

    
    GenericType<List<InlineResponse200>> returnType = new GenericType<List<InlineResponse200>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
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
   * delete lookup id
   * delete lookup id
   * @param id id to delete
   * @return List<InlineResponse200>
   */
  public List<InlineResponse200> lookupsIdDelete(String id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling lookupsIdDelete");
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

    
    GenericType<List<InlineResponse200>> returnType = new GenericType<List<InlineResponse200>>() {};
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * patch lookup id
   * patch lookup id
   * @param id id to patch
   * @param body object patches to apply.
   * @return List<InlineResponse200>
   */
  public List<InlineResponse200> lookupsIdPatch(String id,  body) throws ApiException {
    Object postBody = body;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling lookupsIdPatch");
     }
     
     // verify the required parameter 'body' is set
     if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling lookupsIdPatch");
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

    
    GenericType<List<InlineResponse200>> returnType = new GenericType<List<InlineResponse200>>() {};
    return apiClient.invokeAPI(path, "PATCH", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
