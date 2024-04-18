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
package org.apache.skywalking.oap.server.core.analysis.topn;

import org.apache.skywalking.oap.server.core.analysis.record.Record;
import org.apache.skywalking.oap.server.core.storage.ComparableStorageData;
import org.apache.skywalking.oap.server.core.storage.annotation.BanyanDB;
import org.apache.skywalking.oap.server.core.storage.annotation.Column;

/**
 * TopN data.
 */
public abstract class TopN extends Record implements ComparableStorageData {
    public static final String STATEMENT = "statement";
    public static final String LATENCY = "latency";
    public static final String TRACE_ID = "trace_id";
    public static final String ENTITY_ID = "entity_id";
    public static final String TIMESTAMP = "timestamp";
    @Column(name = LATENCY, dataType = Column.ValueDataType.SAMPLED_RECORD)
    @BanyanDB.IndexRule(indexType = BanyanDB.IndexRule.IndexType.TREE)
    private long latency;
    @Column(name = TRACE_ID, storageOnly = true)
    private String traceId;
    @Column(name = ENTITY_ID, length = 512)
    @BanyanDB.SeriesID(index = 0)
    private String entityId;
    @Column(name = TIMESTAMP)
    private long timestamp;

    @Override
    public int compareTo(Object o) {
        TopN target = (TopN) o;
        return (int) (latency - target.latency);
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public long getLatency() {
        return this.latency;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setLatency(final long latency) {
        this.latency = latency;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public String getTraceId() {
        return this.traceId;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setTraceId(final String traceId) {
        this.traceId = traceId;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public String getEntityId() {
        return this.entityId;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setEntityId(final String entityId) {
        this.entityId = entityId;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public long getTimestamp() {
        return this.timestamp;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setTimestamp(final long timestamp) {
        this.timestamp = timestamp;
    }
}
