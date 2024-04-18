// Generated by delombok at Thu Apr 18 20:40:02 CST 2024
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
package org.apache.skywalking.oap.server.analyzer.provider;

import com.google.common.base.Splitter;
import org.apache.commons.lang3.StringUtils;
import org.apache.skywalking.oap.server.analyzer.provider.trace.CacheReadLatencyThresholdsAndWatcher;
import org.apache.skywalking.oap.server.analyzer.provider.trace.CacheWriteLatencyThresholdsAndWatcher;
import org.apache.skywalking.oap.server.analyzer.provider.trace.DBLatencyThresholdsAndWatcher;
import org.apache.skywalking.oap.server.analyzer.provider.trace.TraceSamplingPolicyWatcher;
import org.apache.skywalking.oap.server.analyzer.provider.trace.UninstrumentedGatewaysConfig;
import org.apache.skywalking.oap.server.analyzer.provider.trace.parser.listener.strategy.SegmentStatusStrategy;
import org.apache.skywalking.oap.server.core.Const;
import org.apache.skywalking.oap.server.library.module.ModuleConfig;
import java.util.ArrayList;
import java.util.List;
import static org.apache.skywalking.oap.server.analyzer.provider.trace.parser.listener.strategy.SegmentStatusStrategy.FROM_SPAN_STATUS;

public class AnalyzerModuleConfig extends ModuleConfig {
    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(AnalyzerModuleConfig.class);
    /**
     * The sample policy setting file
     */
    private String traceSamplingPolicySettingsFile;
    /**
     * Some of the agent can not have the upstream real network address, such as https://github.com/apache/skywalking-nginx-lua.
     * service instance mapping and service instance client side relation are ignored.
     *
     * Read component-libraries.yml for more details.
     */
    private String noUpstreamRealAddressAgents = Const.EMPTY_STRING;
    /**
     * The threshold used to check the slow database access. Unit, millisecond.
     */
    private String slowDBAccessThreshold = "default:200";
    private DBLatencyThresholdsAndWatcher dbLatencyThresholdsAndWatcher;
    private String slowCacheWriteThreshold = "default:20,redis:10";
    private CacheWriteLatencyThresholdsAndWatcher cacheWriteLatencyThresholdsAndWatcher;
    private String slowCacheReadThreshold = "default:20,redis:10";
    private CacheReadLatencyThresholdsAndWatcher cacheReadLatencyThresholdsAndWatcher;
    private UninstrumentedGatewaysConfig uninstrumentedGatewaysConfig;
    private TraceSamplingPolicyWatcher traceSamplingPolicyWatcher;
    /**
     * Analysis trace status.
     * <p>
     * 1. Default(YES) means analysis all metrics from trace.
     * <p>
     * 2. NO means, only save trace, but metrics come other places, such as service mesh.
     */
    private boolean traceAnalysis = true;
    /**
     * Slow Sql string length can't beyond this limit. This value should be as same as the length annotation at the
     * {@code org.apache.skywalking.oap.server.core.analysis.manual.database.TopNDatabaseStatement#statement}. And share
     * the system env name, SW_SLOW_DB_THRESHOLD
     */
    private int maxSlowSQLLength = 2000;
    private final String configPath = "meter-analyzer-config";
    /**
     * Which files could be meter analyzed, files split by ","
     */
    private String meterAnalyzerActiveFiles = Const.EMPTY_STRING;
    /**
     * Sample the trace segment if the segment has span(s) tagged as error status, and ignore the sampleRate
     * configuration.
     */
    private boolean forceSampleErrorSegment = true;
    /**
     * Determine the final segment status from the status of spans.
     *
     * @see SegmentStatusStrategy
     */
    private String segmentStatusAnalysisStrategy = FROM_SPAN_STATUS.name();
    private List<Integer> virtualPeers;

    /**
     * @param componentId of the exit span
     * @return true, means should not generate the instance relationship for the client-side exit span.
     */
    public boolean shouldIgnorePeerIPDue2Virtual(int componentId) {
        if (virtualPeers == null) {
            virtualPeers = new ArrayList<>(20);
            for (final String component : noUpstreamRealAddressAgents.split(",")) {
                try {
                    virtualPeers.add(Integer.parseInt(component));
                } catch (NumberFormatException e) {
                    log.warn("noUpstreamRealAddressAgents config {} includes illegal value {}", noUpstreamRealAddressAgents, component);
                }
            }
        }
        return virtualPeers.contains(componentId);
    }

    /**
     * Get all files could be meter analyzed, files split by ","
     */
    public List<String> meterAnalyzerActiveFileNames() {
        if (StringUtils.isEmpty(this.meterAnalyzerActiveFiles)) {
            return null;
        }
        return Splitter.on(",").splitToList(this.meterAnalyzerActiveFiles);
    }

    /**
     * The sample policy setting file
     */
    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setTraceSamplingPolicySettingsFile(final String traceSamplingPolicySettingsFile) {
        this.traceSamplingPolicySettingsFile = traceSamplingPolicySettingsFile;
    }

    /**
     * The sample policy setting file
     */
    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public String getTraceSamplingPolicySettingsFile() {
        return this.traceSamplingPolicySettingsFile;
    }

    /**
     * Some of the agent can not have the upstream real network address, such as https://github.com/apache/skywalking-nginx-lua.
     * service instance mapping and service instance client side relation are ignored.
     *
     * Read component-libraries.yml for more details.
     */
    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public String getNoUpstreamRealAddressAgents() {
        return this.noUpstreamRealAddressAgents;
    }

