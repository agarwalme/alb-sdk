// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// RmBindVsSeEventDetails rm bind vs se event details
// swagger:model RmBindVsSeEventDetails
type RmBindVsSeEventDetails struct {

	// ip of RmBindVsSeEventDetails.
	IP *string `json:"ip,omitempty"`

	// ip6 of RmBindVsSeEventDetails.
	Ip6 *string `json:"ip6,omitempty"`

	// List of placement_networks configured on this interface. Field introduced in 20.1.5.
	Networks []string `json:"networks,omitempty"`

	// Placeholder for description of property primary of obj type RmBindVsSeEventDetails field type str  type boolean
	Primary *bool `json:"primary,omitempty"`

	// se_name of RmBindVsSeEventDetails.
	SeName *string `json:"se_name,omitempty"`

	// Placeholder for description of property standby of obj type RmBindVsSeEventDetails field type str  type boolean
	Standby *bool `json:"standby,omitempty"`

	// type of RmBindVsSeEventDetails.
	Type *string `json:"type,omitempty"`

	// vip_vnics of RmBindVsSeEventDetails.
	VipVnics []string `json:"vip_vnics,omitempty"`

	// vs_name of RmBindVsSeEventDetails.
	VsName *string `json:"vs_name,omitempty"`

	// Unique object identifier of vs.
	VsUUID *string `json:"vs_uuid,omitempty"`
}
