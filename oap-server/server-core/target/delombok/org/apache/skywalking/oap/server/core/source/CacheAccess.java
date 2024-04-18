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

import org.apache.skywalking.oap.server.core.analysis.IDManager;
import static org.apache.skywalking.oap.server.core.source.DefaultScopeDefine.CACHE_ACCESS;
import static org.apache.skywalking.oap.server.core.source.DefaultScopeDefine.SERVICE_CATALOG_NAME;

@ScopeDeclaration(id = CACHE_ACCESS, name = "CacheAccess", catalog = SERVICE_CATALOG_NAME)
@ScopeDefaultColumn.VirtualColumnDefinition(fieldName = "entityId", columnName = "entity_id", isID = true, type = String.class)
public class CacheAccess extends Source {
    @Override
    public int scope() {
        return CACHE_ACCESS;
    }

    @Override
    public String getEntityId() {
        if (entityId == null) {
            entityId = IDManager.ServiceID.buildId(name, false);
        }
        return entityId;
    }

    private String entityId;
    @ScopeDefaultColumn.DefinedByField(columnName = "name", requireDynamicActive = true)
    private String name;
    private int cacheTypeId;
    private int latency;
    private boolean status;
    private VirtualCacheOperation operation;

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public String getName() {
        return this.name;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setName(final String name) {
        this.name = name;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public int getCacheTypeId() {
        return this.cacheTypeId;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setCacheTypeId(final int cacheTypeId) {
        this.cacheTypeId = cacheTypeId;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public int getLatency() {
        return this.latency;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setLatency(final int latency) {
        this.latency = latency;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public boolean isStatus() {
        return this.status;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setStatus(final boolean status) {
        this.status = status;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public VirtualCacheOperation getOperation() {
        return this.operation;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setOperation(final VirtualCacheOperation operation) {
        this.operation = operation;
    }
}
