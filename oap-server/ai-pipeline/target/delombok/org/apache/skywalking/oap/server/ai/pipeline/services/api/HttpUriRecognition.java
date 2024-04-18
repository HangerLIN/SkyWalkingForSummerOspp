// Generated by delombok at Thu Apr 18 20:39:48 CST 2024
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
package org.apache.skywalking.oap.server.ai.pipeline.services.api;

import java.util.List;
import org.apache.skywalking.oap.server.library.module.Service;

/**
 * HttpUriRecognition is a service to recognize the patterns of HTTP URIs
 */
public interface HttpUriRecognition extends Service {
    /**
     * @return true if the service is initialized and active.
     */
    boolean isInitialized();

    /**
     * Fetch all patterns of identified HTTP URIs
     * @param service the name of the service
     * @return the list of patterns of HTTP URIs
     */
    List<HttpUriPattern> fetchAllPatterns(String service);

    /**
     * Feed all data for the pattern recognition of HTTP URIs
     *
     * @param service        the name of the service
     * @param unrecognizedURIs the list of unrecognized URIs and candidates of recognized URIs.
     */
    void feedRawData(String service, List<HTTPUri> unrecognizedURIs);


    class HTTPUri {
        private final String name;

        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public HTTPUri(final String name) {
            this.name = name;
        }

        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public String getName() {
            return this.name;
        }
    }
}
