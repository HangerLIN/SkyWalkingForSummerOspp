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

public class ProfileStackElement {
    // work for tree building, id matches multiple parentId
    private int id;
    private int parentId;
    // stack code signature
    private String codeSignature;
    // include the execution time of children(millisecond)
    private int duration;
    // exclude the execution time of children(millisecond)
    private int durationChildExcluded;
    // continuous dump count
    private int count;

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
    public String getCodeSignature() {
        return this.codeSignature;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public int getDuration() {
        return this.duration;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public int getDurationChildExcluded() {
        return this.durationChildExcluded;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public int getCount() {
        return this.count;
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
    public void setCodeSignature(final String codeSignature) {
        this.codeSignature = codeSignature;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setDuration(final int duration) {
        this.duration = duration;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setDurationChildExcluded(final int durationChildExcluded) {
        this.durationChildExcluded = durationChildExcluded;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setCount(final int count) {
        this.count = count;
    }
}
