package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Node;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-30T15:00:31.422-04:00")
public class Graphobject   {
  
  private String id = null;
  private String instanceid = null;
  private Object context = null;
  private Object definition = null;
  private Object tasks = null;
  private Node node = null;

  
  /**
   **/
  public Graphobject id(String id) {
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
  public Graphobject instanceid(String instanceid) {
    this.instanceid = instanceid;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("instanceid")
  public String getInstanceid() {
    return instanceid;
  }
  public void setInstanceid(String instanceid) {
    this.instanceid = instanceid;
  }

  
  /**
   **/
  public Graphobject context(Object context) {
    this.context = context;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("context")
  public Object getContext() {
    return context;
  }
  public void setContext(Object context) {
    this.context = context;
  }

  
  /**
   **/
  public Graphobject definition(Object definition) {
    this.definition = definition;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("definition")
  public Object getDefinition() {
    return definition;
  }
  public void setDefinition(Object definition) {
    this.definition = definition;
  }

  
  /**
   **/
  public Graphobject tasks(Object tasks) {
    this.tasks = tasks;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("tasks")
  public Object getTasks() {
    return tasks;
  }
  public void setTasks(Object tasks) {
    this.tasks = tasks;
  }

  
  /**
   **/
  public Graphobject node(Node node) {
    this.node = node;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("node")
  public Node getNode() {
    return node;
  }
  public void setNode(Node node) {
    this.node = node;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Graphobject graphobject = (Graphobject) o;
    return Objects.equals(this.id, graphobject.id) &&
        Objects.equals(this.instanceid, graphobject.instanceid) &&
        Objects.equals(this.context, graphobject.context) &&
        Objects.equals(this.definition, graphobject.definition) &&
        Objects.equals(this.tasks, graphobject.tasks) &&
        Objects.equals(this.node, graphobject.node);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, instanceid, context, definition, tasks, node);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Graphobject {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    instanceid: ").append(toIndentedString(instanceid)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
    sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
    sb.append("    node: ").append(toIndentedString(node)).append("\n");
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

