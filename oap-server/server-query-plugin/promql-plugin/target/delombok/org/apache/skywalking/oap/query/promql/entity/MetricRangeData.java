// Generated by delombok at Thu Apr 18 20:40:55 CST 2024
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
package org.apache.skywalking.oap.query.promql.entity;

import java.util.List;

public class MetricRangeData extends MetricData {
    private List<TimeValuePair> values;

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public MetricRangeData() {
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public List<TimeValuePair> getValues() {
        return this.values;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setValues(final List<TimeValuePair> values) {
        this.values = values;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof MetricRangeData)) return false;
        final MetricRangeData other = (MetricRangeData) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$values = this.getValues();
        final java.lang.Object other$values = other.getValues();
        if (this$values == null ? other$values != null : !this$values.equals(other$values)) return false;
        return true;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof MetricRangeData;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $values = this.getValues();
        result = result * PRIME + ($values == null ? 43 : $values.hashCode());
        return result;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public java.lang.String toString() {
        return "MetricRangeData(values=" + this.getValues() + ")";
    }
}
