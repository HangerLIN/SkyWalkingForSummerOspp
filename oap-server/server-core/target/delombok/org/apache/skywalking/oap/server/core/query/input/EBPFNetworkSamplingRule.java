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

public class EBPFNetworkSamplingRule {
    // The match pattern for HTTP request. This is HTTP URI-oriented.
    // Matches all requests if not set
    private String uriRegex;
    // The minimal request duration to activate the network data(HTTP request/response raw data) sampling.
    // Collecting requests without minimal request duration.
    private Integer minDuration;
    // Collecting requests when the response code is 400-499.
    private boolean when4xx;
    // Collecting requests when the response code is 500-599
    private boolean when5xx;
    // Define how to collect sampled data
    private EBPFNetworkDataCollectingSettings settings;

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public String getUriRegex() {
        return this.uriRegex;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public Integer getMinDuration() {
        return this.minDuration;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public boolean isWhen4xx() {
        return this.when4xx;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public boolean isWhen5xx() {
        return this.when5xx;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public EBPFNetworkDataCollectingSettings getSettings() {
        return this.settings;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setUriRegex(final String uriRegex) {
        this.uriRegex = uriRegex;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setMinDuration(final Integer minDuration) {
        this.minDuration = minDuration;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setWhen4xx(final boolean when4xx) {
        this.when4xx = when4xx;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setWhen5xx(final boolean when5xx) {
        this.when5xx = when5xx;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setSettings(final EBPFNetworkDataCollectingSettings settings) {
        this.settings = settings;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof EBPFNetworkSamplingRule)) return false;
        final EBPFNetworkSamplingRule other = (EBPFNetworkSamplingRule) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        if (this.isWhen4xx() != other.isWhen4xx()) return false;
        if (this.isWhen5xx() != other.isWhen5xx()) return false;
        final java.lang.Object this$minDuration = this.getMinDuration();
        final java.lang.Object other$minDuration = other.getMinDuration();
        if (this$minDuration == null ? other$minDuration != null : !this$minDuration.equals(other$minDuration)) return false;
        final java.lang.Object this$uriRegex = this.getUriRegex();
        final java.lang.Object other$uriRegex = other.getUriRegex();
        if (this$uriRegex == null ? other$uriRegex != null : !this$uriRegex.equals(other$uriRegex)) return false;
        final java.lang.Object this$settings = this.getSettings();
        final java.lang.Object other$settings = other.getSettings();
        if (this$settings == null ? other$settings != null : !this$settings.equals(other$settings)) return false;
        return true;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof EBPFNetworkSamplingRule;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.isWhen4xx() ? 79 : 97);
        result = result * PRIME + (this.isWhen5xx() ? 79 : 97);
        final java.lang.Object $minDuration = this.getMinDuration();
        result = result * PRIME + ($minDuration == null ? 43 : $minDuration.hashCode());
        final java.lang.Object $uriRegex = this.getUriRegex();
        result = result * PRIME + ($uriRegex == null ? 43 : $uriRegex.hashCode());
        final java.lang.Object $settings = this.getSettings();
        result = result * PRIME + ($settings == null ? 43 : $settings.hashCode());
        return result;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public java.lang.String toString() {
        return "EBPFNetworkSamplingRule(uriRegex=" + this.getUriRegex() + ", minDuration=" + this.getMinDuration() + ", when4xx=" + this.isWhen4xx() + ", when5xx=" + this.isWhen5xx() + ", settings=" + this.getSettings() + ")";
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public EBPFNetworkSamplingRule(final String uriRegex, final Integer minDuration, final boolean when4xx, final boolean when5xx, final EBPFNetworkDataCollectingSettings settings) {
        this.uriRegex = uriRegex;
        this.minDuration = minDuration;
        this.when4xx = when4xx;
        this.when5xx = when5xx;
        this.settings = settings;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public EBPFNetworkSamplingRule() {
    }
}
