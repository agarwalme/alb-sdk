// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ImageEventMap image event map
// swagger:model ImageEventMap
type ImageEventMap struct {

	// List of all events node wise. Field introduced in 21.1.3.
	NodesEvents []*ImageEvent `json:"nodes_events,omitempty"`

	// List of all events node wise. Field introduced in 21.1.3.
	SubEvents []*ImageEvent `json:"sub_events,omitempty"`

	// Name representing the task. Field introduced in 21.1.3.
	TaskName *string `json:"task_name,omitempty"`
}
