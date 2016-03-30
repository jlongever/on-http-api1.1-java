package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Catalog;
import io.swagger.client.model.Graphobject;
import io.swagger.client.model.Sku;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-30T15:00:31.422-04:00")
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
  public Node id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  public Node profile(String profile) {
    this.profile = profile;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("profile")
  public String getProfile() {
    return profile;
  }
  public void setProfile(String profile) {
    this.profile = profile;
  }

  
  /**
   **/
  public Node name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  public Node obmSettings(Object obmSettings) {
    this.obmSettings = obmSettings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("obmSettings")
  public Object getObmSettings() {
    return obmSettings;
  }
  public void setObmSettings(Object obmSettings) {
    this.obmSettings = obmSettings;
  }

  
  /**
   **/
  public Node ipAddresses(Object ipAddresses) {
    this.ipAddresses = ipAddresses;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ipAddresses")
  public Object getIpAddresses() {
    return ipAddresses;
  }
  public void setIpAddresses(Object ipAddresses) {
    this.ipAddresses = ipAddresses;
  }

  
  /**
   **/
  public Node workflows(List<Graphobject> workflows) {
    this.workflows = workflows;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("workflows")
  public List<Graphobject> getWorkflows() {
    return workflows;
  }
  public void setWorkflows(List<Graphobject> workflows) {
    this.workflows = workflows;
  }

  
  /**
   **/
  public Node catalogs(List<Catalog> catalogs) {
    this.catalogs = catalogs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("catalogs")
  public List<Catalog> getCatalogs() {
    return catalogs;
  }
  public void setCatalogs(List<Catalog> catalogs) {
    this.catalogs = catalogs;
  }

  
  /**
   **/
  public Node sku(Sku sku) {
    this.sku = sku;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sku")
  public Sku getSku() {
    return sku;
  }
  public void setSku(Sku sku) {
    this.sku = sku;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Node node = (Node) o;
    return Objects.equals(this.id, node.id) &&
        Objects.equals(this.profile, node.profile) &&
        Objects.equals(this.name, node.name) &&
        Objects.equals(this.obmSettings, node.obmSettings) &&
        Objects.equals(this.ipAddresses, node.ipAddresses) &&
        Objects.equals(this.workflows, node.workflows) &&
        Objects.equals(this.catalogs, node.catalogs) &&
        Objects.equals(this.sku, node.sku);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

