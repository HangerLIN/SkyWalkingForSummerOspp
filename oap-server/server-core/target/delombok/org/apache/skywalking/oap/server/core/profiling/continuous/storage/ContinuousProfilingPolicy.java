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
package org.apache.skywalking.oap.server.core.profiling.continuous.storage;

import org.apache.skywalking.oap.server.core.analysis.Stream;
import org.apache.skywalking.oap.server.core.analysis.management.ManagementData;
import org.apache.skywalking.oap.server.core.analysis.worker.ManagementStreamProcessor;
import org.apache.skywalking.oap.server.core.source.ScopeDeclaration;
import org.apache.skywalking.oap.server.core.storage.StorageID;
import org.apache.skywalking.oap.server.core.storage.annotation.Column;
import org.apache.skywalking.oap.server.core.storage.type.Convert2Entity;
import org.apache.skywalking.oap.server.core.storage.type.Convert2Storage;
import org.apache.skywalking.oap.server.core.storage.type.StorageBuilder;
import static org.apache.skywalking.oap.server.core.source.DefaultScopeDefine.CONTINUOUS_PROFILING_POLICY;

@ScopeDeclaration(id = CONTINUOUS_PROFILING_POLICY, name = "ContinuousProfilingPolicy")
@Stream(name = ContinuousProfilingPolicy.INDEX_NAME, scopeId = CONTINUOUS_PROFILING_POLICY, builder = ContinuousProfilingPolicy.Builder.class, processor = ManagementStreamProcessor.class)
public class ContinuousProfilingPolicy extends ManagementData {
    public static final String INDEX_NAME = "continuous_profiling_policy";
    public static final String SERVICE_ID = "service_id";
    public static final String UUID = "uuid";
    public static final String CONFIGURATION_JSON = "configuration_json";
    @Column(name = SERVICE_ID)
    private String serviceId;
    @Column(name = CONFIGURATION_JSON, storageOnly = true, length = 5000)
    private String configurationJson;
    @Column(name = UUID)
    private String uuid;

    @Override
    public StorageID id() {
        return new StorageID().append(SERVICE_ID, serviceId);
    }


    public static class Builder implements StorageBuilder<ContinuousProfilingPolicy> {
        @Override
        public ContinuousProfilingPolicy storage2Entity(Convert2Entity converter) {
            final ContinuousProfilingPolicy policy = new ContinuousProfilingPolicy();
            policy.setServiceId((String) converter.get(SERVICE_ID));
            policy.setUuid((String) converter.get(UUID));
            policy.setConfigurationJson((String) converter.get(CONFIGURATION_JSON));
            return policy;
        }

        @Override
        public void entity2Storage(ContinuousProfilingPolicy entity, Convert2Storage converter) {
            converter.accept(SERVICE_ID, entity.getServiceId());
            converter.accept(UUID, entity.getUuid());
            converter.accept(CONFIGURATION_JSON, entity.getConfigurationJson());
        }
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setServiceId(final String serviceId) {
        this.serviceId = serviceId;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setConfigurationJson(final String configurationJson) {
        this.configurationJson = configurationJson;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setUuid(final String uuid) {
        this.uuid = uuid;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public String getServiceId() {
        return this.serviceId;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public String getConfigurationJson() {
        return this.configurationJson;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public String getUuid() {
        return this.uuid;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof ContinuousProfilingPolicy)) return false;
        final ContinuousProfilingPolicy other = (ContinuousProfilingPolicy) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$serviceId = this.getServiceId();
        final java.lang.Object other$serviceId = other.getServiceId();
        if (this$serviceId == null ? other$serviceId != null : !this$serviceId.equals(other$serviceId)) return false;
        return true;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof ContinuousProfilingPolicy;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $serviceId = this.getServiceId();
        result = result * PRIME + ($serviceId == null ? 43 : $serviceId.hashCode());
        return result;
    }
}
