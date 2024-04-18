// Generated by delombok at Thu Apr 18 20:40:54 CST 2024
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
package org.apache.skywalking.oap.query.graphql;

import org.apache.skywalking.oap.server.library.module.ModuleConfig;

/**
 * The config of {@code query.graphql}.
 */
public class GraphQLQueryConfig extends ModuleConfig {
    private boolean enableLogTestTool;
    private int maxQueryComplexity = 1000;
    private boolean enableUpdateUITemplate = false;
    private boolean enableOnDemandPodLog = false;

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public boolean isEnableLogTestTool() {
        return this.enableLogTestTool;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public int getMaxQueryComplexity() {
        return this.maxQueryComplexity;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public boolean isEnableUpdateUITemplate() {
        return this.enableUpdateUITemplate;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public boolean isEnableOnDemandPodLog() {
        return this.enableOnDemandPodLog;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setEnableLogTestTool(final boolean enableLogTestTool) {
        this.enableLogTestTool = enableLogTestTool;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setMaxQueryComplexity(final int maxQueryComplexity) {
        this.maxQueryComplexity = maxQueryComplexity;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setEnableUpdateUITemplate(final boolean enableUpdateUITemplate) {
        this.enableUpdateUITemplate = enableUpdateUITemplate;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setEnableOnDemandPodLog(final boolean enableOnDemandPodLog) {
        this.enableOnDemandPodLog = enableOnDemandPodLog;
    }
}
