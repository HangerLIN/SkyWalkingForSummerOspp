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
package org.apache.skywalking.oap.server.core.analysis.manual.instance;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.apache.skywalking.oap.server.core.Const;
import org.apache.skywalking.oap.server.core.analysis.IDManager;
import org.apache.skywalking.oap.server.core.analysis.MetricsExtension;
import org.apache.skywalking.oap.server.core.analysis.Stream;
import org.apache.skywalking.oap.server.core.analysis.metrics.Metrics;
import org.apache.skywalking.oap.server.core.analysis.worker.MetricsStreamProcessor;
import org.apache.skywalking.oap.server.core.remote.grpc.proto.RemoteData;
import org.apache.skywalking.oap.server.core.storage.StorageID;
import org.apache.skywalking.oap.server.core.storage.annotation.BanyanDB;
import org.apache.skywalking.oap.server.core.storage.annotation.Column;
import org.apache.skywalking.oap.server.core.storage.annotation.ElasticSearch;
import org.apache.skywalking.oap.server.core.storage.type.Convert2Entity;
import org.apache.skywalking.oap.server.core.storage.type.Convert2Storage;
import org.apache.skywalking.oap.server.core.storage.type.StorageBuilder;
import org.apache.skywalking.oap.server.library.util.StringUtil;
import static org.apache.skywalking.oap.server.core.source.DefaultScopeDefine.SERVICE_INSTANCE;

@Stream(name = InstanceTraffic.INDEX_NAME, scopeId = SERVICE_INSTANCE, builder = InstanceTraffic.Builder.class, processor = MetricsStreamProcessor.class)
@MetricsExtension(supportDownSampling = false, supportUpdate = true)
public class InstanceTraffic extends Metrics {
    public static final String INDEX_NAME = "instance_traffic";
    public static final String SERVICE_ID = "service_id";
    public static final String NAME = "instance_traffic_name";
    public static final String LAST_PING_TIME_BUCKET = "last_ping";
    public static final String PROPERTIES = "properties";
    private static final Gson GSON = new Gson();
    @Column(name = SERVICE_ID)
    @BanyanDB.SeriesID(index = 0)
    private String serviceId;
    @Column(name = NAME, storageOnly = true)
    @ElasticSearch.Column(legacyName = "name")
    @BanyanDB.SeriesID(index = 1)
    private String name;
    @Column(name = LAST_PING_TIME_BUCKET)
    private long lastPingTimestamp;
    @Column(name = PROPERTIES, storageOnly = true, length = 50000)
    private JsonObject properties;

    @Override
    public boolean combine(final Metrics metrics) {
        final InstanceTraffic instanceTraffic = (InstanceTraffic) metrics;
        this.lastPingTimestamp = instanceTraffic.getLastPingTimestamp();
        if (instanceTraffic.getProperties() != null && instanceTraffic.getProperties().size() > 0) {
            if (this.properties == null) {
                this.properties = new JsonObject();
            }
            instanceTraffic.getProperties().entrySet().forEach(it -> this.properties.add(it.getKey(), it.getValue()));
        }
        if (this.getTimeBucket() > metrics.getTimeBucket()) {
            this.setTimeBucket(metrics.getTimeBucket());
        }
        return true;
    }

    /**
     * Keep the time bucket as the same time inserted.
     */
    @Override
    public int remoteHashCode() {
        return this.hashCode();
    }

    @Override
    public void deserialize(final RemoteData remoteData) {
        setServiceId(remoteData.getDataStrings(0));
        setName(remoteData.getDataStrings(1));
        final String propString = remoteData.getDataStrings(2);
        if (StringUtil.isNotEmpty(propString)) {
            setProperties(GSON.fromJson(propString, JsonObject.class));
        }
        setLastPingTimestamp(remoteData.getDataLongs(0));
        setTimeBucket(remoteData.getDataLongs(1));
    }

