// Generated by delombok at Thu Apr 18 20:40:56 CST 2024
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
package org.apache.skywalking.oap.query.logql.entity.response;

import org.apache.skywalking.oap.query.logql.entity.ResultStatus;

public class QueryResponse {
    private ResultStatus status;

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public QueryResponse() {
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public ResultStatus getStatus() {
        return this.status;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setStatus(final ResultStatus status) {
        this.status = status;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof QueryResponse)) return false;
        final QueryResponse other = (QueryResponse) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$status = this.getStatus();
        final java.lang.Object other$status = other.getStatus();
        if (this$status == null ? other$status != null : !this$status.equals(other$status)) return false;
        return true;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof QueryResponse;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $status = this.getStatus();
        result = result * PRIME + ($status == null ? 43 : $status.hashCode());
        return result;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public java.lang.String toString() {
        return "QueryResponse(status=" + this.getStatus() + ")";
    }
}
