package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-30T15:00:31.422-04:00")
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
  public Lease mac(String mac) {
    this.mac = mac;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("mac")
  public String getMac() {
    return mac;
  }
  public void setMac(String mac) {
    this.mac = mac;
  }

  
  /**
   **/
  public Lease ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("ipAddress")
  public String getIpAddress() {
    return ipAddress;
  }
  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  
  /**
   **/
  public Lease reservationTimer(Integer reservationTimer) {
    this.reservationTimer = reservationTimer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("reservationTimer")
  public Integer getReservationTimer() {
    return reservationTimer;
  }
  public void setReservationTimer(Integer reservationTimer) {
    this.reservationTimer = reservationTimer;
  }

  
  /**
   **/
  public Lease reservationExpiresAt(Long reservationExpiresAt) {
    this.reservationExpiresAt = reservationExpiresAt;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("reservationExpiresAt")
  public Long getReservationExpiresAt() {
    return reservationExpiresAt;
  }
  public void setReservationExpiresAt(Long reservationExpiresAt) {
    this.reservationExpiresAt = reservationExpiresAt;
  }

  
  /**
   **/
  public Lease renewalTimer(Integer renewalTimer) {
    this.renewalTimer = renewalTimer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("renewalTimer")
  public Integer getRenewalTimer() {
    return renewalTimer;
  }
  public void setRenewalTimer(Integer renewalTimer) {
    this.renewalTimer = renewalTimer;
  }

  
  /**
   **/
  public Lease rebindingTimer(Integer rebindingTimer) {
    this.rebindingTimer = rebindingTimer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("rebindingTimer")
  public Integer getRebindingTimer() {
    return rebindingTimer;
  }
  public void setRebindingTimer(Integer rebindingTimer) {
    this.rebindingTimer = rebindingTimer;
  }

  
  /**
   **/
  public Lease expirationTimer(Integer expirationTimer) {
    this.expirationTimer = expirationTimer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("expirationTimer")
  public Integer getExpirationTimer() {
    return expirationTimer;
  }
  public void setExpirationTimer(Integer expirationTimer) {
    this.expirationTimer = expirationTimer;
  }

  
  /**
   **/
  public Lease renewalExpiresAt(Long renewalExpiresAt) {
    this.renewalExpiresAt = renewalExpiresAt;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("renewalExpiresAt")
  public Long getRenewalExpiresAt() {
    return renewalExpiresAt;
  }
  public void setRenewalExpiresAt(Long renewalExpiresAt) {
    this.renewalExpiresAt = renewalExpiresAt;
  }

  
  /**
   **/
  public Lease rebindExpiresAt(Long rebindExpiresAt) {
    this.rebindExpiresAt = rebindExpiresAt;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("rebindExpiresAt")
  public Long getRebindExpiresAt() {
    return rebindExpiresAt;
  }
  public void setRebindExpiresAt(Long rebindExpiresAt) {
    this.rebindExpiresAt = rebindExpiresAt;
  }

  
  /**
   **/
  public Lease leaseExpiresAt(Long leaseExpiresAt) {
    this.leaseExpiresAt = leaseExpiresAt;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("leaseExpiresAt")
  public Long getLeaseExpiresAt() {
    return leaseExpiresAt;
  }
  public void setLeaseExpiresAt(Long leaseExpiresAt) {
    this.leaseExpiresAt = leaseExpiresAt;
  }

  
  /**
   **/
  public Lease boundFlag(Boolean boundFlag) {
    this.boundFlag = boundFlag;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("boundFlag")
  public Boolean getBoundFlag() {
    return boundFlag;
  }
  public void setBoundFlag(Boolean boundFlag) {
    this.boundFlag = boundFlag;
  }

  
  /**
   **/
  public Lease reservedFlag(Boolean reservedFlag) {
    this.reservedFlag = reservedFlag;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("reservedFlag")
  public Boolean getReservedFlag() {
    return reservedFlag;
  }
  public void setReservedFlag(Boolean reservedFlag) {
    this.reservedFlag = reservedFlag;
  }

  
  /**
   **/
  public Lease reserveTimer(String reserveTimer) {
    this.reserveTimer = reserveTimer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("reserveTimer")
  public String getReserveTimer() {
    return reserveTimer;
  }
  public void setReserveTimer(String reserveTimer) {
    this.reserveTimer = reserveTimer;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Lease lease = (Lease) o;
    return Objects.equals(this.mac, lease.mac) &&
        Objects.equals(this.ipAddress, lease.ipAddress) &&
        Objects.equals(this.reservationTimer, lease.reservationTimer) &&
        Objects.equals(this.reservationExpiresAt, lease.reservationExpiresAt) &&
        Objects.equals(this.renewalTimer, lease.renewalTimer) &&
        Objects.equals(this.rebindingTimer, lease.rebindingTimer) &&
        Objects.equals(this.expirationTimer, lease.expirationTimer) &&
        Objects.equals(this.renewalExpiresAt, lease.renewalExpiresAt) &&
        Objects.equals(this.rebindExpiresAt, lease.rebindExpiresAt) &&
        Objects.equals(this.leaseExpiresAt, lease.leaseExpiresAt) &&
        Objects.equals(this.boundFlag, lease.boundFlag) &&
        Objects.equals(this.reservedFlag, lease.reservedFlag) &&
        Objects.equals(this.reserveTimer, lease.reserveTimer);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

