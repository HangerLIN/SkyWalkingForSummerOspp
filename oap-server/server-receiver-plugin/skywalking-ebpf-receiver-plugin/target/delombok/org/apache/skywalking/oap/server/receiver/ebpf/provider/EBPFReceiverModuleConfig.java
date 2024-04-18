// Generated by delombok at Thu Apr 18 20:40:21 CST 2024
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
package org.apache.skywalking.oap.server.receiver.ebpf.provider;

import org.apache.skywalking.oap.server.library.module.ModuleConfig;

public class EBPFReceiverModuleConfig extends ModuleConfig {
    /**
     * The continuous profiling policy cache time, Unit is second. Default value is 60 seconds.
     */
    private int continuousPolicyCacheTimeout = 60;

    /**
     * The continuous profiling policy cache time, Unit is second. Default value is 60 seconds.
     */
    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public int getContinuousPolicyCacheTimeout() {
        return this.continuousPolicyCacheTimeout;
    }

    /**
     * The continuous profiling policy cache time, Unit is second. Default value is 60 seconds.
     */
    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setContinuousPolicyCacheTimeout(final int continuousPolicyCacheTimeout) {
        this.continuousPolicyCacheTimeout = continuousPolicyCacheTimeout;
    }
}
