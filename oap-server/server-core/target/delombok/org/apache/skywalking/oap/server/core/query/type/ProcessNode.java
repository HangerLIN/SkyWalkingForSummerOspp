// Generated by delombok at Thu Apr 18 20:39:52 CST 2024
/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package org.apache.skywalking.oap.server.core.query.type;

public class ProcessNode {
    private String id;
    private String serviceId;
    private String serviceName;
    private String serviceInstanceId;
    private String serviceInstanceName;
    private String name;
    private boolean isReal;

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public ProcessNode() {
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public String getId() {
        return this.id;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public String getServiceId() {
        return this.serviceId;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public String getServiceName() {
        return this.serviceName;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public String getServiceInstanceId() {
        return this.serviceInstanceId;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public String getServiceInstanceName() {
        return this.serviceInstanceName;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public String getName() {
        return this.name;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public boolean isReal() {
        return this.isReal;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setId(final String id) {
        this.id = id;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setServiceId(final String serviceId) {
        this.serviceId = serviceId;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setServiceName(final String serviceName) {
        this.serviceName = serviceName;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setServiceInstanceId(final String serviceInstanceId) {
        this.serviceInstanceId = serviceInstanceId;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setServiceInstanceName(final String serviceInstanceName) {
        this.serviceInstanceName = serviceInstanceName;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setName(final String name) {
        this.name = name;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setReal(final boolean isReal) {
        this.isReal = isReal;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof ProcessNode)) return false;
        final ProcessNode other = (ProcessNode) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        if (this.isReal() != other.isReal()) return false;
        final java.lang.Object this$id = this.getId();
        final java.lang.Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final java.lang.Object this$serviceId = this.getServiceId();
        final java.lang.Object other$serviceId = other.getServiceId();
        if (this$serviceId == null ? other$serviceId != null : !this$serviceId.equals(other$serviceId)) return false;
        final java.lang.Object this$serviceName = this.getServiceName();
        final java.lang.Object other$serviceName = other.getServiceName();
        if (this$serviceName == null ? other$serviceName != null : !this$serviceName.equals(other$serviceName)) return false;
        final java.lang.Object this$serviceInstanceId = this.getServiceInstanceId();
        final java.lang.Object other$serviceInstanceId = other.getServiceInstanceId();
        if (this$serviceInstanceId == null ? other$serviceInstanceId != null : !this$serviceInstanceId.equals(other$serviceInstanceId)) return false;
        final java.lang.Object this$serviceInstanceName = this.getServiceInstanceName();
        final java.lang.Object other$serviceInstanceName = other.getServiceInstanceName();
        if (this$serviceInstanceName == null ? other$serviceInstanceName != null : !this$serviceInstanceName.equals(other$serviceInstanceName)) return false;
        final java.lang.Object this$name = this.getName();
        final java.lang.Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        return true;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof ProcessNode;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.isReal() ? 79 : 97);
        final java.lang.Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final java.lang.Object $serviceId = this.getServiceId();
        result = result * PRIME + ($serviceId == null ? 43 : $serviceId.hashCode());
        final java.lang.Object $serviceName = this.getServiceName();
        result = result * PRIME + ($serviceName == null ? 43 : $serviceName.hashCode());
        final java.lang.Object $serviceInstanceId = this.getServiceInstanceId();
        result = result * PRIME + ($serviceInstanceId == null ? 43 : $serviceInstanceId.hashCode());
        final java.lang.Object $serviceInstanceName = this.getServiceInstanceName();
        result = result * PRIME + ($serviceInstanceName == null ? 43 : $serviceInstanceName.hashCode());
        final java.lang.Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        return result;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public java.lang.String toString() {
        return "ProcessNode(id=" + this.getId() + ", serviceId=" + this.getServiceId() + ", serviceName=" + this.getServiceName() + ", serviceInstanceId=" + this.getServiceInstanceId() + ", serviceInstanceName=" + this.getServiceInstanceName() + ", name=" + this.getName() + ", isReal=" + this.isReal() + ")";
    }
}
