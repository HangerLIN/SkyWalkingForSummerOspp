// Generated by delombok at Thu Apr 18 20:39:51 CST 2024
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
package org.apache.skywalking.oap.server.core.source;

import org.apache.skywalking.oap.server.core.Const;
import org.apache.skywalking.oap.server.core.analysis.IDManager;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import static org.apache.skywalking.oap.server.core.source.DefaultScopeDefine.SERVICE_LABEL;

@ScopeDeclaration(id = SERVICE_LABEL, name = "ServiceLabel")
@ScopeDefaultColumn.VirtualColumnDefinition(fieldName = "entityId", columnName = "entity_id", isID = true, type = String.class)
public class ServiceLabel extends Source {
    private volatile String entityId;

    @Override
    public int scope() {
        return SERVICE_LABEL;
    }

    @Override
    public String getEntityId() {
        if (entityId == null) {
            entityId = serviceId + Const.ID_CONNECTOR + new String(Base64.getEncoder().encode(label.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        }
        return entityId;
    }

    private String serviceId;
    private boolean isServiceNormal;
    private String serviceName;
    private String label;

    @Override
    public void prepare() {
        serviceId = IDManager.ServiceID.buildId(serviceName, isServiceNormal);
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public String getServiceId() {
        return this.serviceId;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setServiceNormal(final boolean isServiceNormal) {
        this.isServiceNormal = isServiceNormal;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public boolean isServiceNormal() {
        return this.isServiceNormal;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setServiceName(final String serviceName) {
        this.serviceName = serviceName;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public String getServiceName() {
        return this.serviceName;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setLabel(final String label) {
        this.label = label;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public String getLabel() {
        return this.label;
    }
}
