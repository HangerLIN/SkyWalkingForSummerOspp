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
 */
package org.apache.skywalking.oap.server.analyzer.provider.trace.sampling;

public class SamplingPolicy {
    private Integer rate;
    private Integer duration;

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public Integer getRate() {
        return this.rate;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public Integer getDuration() {
        return this.duration;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setRate(final Integer rate) {
        this.rate = rate;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setDuration(final Integer duration) {
        this.duration = duration;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public java.lang.String toString() {
        return "SamplingPolicy(rate=" + this.getRate() + ", duration=" + this.getDuration() + ")";
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public SamplingPolicy(final Integer rate, final Integer duration) {
        this.rate = rate;
        this.duration = duration;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public SamplingPolicy() {
    }
}
