// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeVsFaultEventDetails se vs fault event details
// swagger:model SeVsFaultEventDetails
type SeVsFaultEventDetails struct {

	// Name of the object responsible for the fault.
	FaultObject *string `json:"fault_object,omitempty"`

	// Reason for the fault.
	FaultReason *string `json:"fault_reason,omitempty"`

	// SE uuid. It is a reference to an object of type ServiceEngine.
	ServiceEngine *string `json:"service_engine,omitempty"`

	// VS name. It is a reference to an object of type VirtualService.
	VirtualService *string `json:"virtual_service,omitempty"`
}
