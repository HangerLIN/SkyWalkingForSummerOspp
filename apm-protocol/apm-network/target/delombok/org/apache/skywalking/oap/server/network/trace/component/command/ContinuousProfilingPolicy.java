// Generated by delombok at Thu Apr 18 20:39:31 CST 2024
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
package org.apache.skywalking.oap.server.network.trace.component.command;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;

public class ContinuousProfilingPolicy {
    @SerializedName("ServiceName")
    private String serviceName;
    @SerializedName("UUID")
    private String uuid;
    @SerializedName("Profiling")
    private Map<String, Map<String, Item>> profiling;


    public static class Item {
        @SerializedName("Threshold")
        private String threshold;
        @SerializedName("Period")
        private int period;
        @SerializedName("Count")
        private int count;
        @SerializedName("URIList")
        private List<String> uriList;
        @SerializedName("URIRegex")
        private String uriRegex;

        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public Item() {
        }

        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public String getThreshold() {
            return this.threshold;
        }

        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public int getPeriod() {
            return this.period;
        }

        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public int getCount() {
            return this.count;
        }

        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public List<String> getUriList() {
            return this.uriList;
        }

        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public String getUriRegex() {
            return this.uriRegex;
        }

        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public void setThreshold(final String threshold) {
            this.threshold = threshold;
        }

        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public void setPeriod(final int period) {
            this.period = period;
        }

        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public void setCount(final int count) {
            this.count = count;
        }

        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public void setUriList(final List<String> uriList) {
            this.uriList = uriList;
        }

        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public void setUriRegex(final String uriRegex) {
            this.uriRegex = uriRegex;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public boolean equals(final java.lang.Object o) {
            if (o == this) return true;
            if (!(o instanceof ContinuousProfilingPolicy.Item)) return false;
            final ContinuousProfilingPolicy.Item other = (ContinuousProfilingPolicy.Item) o;
            if (!other.canEqual((java.lang.Object) this)) return false;
            if (this.getPeriod() != other.getPeriod()) return false;
            if (this.getCount() != other.getCount()) return false;
            final java.lang.Object this$threshold = this.getThreshold();
            final java.lang.Object other$threshold = other.getThreshold();
            if (this$threshold == null ? other$threshold != null : !this$threshold.equals(other$threshold)) return false;
            final java.lang.Object this$uriList = this.getUriList();
            final java.lang.Object other$uriList = other.getUriList();
            if (this$uriList == null ? other$uriList != null : !this$uriList.equals(other$uriList)) return false;
            final java.lang.Object this$uriRegex = this.getUriRegex();
            final java.lang.Object other$uriRegex = other.getUriRegex();
            if (this$uriRegex == null ? other$uriRegex != null : !this$uriRegex.equals(other$uriRegex)) return false;
            return true;
        }

        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        protected boolean canEqual(final java.lang.Object other) {
            return other instanceof ContinuousProfilingPolicy.Item;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            result = result * PRIME + this.getPeriod();
            result = result * PRIME + this.getCount();
            final java.lang.Object $threshold = this.getThreshold();
            result = result * PRIME + ($threshold == null ? 43 : $threshold.hashCode());
            final java.lang.Object $uriList = this.getUriList();
            result = result * PRIME + ($uriList == null ? 43 : $uriList.hashCode());
            final java.lang.Object $uriRegex = this.getUriRegex();
            result = result * PRIME + ($uriRegex == null ? 43 : $uriRegex.hashCode());
            return result;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public java.lang.String toString() {
            return "ContinuousProfilingPolicy.Item(threshold=" + this.getThreshold() + ", period=" + this.getPeriod() + ", count=" + this.getCount() + ", uriList=" + this.getUriList() + ", uriRegex=" + this.getUriRegex() + ")";
        }
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public ContinuousProfilingPolicy() {
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public String getServiceName() {
        return this.serviceName;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public String getUuid() {
        return this.uuid;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public Map<String, Map<String, Item>> getProfiling() {
        return this.profiling;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setServiceName(final String serviceName) {
        this.serviceName = serviceName;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setUuid(final String uuid) {
        this.uuid = uuid;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setProfiling(final Map<String, Map<String, Item>> profiling) {
        this.profiling = profiling;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof ContinuousProfilingPolicy)) return false;
        final ContinuousProfilingPolicy other = (ContinuousProfilingPolicy) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$serviceName = this.getServiceName();
        final java.lang.Object other$serviceName = other.getServiceName();
        if (this$serviceName == null ? other$serviceName != null : !this$serviceName.equals(other$serviceName)) return false;
        final java.lang.Object this$uuid = this.getUuid();
        final java.lang.Object other$uuid = other.getUuid();
        if (this$uuid == null ? other$uuid != null : !this$uuid.equals(other$uuid)) return false;
        final java.lang.Object this$profiling = this.getProfiling();
        final java.lang.Object other$profiling = other.getProfiling();
        if (this$profiling == null ? other$profiling != null : !this$profiling.equals(other$profiling)) return false;
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
        final java.lang.Object $serviceName = this.getServiceName();
        result = result * PRIME + ($serviceName == null ? 43 : $serviceName.hashCode());
        final java.lang.Object $uuid = this.getUuid();
        result = result * PRIME + ($uuid == null ? 43 : $uuid.hashCode());
        final java.lang.Object $profiling = this.getProfiling();
        result = result * PRIME + ($profiling == null ? 43 : $profiling.hashCode());
        return result;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public java.lang.String toString() {
        return "ContinuousProfilingPolicy(serviceName=" + this.getServiceName() + ", uuid=" + this.getUuid() + ", profiling=" + this.getProfiling() + ")";
    }
}
