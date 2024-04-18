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

package org.apache.skywalking.oap.server.storage.plugin.elasticsearch.base;

import org.apache.skywalking.oap.server.core.storage.SessionCacheCallback;
import org.apache.skywalking.oap.server.library.client.elasticsearch.UpdateRequestWrapper;

/**
 * MetricIndexUpdateWrapper wraps the built request wrapper with a new callback.
 */
public class MetricIndexUpdateWrapper extends UpdateRequestWrapper {
    private final SessionCacheCallback callback;

    public MetricIndexUpdateWrapper(UpdateRequestWrapper requestWrapper, SessionCacheCallback callback) {
        this.request = requestWrapper.getRequest();
        this.callback = callback;
    }

    @Override
    public void onUpdateFailure() {
        if (callback != null) {
            callback.onUpdateFailure();
        }
    }
}
