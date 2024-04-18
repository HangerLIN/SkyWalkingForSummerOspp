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
package org.apache.skywalking.oap.server.core.profiling.trace;

import org.apache.skywalking.oap.server.core.analysis.Stream;
import org.apache.skywalking.oap.server.core.analysis.config.NoneStream;
import org.apache.skywalking.oap.server.core.analysis.worker.NoneStreamProcessor;
import org.apache.skywalking.oap.server.core.source.ScopeDeclaration;
import org.apache.skywalking.oap.server.core.storage.StorageID;
import org.apache.skywalking.oap.server.core.storage.annotation.BanyanDB;
import org.apache.skywalking.oap.server.core.storage.annotation.Column;
import org.apache.skywalking.oap.server.core.storage.type.Convert2Entity;
import org.apache.skywalking.oap.server.core.storage.type.Convert2Storage;
import org.apache.skywalking.oap.server.core.storage.type.StorageBuilder;
import static org.apache.skywalking.oap.server.core.source.DefaultScopeDefine.PROFILE_TASK;

/**
 * profile task database bean, use none stream
 */
@ScopeDeclaration(id = PROFILE_TASK, name = "ProfileTask")
@Stream(name = ProfileTaskRecord.INDEX_NAME, scopeId = PROFILE_TASK, builder = ProfileTaskRecord.Builder.class, processor = NoneStreamProcessor.class)
@BanyanDB.TimestampColumn(ProfileTaskRecord.START_TIME)
public class ProfileTaskRecord extends NoneStream {
    public static final String INDEX_NAME = "profile_task";
    public static final String TASK_ID = "task_id";
    public static final String SERVICE_ID = "service_id";
    public static final String ENDPOINT_NAME = "endpoint_name";
    public static final String START_TIME = "start_time";
    public static final String DURATION = "duration";
    public static final String MIN_DURATION_THRESHOLD = "min_duration_threshold";
    public static final String DUMP_PERIOD = "dump_period";
    public static final String CREATE_TIME = "create_time";
    public static final String MAX_SAMPLING_COUNT = "max_sampling_count";

    @Override
    public StorageID id() {
        return new StorageID().append(TASK_ID, taskId);
    }

    @Column(name = SERVICE_ID)
    @BanyanDB.SeriesID(index = 0)
    private String serviceId;
    @Column(name = ENDPOINT_NAME, length = 512)
    private String endpointName;
    @Column(name = TASK_ID)
    private String taskId;
    @Column(name = START_TIME)
    private long startTime;
    @Column(name = DURATION)
    private int duration;
    @Column(name = MIN_DURATION_THRESHOLD)
    private int minDurationThreshold;
    @Column(name = DUMP_PERIOD)
    private int dumpPeriod;
    @Column(name = CREATE_TIME)
    private long createTime;
    @Column(name = MAX_SAMPLING_COUNT)
    private int maxSamplingCount;


    public static class Builder implements StorageBuilder<ProfileTaskRecord> {
        @Override
        public ProfileTaskRecord storage2Entity(final Convert2Entity converter) {
            final ProfileTaskRecord record = new ProfileTaskRecord();
            record.setServiceId((String) converter.get(SERVICE_ID));
            record.setEndpointName((String) converter.get(ENDPOINT_NAME));
            record.setTaskId((String) converter.get(TASK_ID));
            record.setStartTime(((Number) converter.get(START_TIME)).longValue());
            record.setDuration(((Number) converter.get(DURATION)).intValue());
            record.setMinDurationThreshold(((Number) converter.get(MIN_DURATION_THRESHOLD)).intValue());
            record.setDumpPeriod(((Number) converter.get(DUMP_PERIOD)).intValue());
            record.setCreateTime(((Number) converter.get(CREATE_TIME)).longValue());
            record.setTimeBucket(((Number) converter.get(TIME_BUCKET)).longValue());
            record.setMaxSamplingCount(((Number) converter.get(MAX_SAMPLING_COUNT)).intValue());
            return record;
        }

        @Override
        public void entity2Storage(final ProfileTaskRecord storageData, final Convert2Storage converter) {
            converter.accept(SERVICE_ID, storageData.getServiceId());
            converter.accept(ENDPOINT_NAME, storageData.getEndpointName());
            converter.accept(TASK_ID, storageData.getTaskId());
            converter.accept(START_TIME, storageData.getStartTime());
            converter.accept(DURATION, storageData.getDuration());
            converter.accept(MIN_DURATION_THRESHOLD, storageData.getMinDurationThreshold());
            converter.accept(DUMP_PERIOD, storageData.getDumpPeriod());
            converter.accept(CREATE_TIME, storageData.getCreateTime());
            converter.accept(TIME_BUCKET, storageData.getTimeBucket());
            converter.accept(MAX_SAMPLING_COUNT, storageData.getMaxSamplingCount());
        }
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public String getServiceId() {
        return this.serviceId;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public String getEndpointName() {
        return this.endpointName;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public String getTaskId() {
        return this.taskId;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public long getStartTime() {
        return this.startTime;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public int getDuration() {
        return this.duration;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public int getMinDurationThreshold() {
        return this.minDurationThreshold;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public int getDumpPeriod() {
        return this.dumpPeriod;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public long getCreateTime() {
        return this.createTime;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public int getMaxSamplingCount() {
        return this.maxSamplingCount;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setServiceId(final String serviceId) {
        this.serviceId = serviceId;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setEndpointName(final String endpointName) {
        this.endpointName = endpointName;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setTaskId(final String taskId) {
        this.taskId = taskId;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setStartTime(final long startTime) {
        this.startTime = startTime;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setDuration(final int duration) {
        this.duration = duration;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setMinDurationThreshold(final int minDurationThreshold) {
        this.minDurationThreshold = minDurationThreshold;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setDumpPeriod(final int dumpPeriod) {
        this.dumpPeriod = dumpPeriod;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setCreateTime(final long createTime) {
        this.createTime = createTime;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setMaxSamplingCount(final int maxSamplingCount) {
        this.maxSamplingCount = maxSamplingCount;
    }
}
