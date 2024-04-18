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

import org.apache.skywalking.oap.server.core.profiling.ebpf.storage.EBPFProfilingStackType;

public class EBPFProfilingStackElement {
    private int id;
    private int parentId;
    private String symbol;
    private EBPFProfilingStackType stackType;
    private long dumpCount;

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public EBPFProfilingStackElement() {
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public int getId() {
        return this.id;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public int getParentId() {
        return this.parentId;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public String getSymbol() {
        return this.symbol;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public EBPFProfilingStackType getStackType() {
        return this.stackType;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public long getDumpCount() {
        return this.dumpCount;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setId(final int id) {
        this.id = id;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setParentId(final int parentId) {
        this.parentId = parentId;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setSymbol(final String symbol) {
        this.symbol = symbol;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setStackType(final EBPFProfilingStackType stackType) {
        this.stackType = stackType;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setDumpCount(final long dumpCount) {
        this.dumpCount = dumpCount;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof EBPFProfilingStackElement)) return false;
        final EBPFProfilingStackElement other = (EBPFProfilingStackElement) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        if (this.getId() != other.getId()) return false;
        if (this.getParentId() != other.getParentId()) return false;
        if (this.getDumpCount() != other.getDumpCount()) return false;
        final java.lang.Object this$symbol = this.getSymbol();
        final java.lang.Object other$symbol = other.getSymbol();
        if (this$symbol == null ? other$symbol != null : !this$symbol.equals(other$symbol)) return false;
        final java.lang.Object this$stackType = this.getStackType();
        final java.lang.Object other$stackType = other.getStackType();
        if (this$stackType == null ? other$stackType != null : !this$stackType.equals(other$stackType)) return false;
        return true;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof EBPFProfilingStackElement;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + this.getId();
        result = result * PRIME + this.getParentId();
        final long $dumpCount = this.getDumpCount();
        result = result * PRIME + (int) ($dumpCount >>> 32 ^ $dumpCount);
        final java.lang.Object $symbol = this.getSymbol();
        result = result * PRIME + ($symbol == null ? 43 : $symbol.hashCode());
        final java.lang.Object $stackType = this.getStackType();
        result = result * PRIME + ($stackType == null ? 43 : $stackType.hashCode());
        return result;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public java.lang.String toString() {
        return "EBPFProfilingStackElement(id=" + this.getId() + ", parentId=" + this.getParentId() + ", symbol=" + this.getSymbol() + ", stackType=" + this.getStackType() + ", dumpCount=" + this.getDumpCount() + ")";
    }
}
