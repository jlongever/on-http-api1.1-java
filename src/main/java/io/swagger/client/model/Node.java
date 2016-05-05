package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Catalog;
import io.swagger.client.model.Graphobject;
import io.swagger.client.model.Sku;
import java.util.*;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-05T13:17:45.132-04:00")
public class Node   {
  
  private String id = null;
  private String profile = null;
  private String name = null;
  private Object obmSettings = null;
  private Object ipAddresses = null;
  private List<Graphobject> workflows = new ArrayList<Graphobject>();
  private List<Catalog> catalogs = new ArrayList<Catalog>();
  private Sku sku = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("profile")
  public String getProfile() {
    return profile;
  }
  public void setProfile(String profile) {
    this.profile = profile;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("obmSettings")
  public Object getObmSettings() {
    return obmSettings;
  }
  public void setObmSettings(Object obmSettings) {
    this.obmSettings = obmSettings;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ipAddresses")
  public Object getIpAddresses() {
    return ipAddresses;
  }
  public void setIpAddresses(Object ipAddresses) {
    this.ipAddresses = ipAddresses;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("workflows")
  public List<Graphobject> getWorkflows() {
    return workflows;
  }
  public void setWorkflows(List<Graphobject> workflows) {
    this.workflows = workflows;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("catalogs")
  public List<Catalog> getCatalogs() {
    return catalogs;
  }
  public void setCatalogs(List<Catalog> catalogs) {
    this.catalogs = catalogs;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sku")
  public Sku getSku() {
    return sku;
  }
  public void setSku(Sku sku) {
    this.sku = sku;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Node node = (Node) o;
    return Objects.equals(id, node.id) &&
        Objects.equals(profile, node.profile) &&
        Objects.equals(name, node.name) &&
        Objects.equals(obmSettings, node.obmSettings) &&
        Objects.equals(ipAddresses, node.ipAddresses) &&
        Objects.equals(workflows, node.workflows) &&
        Objects.equals(catalogs, node.catalogs) &&
        Objects.equals(sku, node.sku);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, profile, name, obmSettings, ipAddresses, workflows, catalogs, sku);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Node {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    obmSettings: ").append(toIndentedString(obmSettings)).append("\n");
    sb.append("    ipAddresses: ").append(toIndentedString(ipAddresses)).append("\n");
    sb.append("    workflows: ").append(toIndentedString(workflows)).append("\n");
    sb.append("    catalogs: ").append(toIndentedString(catalogs)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

