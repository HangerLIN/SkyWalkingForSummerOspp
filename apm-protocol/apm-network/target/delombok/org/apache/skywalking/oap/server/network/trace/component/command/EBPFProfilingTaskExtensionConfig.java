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

public class EBPFProfilingTaskExtensionConfig {
    @SerializedName("NetworkSamplings")
    private List<NetworkSamplingRule> networkSamplings;


    public static class NetworkSamplingRule {
        @SerializedName("URIRegex")
        private String uriRegex;
        @SerializedName("MinDuration")
        private Integer minDuration;
        @SerializedName("When4xx")
        private boolean when4xx;
        @SerializedName("When5xx")
        private boolean when5xx;
        @SerializedName("Settings")
        private CollectSettings settings;


        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public static class NetworkSamplingRuleBuilder {
            @java.lang.SuppressWarnings("all")
            @lombok.Generated
            private String uriRegex;
            @java.lang.SuppressWarnings("all")
            @lombok.Generated
            private Integer minDuration;
            @java.lang.SuppressWarnings("all")
            @lombok.Generated
            private boolean when4xx;
            @java.lang.SuppressWarnings("all")
            @lombok.Generated
            private boolean when5xx;
            @java.lang.SuppressWarnings("all")
            @lombok.Generated
            private CollectSettings settings;

            @java.lang.SuppressWarnings("all")
            @lombok.Generated
            NetworkSamplingRuleBuilder() {
            }

            /**
             * @return {@code this}.
             */
            @java.lang.SuppressWarnings("all")
            @lombok.Generated
            public EBPFProfilingTaskExtensionConfig.NetworkSamplingRule.NetworkSamplingRuleBuilder uriRegex(final String uriRegex) {
                this.uriRegex = uriRegex;
                return this;
            }

            /**
             * @return {@code this}.
             */
            @java.lang.SuppressWarnings("all")
            @lombok.Generated
            public EBPFProfilingTaskExtensionConfig.NetworkSamplingRule.NetworkSamplingRuleBuilder minDuration(final Integer minDuration) {
                this.minDuration = minDuration;
                return this;
            }

            /**
             * @return {@code this}.
             */
            @java.lang.SuppressWarnings("all")
            @lombok.Generated
            public EBPFProfilingTaskExtensionConfig.NetworkSamplingRule.NetworkSamplingRuleBuilder when4xx(final boolean when4xx) {
                this.when4xx = when4xx;
                return this;
            }

            /**
             * @return {@code this}.
             */
            @java.lang.SuppressWarnings("all")
            @lombok.Generated
            public EBPFProfilingTaskExtensionConfig.NetworkSamplingRule.NetworkSamplingRuleBuilder when5xx(final boolean when5xx) {
                this.when5xx = when5xx;
                return this;
            }

            /**
             * @return {@code this}.
             */
            @java.lang.SuppressWarnings("all")
            @lombok.Generated
            public EBPFProfilingTaskExtensionConfig.NetworkSamplingRule.NetworkSamplingRuleBuilder settings(final CollectSettings settings) {
                this.settings = settings;
                return this;
            }

            @java.lang.SuppressWarnings("all")
            @lombok.Generated
            public EBPFProfilingTaskExtensionConfig.NetworkSamplingRule build() {
                return new EBPFProfilingTaskExtensionConfig.NetworkSamplingRule(this.uriRegex, this.minDuration, this.when4xx, this.when5xx, this.settings);
            }

            @java.lang.Override
            @java.lang.SuppressWarnings("all")
            @lombok.Generated
            public java.lang.String toString() {
                return "EBPFProfilingTaskExtensionConfig.NetworkSamplingRule.NetworkSamplingRuleBuilder(uriRegex=" + this.uriRegex + ", minDuration=" + this.minDuration + ", when4xx=" + this.when4xx + ", when5xx=" + this.when5xx + ", settings=" + this.settings + ")";
            }
        }

        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public static EBPFProfilingTaskExtensionConfig.NetworkSamplingRule.NetworkSamplingRuleBuilder builder() {
            return new EBPFProfilingTaskExtensionConfig.NetworkSamplingRule.NetworkSamplingRuleBuilder();
        }

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
        public CollectSettings getSettings() {
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
        public void setSettings(final CollectSettings settings) {
            this.settings = settings;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public boolean equals(final java.lang.Object o) {
            if (o == this) return true;
            if (!(o instanceof EBPFProfilingTaskExtensionConfig.NetworkSamplingRule)) return false;
            final EBPFProfilingTaskExtensionConfig.NetworkSamplingRule other = (EBPFProfilingTaskExtensionConfig.NetworkSamplingRule) o;
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
            return other instanceof EBPFProfilingTaskExtensionConfig.NetworkSamplingRule;
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
            return "EBPFProfilingTaskExtensionConfig.NetworkSamplingRule(uriRegex=" + this.getUriRegex() + ", minDuration=" + this.getMinDuration() + ", when4xx=" + this.isWhen4xx() + ", when5xx=" + this.isWhen5xx() + ", settings=" + this.getSettings() + ")";
        }

        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public NetworkSamplingRule() {
        }

        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public NetworkSamplingRule(final String uriRegex, final Integer minDuration, final boolean when4xx, final boolean when5xx, final CollectSettings settings) {
            this.uriRegex = uriRegex;
            this.minDuration = minDuration;
            this.when4xx = when4xx;
            this.when5xx = when5xx;
            this.settings = settings;
        }
    }


    public static class CollectSettings {
        @SerializedName("RequireCompleteRequest")
        private boolean requireCompleteRequest;
        @SerializedName("MaxRequestSize")
        private Integer maxRequestSize;
        @SerializedName("RequireCompleteResponse")
        private boolean requireCompleteResponse;
        @SerializedName("MaxResponseSize")
        private Integer maxResponseSize;


        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public static class CollectSettingsBuilder {
            @java.lang.SuppressWarnings("all")
            @lombok.Generated
            private boolean requireCompleteRequest;
            @java.lang.SuppressWarnings("all")
            @lombok.Generated
            private Integer maxRequestSize;
            @java.lang.SuppressWarnings("all")
            @lombok.Generated
            private boolean requireCompleteResponse;
            @java.lang.SuppressWarnings("all")
            @lombok.Generated
            private Integer maxResponseSize;

            @java.lang.SuppressWarnings("all")
            @lombok.Generated
            CollectSettingsBuilder() {
            }

            /**
             * @return {@code this}.
             */
            @java.lang.SuppressWarnings("all")
            @lombok.Generated
            public EBPFProfilingTaskExtensionConfig.CollectSettings.CollectSettingsBuilder requireCompleteRequest(final boolean requireCompleteRequest) {
                this.requireCompleteRequest = requireCompleteRequest;
                return this;
            }

            /**
             * @return {@code this}.
             */
            @java.lang.SuppressWarnings("all")
            @lombok.Generated
            public EBPFProfilingTaskExtensionConfig.CollectSettings.CollectSettingsBuilder maxRequestSize(final Integer maxRequestSize) {
                this.maxRequestSize = maxRequestSize;
                return this;
            }

            /**
             * @return {@code this}.
             */
            @java.lang.SuppressWarnings("all")
            @lombok.Generated
            public EBPFProfilingTaskExtensionConfig.CollectSettings.CollectSettingsBuilder requireCompleteResponse(final boolean requireCompleteResponse) {
                this.requireCompleteResponse = requireCompleteResponse;
                return this;
            }

            /**
             * @return {@code this}.
             */
            @java.lang.SuppressWarnings("all")
            @lombok.Generated
            public EBPFProfilingTaskExtensionConfig.CollectSettings.CollectSettingsBuilder maxResponseSize(final Integer maxResponseSize) {
                this.maxResponseSize = maxResponseSize;
                return this;
            }

            @java.lang.SuppressWarnings("all")
            @lombok.Generated
            public EBPFProfilingTaskExtensionConfig.CollectSettings build() {
                return new EBPFProfilingTaskExtensionConfig.CollectSettings(this.requireCompleteRequest, this.maxRequestSize, this.requireCompleteResponse, this.maxResponseSize);
            }

            @java.lang.Override
            @java.lang.SuppressWarnings("all")
            @lombok.Generated
            public java.lang.String toString() {
                return "EBPFProfilingTaskExtensionConfig.CollectSettings.CollectSettingsBuilder(requireCompleteRequest=" + this.requireCompleteRequest + ", maxRequestSize=" + this.maxRequestSize + ", requireCompleteResponse=" + this.requireCompleteResponse + ", maxResponseSize=" + this.maxResponseSize + ")";
            }
        }

        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public static EBPFProfilingTaskExtensionConfig.CollectSettings.CollectSettingsBuilder builder() {
            return new EBPFProfilingTaskExtensionConfig.CollectSettings.CollectSettingsBuilder();
        }

        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public boolean isRequireCompleteRequest() {
            return this.requireCompleteRequest;
        }

        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public Integer getMaxRequestSize() {
            return this.maxRequestSize;
        }

        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public boolean isRequireCompleteResponse() {
            return this.requireCompleteResponse;
        }

        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public Integer getMaxResponseSize() {
            return this.maxResponseSize;
        }

        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public void setRequireCompleteRequest(final boolean requireCompleteRequest) {
            this.requireCompleteRequest = requireCompleteRequest;
        }

        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public void setMaxRequestSize(final Integer maxRequestSize) {
            this.maxRequestSize = maxRequestSize;
        }

        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public void setRequireCompleteResponse(final boolean requireCompleteResponse) {
            this.requireCompleteResponse = requireCompleteResponse;
        }

        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public void setMaxResponseSize(final Integer maxResponseSize) {
            this.maxResponseSize = maxResponseSize;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public boolean equals(final java.lang.Object o) {
            if (o == this) return true;
            if (!(o instanceof EBPFProfilingTaskExtensionConfig.CollectSettings)) return false;
            final EBPFProfilingTaskExtensionConfig.CollectSettings other = (EBPFProfilingTaskExtensionConfig.CollectSettings) o;
            if (!other.canEqual((java.lang.Object) this)) return false;
            if (this.isRequireCompleteRequest() != other.isRequireCompleteRequest()) return false;
            if (this.isRequireCompleteResponse() != other.isRequireCompleteResponse()) return false;
            final java.lang.Object this$maxRequestSize = this.getMaxRequestSize();
            final java.lang.Object other$maxRequestSize = other.getMaxRequestSize();
            if (this$maxRequestSize == null ? other$maxRequestSize != null : !this$maxRequestSize.equals(other$maxRequestSize)) return false;
            final java.lang.Object this$maxResponseSize = this.getMaxResponseSize();
            final java.lang.Object other$maxResponseSize = other.getMaxResponseSize();
            if (this$maxResponseSize == null ? other$maxResponseSize != null : !this$maxResponseSize.equals(other$maxResponseSize)) return false;
            return true;
        }

        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        protected boolean canEqual(final java.lang.Object other) {
            return other instanceof EBPFProfilingTaskExtensionConfig.CollectSettings;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            result = result * PRIME + (this.isRequireCompleteRequest() ? 79 : 97);
            result = result * PRIME + (this.isRequireCompleteResponse() ? 79 : 97);
            final java.lang.Object $maxRequestSize = this.getMaxRequestSize();
            result = result * PRIME + ($maxRequestSize == null ? 43 : $maxRequestSize.hashCode());
            final java.lang.Object $maxResponseSize = this.getMaxResponseSize();
            result = result * PRIME + ($maxResponseSize == null ? 43 : $maxResponseSize.hashCode());
            return result;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public java.lang.String toString() {
            return "EBPFProfilingTaskExtensionConfig.CollectSettings(requireCompleteRequest=" + this.isRequireCompleteRequest() + ", maxRequestSize=" + this.getMaxRequestSize() + ", requireCompleteResponse=" + this.isRequireCompleteResponse() + ", maxResponseSize=" + this.getMaxResponseSize() + ")";
        }

        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public CollectSettings() {
        }

        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public CollectSettings(final boolean requireCompleteRequest, final Integer maxRequestSize, final boolean requireCompleteResponse, final Integer maxResponseSize) {
            this.requireCompleteRequest = requireCompleteRequest;
            this.maxRequestSize = maxRequestSize;
            this.requireCompleteResponse = requireCompleteResponse;
            this.maxResponseSize = maxResponseSize;
        }
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public EBPFProfilingTaskExtensionConfig() {
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public List<NetworkSamplingRule> getNetworkSamplings() {
        return this.networkSamplings;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setNetworkSamplings(final List<NetworkSamplingRule> networkSamplings) {
        this.networkSamplings = networkSamplings;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof EBPFProfilingTaskExtensionConfig)) return false;
        final EBPFProfilingTaskExtensionConfig other = (EBPFProfilingTaskExtensionConfig) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$networkSamplings = this.getNetworkSamplings();
        final java.lang.Object other$networkSamplings = other.getNetworkSamplings();
        if (this$networkSamplings == null ? other$networkSamplings != null : !this$networkSamplings.equals(other$networkSamplings)) return false;
        return true;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof EBPFProfilingTaskExtensionConfig;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $networkSamplings = this.getNetworkSamplings();
        result = result * PRIME + ($networkSamplings == null ? 43 : $networkSamplings.hashCode());
        return result;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public java.lang.String toString() {
        return "EBPFProfilingTaskExtensionConfig(networkSamplings=" + this.getNetworkSamplings() + ")";
    }
}
