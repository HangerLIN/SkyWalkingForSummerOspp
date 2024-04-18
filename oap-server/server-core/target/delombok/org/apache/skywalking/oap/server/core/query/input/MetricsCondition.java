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
package org.apache.skywalking.oap.server.core.query.input;

import org.apache.skywalking.oap.server.core.query.MetricsMetadataQueryService;
import org.apache.skywalking.oap.server.core.query.enumeration.MetricsType;
import org.apache.skywalking.oap.server.core.storage.annotation.ValueColumnMetadata;

/**
 * @since 8.0.0
 */
public class MetricsCondition {
    /**
     * Metrics name
     */
    private String name;
    /**
     * See {@link Entity}
     */
    private Entity entity;

    /**
     * Sense Scope through metric name.
     * @return false if not a valid metric name.
     */
    public boolean senseScope() {
        if (MetricsType.UNKNOWN.equals(MetricsMetadataQueryService.typeOfMetrics(name))) {
            return false;
        }
        entity.setScope(ValueColumnMetadata.INSTANCE.getScope(name));
        return true;
    }

    /**
     * Metrics name
     */
    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public String getName() {
        return this.name;
    }

    /**
     * See {@link Entity}
     */
    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public Entity getEntity() {
        return this.entity;
    }

    /**
     * Metrics name
     */
    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * See {@link Entity}
     */
    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setEntity(final Entity entity) {
        this.entity = entity;
    }
}
