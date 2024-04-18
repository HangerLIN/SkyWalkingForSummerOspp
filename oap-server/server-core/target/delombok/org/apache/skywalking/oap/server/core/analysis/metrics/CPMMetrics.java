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
package org.apache.skywalking.oap.server.core.analysis.metrics;

import org.apache.skywalking.oap.server.core.analysis.metrics.annotation.ConstOne;
import org.apache.skywalking.oap.server.core.analysis.metrics.annotation.Entrance;
import org.apache.skywalking.oap.server.core.analysis.metrics.annotation.MetricsFunction;
import org.apache.skywalking.oap.server.core.query.sql.Function;
import org.apache.skywalking.oap.server.core.storage.annotation.BanyanDB;
import org.apache.skywalking.oap.server.core.storage.annotation.Column;

@MetricsFunction(functionName = "cpm")
public abstract class CPMMetrics extends Metrics implements LongValueHolder {
    protected static final String VALUE = "value";
    protected static final String TOTAL = "total";
    @Column(name = VALUE, dataType = Column.ValueDataType.COMMON_VALUE, function = Function.Avg)
    @BanyanDB.MeasureField
    private long value;
    @Column(name = TOTAL, storageOnly = true)
    @BanyanDB.MeasureField
    private long total;

    @Entrance
    public final void combine(@ConstOne long count) {
        this.total += count;
    }

    @Override
    public final boolean combine(Metrics metrics) {
        CPMMetrics cpmMetrics = (CPMMetrics) metrics;
        combine(cpmMetrics.total);
        return true;
    }

    @Override
    public void calculate() {
        this.value = total / getDurationInMinute();
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public long getValue() {
        return this.value;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setValue(final long value) {
        this.value = value;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public long getTotal() {
        return this.total;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setTotal(final long total) {
        this.total = total;
    }
}
