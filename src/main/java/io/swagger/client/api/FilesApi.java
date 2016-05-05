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
public class FilesApi {
  private ApiClient apiClient;

  public FilesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public FilesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * get file based on uuid
   * Get file based on uuid.
   * @param fileidentifier uuid of a file as provided when you originally stored it.
   * @return InlineResponse200
   */
  public InlineResponse200 filesFileidentifierGet(String fileidentifier) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'fileidentifier' is set
     if (fileidentifier == null) {
        throw new ApiException(400, "Missing the required parameter 'fileidentifier' when calling filesFileidentifierGet");
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
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
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
   * delete file based on uuid
   * Put file based on filename, returns the uuid of the stored file.
   * @param fileidentifier filename identifier of the file you wish to delete
   * @return void
   */
  public void filesFileidentifierDelete(String fileidentifier) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'fileidentifier' is set
     if (fileidentifier == null) {
        throw new ApiException(400, "Missing the required parameter 'fileidentifier' when calling filesFileidentifierDelete");
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

    
    apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, null);
    
  }
  
}
