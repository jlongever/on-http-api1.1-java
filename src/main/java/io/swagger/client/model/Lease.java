package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-05T13:17:45.132-04:00")
public class Lease   {
  
  private String mac = null;
  private String ipAddress = null;
  private Integer reservationTimer = null;
  private Long reservationExpiresAt = null;
  private Integer renewalTimer = null;
  private Integer rebindingTimer = null;
  private Integer expirationTimer = null;
  private Long renewalExpiresAt = null;
  private Long rebindExpiresAt = null;
  private Long leaseExpiresAt = null;
  private Boolean boundFlag = null;
  private Boolean reservedFlag = null;
  private String reserveTimer = null;

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("mac")
  public String getMac() {
    return mac;
  }
  public void setMac(String mac) {
    this.mac = mac;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("ipAddress")
  public String getIpAddress() {
    return ipAddress;
  }
  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("reservationTimer")
  public Integer getReservationTimer() {
    return reservationTimer;
  }
  public void setReservationTimer(Integer reservationTimer) {
    this.reservationTimer = reservationTimer;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("reservationExpiresAt")
  public Long getReservationExpiresAt() {
    return reservationExpiresAt;
  }
  public void setReservationExpiresAt(Long reservationExpiresAt) {
    this.reservationExpiresAt = reservationExpiresAt;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("renewalTimer")
  public Integer getRenewalTimer() {
    return renewalTimer;
  }
  public void setRenewalTimer(Integer renewalTimer) {
    this.renewalTimer = renewalTimer;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("rebindingTimer")
  public Integer getRebindingTimer() {
    return rebindingTimer;
  }
  public void setRebindingTimer(Integer rebindingTimer) {
    this.rebindingTimer = rebindingTimer;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("expirationTimer")
  public Integer getExpirationTimer() {
    return expirationTimer;
  }
  public void setExpirationTimer(Integer expirationTimer) {
    this.expirationTimer = expirationTimer;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("renewalExpiresAt")
  public Long getRenewalExpiresAt() {
    return renewalExpiresAt;
  }
  public void setRenewalExpiresAt(Long renewalExpiresAt) {
    this.renewalExpiresAt = renewalExpiresAt;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("rebindExpiresAt")
  public Long getRebindExpiresAt() {
    return rebindExpiresAt;
  }
  public void setRebindExpiresAt(Long rebindExpiresAt) {
    this.rebindExpiresAt = rebindExpiresAt;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("leaseExpiresAt")
  public Long getLeaseExpiresAt() {
    return leaseExpiresAt;
  }
  public void setLeaseExpiresAt(Long leaseExpiresAt) {
    this.leaseExpiresAt = leaseExpiresAt;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("boundFlag")
  public Boolean getBoundFlag() {
    return boundFlag;
  }
  public void setBoundFlag(Boolean boundFlag) {
    this.boundFlag = boundFlag;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("reservedFlag")
  public Boolean getReservedFlag() {
    return reservedFlag;
  }
  public void setReservedFlag(Boolean reservedFlag) {
    this.reservedFlag = reservedFlag;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("reserveTimer")
  public String getReserveTimer() {
    return reserveTimer;
  }
  public void setReserveTimer(String reserveTimer) {
    this.reserveTimer = reserveTimer;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Lease lease = (Lease) o;
    return Objects.equals(mac, lease.mac) &&
        Objects.equals(ipAddress, lease.ipAddress) &&
        Objects.equals(reservationTimer, lease.reservationTimer) &&
        Objects.equals(reservationExpiresAt, lease.reservationExpiresAt) &&
        Objects.equals(renewalTimer, lease.renewalTimer) &&
        Objects.equals(rebindingTimer, lease.rebindingTimer) &&
        Objects.equals(expirationTimer, lease.expirationTimer) &&
        Objects.equals(renewalExpiresAt, lease.renewalExpiresAt) &&
        Objects.equals(rebindExpiresAt, lease.rebindExpiresAt) &&
        Objects.equals(leaseExpiresAt, lease.leaseExpiresAt) &&
        Objects.equals(boundFlag, lease.boundFlag) &&
        Objects.equals(reservedFlag, lease.reservedFlag) &&
        Objects.equals(reserveTimer, lease.reserveTimer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mac, ipAddress, reservationTimer, reservationExpiresAt, renewalTimer, rebindingTimer, expirationTimer, renewalExpiresAt, rebindExpiresAt, leaseExpiresAt, boundFlag, reservedFlag, reserveTimer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Lease {\n");
    
    sb.append("    mac: ").append(toIndentedString(mac)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    reservationTimer: ").append(toIndentedString(reservationTimer)).append("\n");
    sb.append("    reservationExpiresAt: ").append(toIndentedString(reservationExpiresAt)).append("\n");
    sb.append("    renewalTimer: ").append(toIndentedString(renewalTimer)).append("\n");
    sb.append("    rebindingTimer: ").append(toIndentedString(rebindingTimer)).append("\n");
    sb.append("    expirationTimer: ").append(toIndentedString(expirationTimer)).append("\n");
    sb.append("    renewalExpiresAt: ").append(toIndentedString(renewalExpiresAt)).append("\n");
    sb.append("    rebindExpiresAt: ").append(toIndentedString(rebindExpiresAt)).append("\n");
    sb.append("    leaseExpiresAt: ").append(toIndentedString(leaseExpiresAt)).append("\n");
    sb.append("    boundFlag: ").append(toIndentedString(boundFlag)).append("\n");
    sb.append("    reservedFlag: ").append(toIndentedString(reservedFlag)).append("\n");
    sb.append("    reserveTimer: ").append(toIndentedString(reserveTimer)).append("\n");
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

