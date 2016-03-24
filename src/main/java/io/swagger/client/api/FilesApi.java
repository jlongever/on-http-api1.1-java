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
   * delete file based on uuid
   * Put file based on filename, returns the uuid of the stored file.
   * @param fileidentifier filename identifier of the file you wish to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void filesFileidentifierDelete(String fileidentifier) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'fileidentifier' is set
    if (fileidentifier == null) {
      throw new ApiException(400, "Missing the required parameter 'fileidentifier' when calling filesFileidentifierDelete");
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

    
    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * get file based on uuid
   * Get file based on uuid.
   * @param fileidentifier uuid of a file as provided when you originally stored it. (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object filesFileidentifierGet(String fileidentifier) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'fileidentifier' is set
    if (fileidentifier == null) {
      throw new ApiException(400, "Missing the required parameter 'fileidentifier' when calling filesFileidentifierGet");
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
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
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
  
}
