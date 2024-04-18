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

public class NullableValue {
    private long value;
    private boolean isEmptyValue;

    public NullableValue() {
    }

    public NullableValue(long value, boolean isEmptyValue) {
        this.value = value;
        this.isEmptyValue = isEmptyValue;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public long getValue() {
        return this.value;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public boolean isEmptyValue() {
        return this.isEmptyValue;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setValue(final long value) {
        this.value = value;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setEmptyValue(final boolean isEmptyValue) {
        this.isEmptyValue = isEmptyValue;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof NullableValue)) return false;
        final NullableValue other = (NullableValue) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        if (this.getValue() != other.getValue()) return false;
        if (this.isEmptyValue() != other.isEmptyValue()) return false;
        return true;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof NullableValue;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final long $value = this.getValue();
        result = result * PRIME + (int) ($value >>> 32 ^ $value);
        result = result * PRIME + (this.isEmptyValue() ? 79 : 97);
        return result;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public java.lang.String toString() {
        return "NullableValue(value=" + this.getValue() + ", isEmptyValue=" + this.isEmptyValue() + ")";
    }
}