    @Override
    public RemoteData.Builder serialize() {
        final RemoteData.Builder builder = RemoteData.newBuilder();
        builder.addDataStrings(serviceId);
        builder.addDataStrings(name);
        if (properties == null) {
            builder.addDataStrings(Const.EMPTY_STRING);
        } else {
            builder.addDataStrings(GSON.toJson(properties));
        }
        builder.addDataLongs(lastPingTimestamp);
        builder.addDataLongs(getTimeBucket());
        return builder;
    }

    @Override
    protected StorageID id0() {
        return new StorageID().appendMutant(new String[] {SERVICE_ID, NAME}, IDManager.ServiceInstanceID.buildId(serviceId, name));
    }


    public static class Builder implements StorageBuilder<InstanceTraffic> {
        @Override
        public InstanceTraffic storage2Entity(final Convert2Entity converter) {
            InstanceTraffic instanceTraffic = new InstanceTraffic();
            instanceTraffic.setServiceId((String) converter.get(SERVICE_ID));
            instanceTraffic.setName((String) converter.get(NAME));
            final String propString = (String) converter.get(PROPERTIES);
            if (StringUtil.isNotEmpty(propString)) {
                instanceTraffic.setProperties(GSON.fromJson(propString, JsonObject.class));
            }
            instanceTraffic.setLastPingTimestamp(((Number) converter.get(LAST_PING_TIME_BUCKET)).longValue());
            instanceTraffic.setTimeBucket(((Number) converter.get(TIME_BUCKET)).longValue());
            return instanceTraffic;
        }

        @Override
        public void entity2Storage(final InstanceTraffic storageData, final Convert2Storage converter) {
            converter.accept(SERVICE_ID, storageData.getServiceId());
            converter.accept(NAME, storageData.getName());
            if (storageData.getProperties() != null) {
                converter.accept(PROPERTIES, GSON.toJson(storageData.getProperties()));
            } else {
                converter.accept(PROPERTIES, Const.EMPTY_STRING);
            }
            converter.accept(LAST_PING_TIME_BUCKET, storageData.getLastPingTimestamp());
            converter.accept(TIME_BUCKET, storageData.getTimeBucket());
        }
    }

    @Override
    public void calculate() {
    }

    @Override
    public Metrics toHour() {
        return null;
    }

    @Override
    public Metrics toDay() {
        return null;
    }


    public static class PropertyUtil {
        /**
         * `namespace` and `pod` are key properties that help "on demand Pod logs"
         * to locate the corresponding Pod in Kubernetes, when language agent is
         * registering a new service instance that is supposed to work in terms of
         * "on demand Pod logs", the agent should also fill in these 2 properties.
         *
         * @since 9.1.0
         */
        public static final String NAMESPACE = "namespace";
        public static final String POD = "pod";
        public static final String LANGUAGE = "language";
        public static final String IPV4 = "ipv4";
        public static final String IPV4S = "ipv4s";
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof InstanceTraffic)) return false;
        final InstanceTraffic other = (InstanceTraffic) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$serviceId = this.getServiceId();
        final java.lang.Object other$serviceId = other.getServiceId();
        if (this$serviceId == null ? other$serviceId != null : !this$serviceId.equals(other$serviceId)) return false;
        final java.lang.Object this$name = this.getName();
        final java.lang.Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        return true;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof InstanceTraffic;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $serviceId = this.getServiceId();
        result = result * PRIME + ($serviceId == null ? 43 : $serviceId.hashCode());
        final java.lang.Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        return result;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setServiceId(final String serviceId) {
        this.serviceId = serviceId;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public String getServiceId() {
        return this.serviceId;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setName(final String name) {
        this.name = name;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public String getName() {
        return this.name;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setLastPingTimestamp(final long lastPingTimestamp) {
        this.lastPingTimestamp = lastPingTimestamp;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public long getLastPingTimestamp() {
        return this.lastPingTimestamp;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setProperties(final JsonObject properties) {
        this.properties = properties;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public JsonObject getProperties() {
        return this.properties;
    }
}
