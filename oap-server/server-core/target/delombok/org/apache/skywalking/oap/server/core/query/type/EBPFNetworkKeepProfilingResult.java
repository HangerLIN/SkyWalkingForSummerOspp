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

public class EBPFNetworkKeepProfilingResult {
    private boolean status;
    private String errorReason;


    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public static class EBPFNetworkKeepProfilingResultBuilder {
        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        private boolean status;
        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        private String errorReason;

        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        EBPFNetworkKeepProfilingResultBuilder() {
        }

        /**
         * @return {@code this}.
         */
        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public EBPFNetworkKeepProfilingResult.EBPFNetworkKeepProfilingResultBuilder status(final boolean status) {
            this.status = status;
            return this;
        }

        /**
         * @return {@code this}.
         */
        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public EBPFNetworkKeepProfilingResult.EBPFNetworkKeepProfilingResultBuilder errorReason(final String errorReason) {
            this.errorReason = errorReason;
            return this;
        }

        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public EBPFNetworkKeepProfilingResult build() {
            return new EBPFNetworkKeepProfilingResult(this.status, this.errorReason);
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public java.lang.String toString() {
            return "EBPFNetworkKeepProfilingResult.EBPFNetworkKeepProfilingResultBuilder(status=" + this.status + ", errorReason=" + this.errorReason + ")";
        }
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public static EBPFNetworkKeepProfilingResult.EBPFNetworkKeepProfilingResultBuilder builder() {
        return new EBPFNetworkKeepProfilingResult.EBPFNetworkKeepProfilingResultBuilder();
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public boolean isStatus() {
        return this.status;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public String getErrorReason() {
        return this.errorReason;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setStatus(final boolean status) {
        this.status = status;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setErrorReason(final String errorReason) {
        this.errorReason = errorReason;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof EBPFNetworkKeepProfilingResult)) return false;
        final EBPFNetworkKeepProfilingResult other = (EBPFNetworkKeepProfilingResult) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        if (this.isStatus() != other.isStatus()) return false;
        final java.lang.Object this$errorReason = this.getErrorReason();
        final java.lang.Object other$errorReason = other.getErrorReason();
        if (this$errorReason == null ? other$errorReason != null : !this$errorReason.equals(other$errorReason)) return false;
        return true;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof EBPFNetworkKeepProfilingResult;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.isStatus() ? 79 : 97);
        final java.lang.Object $errorReason = this.getErrorReason();
        result = result * PRIME + ($errorReason == null ? 43 : $errorReason.hashCode());
        return result;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public java.lang.String toString() {
        return "EBPFNetworkKeepProfilingResult(status=" + this.isStatus() + ", errorReason=" + this.getErrorReason() + ")";
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public EBPFNetworkKeepProfilingResult() {
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public EBPFNetworkKeepProfilingResult(final boolean status, final String errorReason) {
        this.status = status;
        this.errorReason = errorReason;
    }
}
