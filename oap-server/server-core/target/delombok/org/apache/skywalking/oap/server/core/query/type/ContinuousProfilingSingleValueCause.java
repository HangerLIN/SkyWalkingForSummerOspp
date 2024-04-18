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
package org.apache.skywalking.oap.server.core.query.type;

/**
 * Continuous profiling single value based cause
 */
public class ContinuousProfilingSingleValueCause {
    private long threshold;
    private long current;

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public ContinuousProfilingSingleValueCause() {
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public long getThreshold() {
        return this.threshold;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public long getCurrent() {
        return this.current;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setThreshold(final long threshold) {
        this.threshold = threshold;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setCurrent(final long current) {
        this.current = current;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof ContinuousProfilingSingleValueCause)) return false;
        final ContinuousProfilingSingleValueCause other = (ContinuousProfilingSingleValueCause) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        if (this.getThreshold() != other.getThreshold()) return false;
        if (this.getCurrent() != other.getCurrent()) return false;
        return true;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof ContinuousProfilingSingleValueCause;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final long $threshold = this.getThreshold();
        result = result * PRIME + (int) ($threshold >>> 32 ^ $threshold);
        final long $current = this.getCurrent();
        result = result * PRIME + (int) ($current >>> 32 ^ $current);
        return result;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public java.lang.String toString() {
        return "ContinuousProfilingSingleValueCause(threshold=" + this.getThreshold() + ", current=" + this.getCurrent() + ")";
    }
}
