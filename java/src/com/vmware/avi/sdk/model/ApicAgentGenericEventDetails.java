/*
 * Copyright 2021 VMware, Inc.
 * SPDX-License-Identifier: Apache License 2.0
 */

package com.vmware.avi.sdk.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * The ApicAgentGenericEventDetails is a POJO class extends AviRestResource that used for creating
 * ApicAgentGenericEventDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApicAgentGenericEventDetails  {
    @JsonProperty("contract_graphs")
    private List<String> contractGraphs;

    @JsonProperty("lif_cif_attachment")
    private List<String> lifCifAttachment;

    @JsonProperty("lifs")
    private List<String> lifs;

    @JsonProperty("networks")
    private List<String> networks;

    @JsonProperty("se_uuid")
    private String seUuid;

    @JsonProperty("service_engine_vnics")
    private List<String> serviceEngineVnics;

    @JsonProperty("tenant_name")
    private String tenantName;

    @JsonProperty("tenant_uuid")
    private String tenantUuid;

    @JsonProperty("vnic_network_attachment")
    private List<String> vnicNetworkAttachment;

    @JsonProperty("vs_name")
    private String vsName;

    @JsonProperty("vs_uuid")
    private String vsUuid;


    /**
     * This is the getter method this will return the attribute value.
     * Field deprecated in 21.1.1.
     * @return contractGraphs
     */
    public List<String> getContractGraphs() {
        return contractGraphs;
    }

    /**
     * This is the setter method. this will set the contractGraphs
     * Field deprecated in 21.1.1.
     * @return contractGraphs
     */
    public void setContractGraphs(List<String>  contractGraphs) {
        this.contractGraphs = contractGraphs;
    }

    /**
     * This is the setter method this will set the contractGraphs
     * Field deprecated in 21.1.1.
     * @return contractGraphs
     */
    public ApicAgentGenericEventDetails addContractGraphsItem(String contractGraphsItem) {
      if (this.contractGraphs == null) {
        this.contractGraphs = new ArrayList<String>();
      }
      this.contractGraphs.add(contractGraphsItem);
      return this;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Field deprecated in 21.1.1.
     * @return lifCifAttachment
     */
    public List<String> getLifCifAttachment() {
        return lifCifAttachment;
    }

    /**
     * This is the setter method. this will set the lifCifAttachment
     * Field deprecated in 21.1.1.
     * @return lifCifAttachment
     */
    public void setLifCifAttachment(List<String>  lifCifAttachment) {
        this.lifCifAttachment = lifCifAttachment;
    }

    /**
     * This is the setter method this will set the lifCifAttachment
     * Field deprecated in 21.1.1.
     * @return lifCifAttachment
     */
    public ApicAgentGenericEventDetails addLifCifAttachmentItem(String lifCifAttachmentItem) {
      if (this.lifCifAttachment == null) {
        this.lifCifAttachment = new ArrayList<String>();
      }
      this.lifCifAttachment.add(lifCifAttachmentItem);
      return this;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Field deprecated in 21.1.1.
     * @return lifs
     */
    public List<String> getLifs() {
        return lifs;
    }

    /**
     * This is the setter method. this will set the lifs
     * Field deprecated in 21.1.1.
     * @return lifs
     */
    public void setLifs(List<String>  lifs) {
        this.lifs = lifs;
    }

    /**
     * This is the setter method this will set the lifs
     * Field deprecated in 21.1.1.
     * @return lifs
     */
    public ApicAgentGenericEventDetails addLifsItem(String lifsItem) {
      if (this.lifs == null) {
        this.lifs = new ArrayList<String>();
      }
      this.lifs.add(lifsItem);
      return this;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Field deprecated in 21.1.1.
     * @return networks
     */
    public List<String> getNetworks() {
        return networks;
    }

    /**
     * This is the setter method. this will set the networks
     * Field deprecated in 21.1.1.
     * @return networks
     */
    public void setNetworks(List<String>  networks) {
        this.networks = networks;
    }

    /**
     * This is the setter method this will set the networks
     * Field deprecated in 21.1.1.
     * @return networks
     */
    public ApicAgentGenericEventDetails addNetworksItem(String networksItem) {
      if (this.networks == null) {
        this.networks = new ArrayList<String>();
      }
      this.networks.add(networksItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field deprecated in 21.1.1.
     * @return seUuid
     */
    public String getSeUuid() {
        return seUuid;
    }

    /**
     * This is the setter method to the attribute.
     * Field deprecated in 21.1.1.
     * @param seUuid set the seUuid.
     */
    public void setSeUuid(String  seUuid) {
        this.seUuid = seUuid;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Field deprecated in 21.1.1.
     * @return serviceEngineVnics
     */
    public List<String> getServiceEngineVnics() {
        return serviceEngineVnics;
    }

    /**
     * This is the setter method. this will set the serviceEngineVnics
     * Field deprecated in 21.1.1.
     * @return serviceEngineVnics
     */
    public void setServiceEngineVnics(List<String>  serviceEngineVnics) {
        this.serviceEngineVnics = serviceEngineVnics;
    }

    /**
     * This is the setter method this will set the serviceEngineVnics
     * Field deprecated in 21.1.1.
     * @return serviceEngineVnics
     */
    public ApicAgentGenericEventDetails addServiceEngineVnicsItem(String serviceEngineVnicsItem) {
      if (this.serviceEngineVnics == null) {
        this.serviceEngineVnics = new ArrayList<String>();
      }
      this.serviceEngineVnics.add(serviceEngineVnicsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field deprecated in 21.1.1.
     * @return tenantName
     */
    public String getTenantName() {
        return tenantName;
    }

    /**
     * This is the setter method to the attribute.
     * Field deprecated in 21.1.1.
     * @param tenantName set the tenantName.
     */
    public void setTenantName(String  tenantName) {
        this.tenantName = tenantName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field deprecated in 21.1.1.
     * @return tenantUuid
     */
    public String getTenantUuid() {
        return tenantUuid;
    }

    /**
     * This is the setter method to the attribute.
     * Field deprecated in 21.1.1.
     * @param tenantUuid set the tenantUuid.
     */
    public void setTenantUuid(String  tenantUuid) {
        this.tenantUuid = tenantUuid;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Field deprecated in 21.1.1.
     * @return vnicNetworkAttachment
     */
    public List<String> getVnicNetworkAttachment() {
        return vnicNetworkAttachment;
    }

    /**
     * This is the setter method. this will set the vnicNetworkAttachment
     * Field deprecated in 21.1.1.
     * @return vnicNetworkAttachment
     */
    public void setVnicNetworkAttachment(List<String>  vnicNetworkAttachment) {
        this.vnicNetworkAttachment = vnicNetworkAttachment;
    }

    /**
     * This is the setter method this will set the vnicNetworkAttachment
     * Field deprecated in 21.1.1.
     * @return vnicNetworkAttachment
     */
    public ApicAgentGenericEventDetails addVnicNetworkAttachmentItem(String vnicNetworkAttachmentItem) {
      if (this.vnicNetworkAttachment == null) {
        this.vnicNetworkAttachment = new ArrayList<String>();
      }
      this.vnicNetworkAttachment.add(vnicNetworkAttachmentItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field deprecated in 21.1.1.
     * @return vsName
     */
    public String getVsName() {
        return vsName;
    }

    /**
     * This is the setter method to the attribute.
     * Field deprecated in 21.1.1.
     * @param vsName set the vsName.
     */
    public void setVsName(String  vsName) {
        this.vsName = vsName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field deprecated in 21.1.1.
     * @return vsUuid
     */
    public String getVsUuid() {
        return vsUuid;
    }

    /**
     * This is the setter method to the attribute.
     * Field deprecated in 21.1.1.
     * @param vsUuid set the vsUuid.
     */
    public void setVsUuid(String  vsUuid) {
        this.vsUuid = vsUuid;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      ApicAgentGenericEventDetails objApicAgentGenericEventDetails = (ApicAgentGenericEventDetails) o;
      return   Objects.equals(this.vsUuid, objApicAgentGenericEventDetails.vsUuid)&&
  Objects.equals(this.vsName, objApicAgentGenericEventDetails.vsName)&&
  Objects.equals(this.lifs, objApicAgentGenericEventDetails.lifs)&&
  Objects.equals(this.serviceEngineVnics, objApicAgentGenericEventDetails.serviceEngineVnics)&&
  Objects.equals(this.networks, objApicAgentGenericEventDetails.networks)&&
  Objects.equals(this.contractGraphs, objApicAgentGenericEventDetails.contractGraphs)&&
  Objects.equals(this.seUuid, objApicAgentGenericEventDetails.seUuid)&&
  Objects.equals(this.tenantUuid, objApicAgentGenericEventDetails.tenantUuid)&&
  Objects.equals(this.tenantName, objApicAgentGenericEventDetails.tenantName)&&
  Objects.equals(this.lifCifAttachment, objApicAgentGenericEventDetails.lifCifAttachment)&&
  Objects.equals(this.vnicNetworkAttachment, objApicAgentGenericEventDetails.vnicNetworkAttachment);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ApicAgentGenericEventDetails {\n");
                  sb.append("    contractGraphs: ").append(toIndentedString(contractGraphs)).append("\n");
                        sb.append("    lifCifAttachment: ").append(toIndentedString(lifCifAttachment)).append("\n");
                        sb.append("    lifs: ").append(toIndentedString(lifs)).append("\n");
                        sb.append("    networks: ").append(toIndentedString(networks)).append("\n");
                        sb.append("    seUuid: ").append(toIndentedString(seUuid)).append("\n");
                        sb.append("    serviceEngineVnics: ").append(toIndentedString(serviceEngineVnics)).append("\n");
                        sb.append("    tenantName: ").append(toIndentedString(tenantName)).append("\n");
                        sb.append("    tenantUuid: ").append(toIndentedString(tenantUuid)).append("\n");
                        sb.append("    vnicNetworkAttachment: ").append(toIndentedString(vnicNetworkAttachment)).append("\n");
                        sb.append("    vsName: ").append(toIndentedString(vsName)).append("\n");
                        sb.append("    vsUuid: ").append(toIndentedString(vsUuid)).append("\n");
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