    /**
     * The threshold used to check the slow database access. Unit, millisecond.
     */
    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setSlowDBAccessThreshold(final String slowDBAccessThreshold) {
        this.slowDBAccessThreshold = slowDBAccessThreshold;
    }

    /**
     * The threshold used to check the slow database access. Unit, millisecond.
     */
    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public String getSlowDBAccessThreshold() {
        return this.slowDBAccessThreshold;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setDbLatencyThresholdsAndWatcher(final DBLatencyThresholdsAndWatcher dbLatencyThresholdsAndWatcher) {
        this.dbLatencyThresholdsAndWatcher = dbLatencyThresholdsAndWatcher;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public DBLatencyThresholdsAndWatcher getDbLatencyThresholdsAndWatcher() {
        return this.dbLatencyThresholdsAndWatcher;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setSlowCacheWriteThreshold(final String slowCacheWriteThreshold) {
        this.slowCacheWriteThreshold = slowCacheWriteThreshold;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public String getSlowCacheWriteThreshold() {
        return this.slowCacheWriteThreshold;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setCacheWriteLatencyThresholdsAndWatcher(final CacheWriteLatencyThresholdsAndWatcher cacheWriteLatencyThresholdsAndWatcher) {
        this.cacheWriteLatencyThresholdsAndWatcher = cacheWriteLatencyThresholdsAndWatcher;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public CacheWriteLatencyThresholdsAndWatcher getCacheWriteLatencyThresholdsAndWatcher() {
        return this.cacheWriteLatencyThresholdsAndWatcher;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setSlowCacheReadThreshold(final String slowCacheReadThreshold) {
        this.slowCacheReadThreshold = slowCacheReadThreshold;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public String getSlowCacheReadThreshold() {
        return this.slowCacheReadThreshold;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setCacheReadLatencyThresholdsAndWatcher(final CacheReadLatencyThresholdsAndWatcher cacheReadLatencyThresholdsAndWatcher) {
        this.cacheReadLatencyThresholdsAndWatcher = cacheReadLatencyThresholdsAndWatcher;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public CacheReadLatencyThresholdsAndWatcher getCacheReadLatencyThresholdsAndWatcher() {
        return this.cacheReadLatencyThresholdsAndWatcher;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setUninstrumentedGatewaysConfig(final UninstrumentedGatewaysConfig uninstrumentedGatewaysConfig) {
        this.uninstrumentedGatewaysConfig = uninstrumentedGatewaysConfig;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public UninstrumentedGatewaysConfig getUninstrumentedGatewaysConfig() {
        return this.uninstrumentedGatewaysConfig;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setTraceSamplingPolicyWatcher(final TraceSamplingPolicyWatcher traceSamplingPolicyWatcher) {
        this.traceSamplingPolicyWatcher = traceSamplingPolicyWatcher;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public TraceSamplingPolicyWatcher getTraceSamplingPolicyWatcher() {
        return this.traceSamplingPolicyWatcher;
    }

    /**
     * Analysis trace status.
     * <p>
     * 1. Default(YES) means analysis all metrics from trace.
     * <p>
     * 2. NO means, only save trace, but metrics come other places, such as service mesh.
     */
    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setTraceAnalysis(final boolean traceAnalysis) {
        this.traceAnalysis = traceAnalysis;
    }

    /**
     * Analysis trace status.
     * <p>
     * 1. Default(YES) means analysis all metrics from trace.
     * <p>
     * 2. NO means, only save trace, but metrics come other places, such as service mesh.
     */
    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public boolean isTraceAnalysis() {
        return this.traceAnalysis;
    }

    /**
     * Slow Sql string length can't beyond this limit. This value should be as same as the length annotation at the
     * {@code org.apache.skywalking.oap.server.core.analysis.manual.database.TopNDatabaseStatement#statement}. And share
     * the system env name, SW_SLOW_DB_THRESHOLD
     */
    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setMaxSlowSQLLength(final int maxSlowSQLLength) {
        this.maxSlowSQLLength = maxSlowSQLLength;
    }

    /**
     * Slow Sql string length can't beyond this limit. This value should be as same as the length annotation at the
     * {@code org.apache.skywalking.oap.server.core.analysis.manual.database.TopNDatabaseStatement#statement}. And share
     * the system env name, SW_SLOW_DB_THRESHOLD
     */
    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public int getMaxSlowSQLLength() {
        return this.maxSlowSQLLength;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public String getConfigPath() {
        return this.configPath;
    }

    /**
     * Which files could be meter analyzed, files split by ","
     */
    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setMeterAnalyzerActiveFiles(final String meterAnalyzerActiveFiles) {
        this.meterAnalyzerActiveFiles = meterAnalyzerActiveFiles;
    }

    /**
     * Sample the trace segment if the segment has span(s) tagged as error status, and ignore the sampleRate
     * configuration.
     */
    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setForceSampleErrorSegment(final boolean forceSampleErrorSegment) {
        this.forceSampleErrorSegment = forceSampleErrorSegment;
    }

    /**
     * Sample the trace segment if the segment has span(s) tagged as error status, and ignore the sampleRate
     * configuration.
     */
    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public boolean isForceSampleErrorSegment() {
        return this.forceSampleErrorSegment;
    }

    /**
     * Determine the final segment status from the status of spans.
     *
     * @see SegmentStatusStrategy
     */
    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setSegmentStatusAnalysisStrategy(final String segmentStatusAnalysisStrategy) {
        this.segmentStatusAnalysisStrategy = segmentStatusAnalysisStrategy;
    }

    /**
     * Determine the final segment status from the status of spans.
     *
     * @see SegmentStatusStrategy
     */
    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public String getSegmentStatusAnalysisStrategy() {
        return this.segmentStatusAnalysisStrategy;
    }
}
