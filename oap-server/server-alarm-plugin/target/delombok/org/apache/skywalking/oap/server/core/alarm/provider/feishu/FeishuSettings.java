// Generated by delombok at Thu Apr 18 20:40:58 CST 2024
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
package org.apache.skywalking.oap.server.core.alarm.provider.feishu;

import lombok.Builder;
import java.util.ArrayList;
import java.util.List;
import org.apache.skywalking.oap.server.core.alarm.provider.AlarmHookSettings;
import org.apache.skywalking.oap.server.core.alarm.provider.AlarmHooksType;

public class FeishuSettings extends AlarmHookSettings {
    private String textTemplate;
    private List<WebHookUrl> webhooks = new ArrayList<>();

    public FeishuSettings(final String name, final AlarmHooksType type, final boolean isDefault) {
        super(name, type, isDefault);
    }


    public static class WebHookUrl {
        private final String secret;
        private final String url;

        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public WebHookUrl(final String secret, final String url) {
            this.secret = secret;
            this.url = url;
        }

        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public String getSecret() {
            return this.secret;
        }

        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public String getUrl() {
            return this.url;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public java.lang.String toString() {
            return "FeishuSettings.WebHookUrl(secret=" + this.getSecret() + ", url=" + this.getUrl() + ")";
        }
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setTextTemplate(final String textTemplate) {
        this.textTemplate = textTemplate;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setWebhooks(final List<WebHookUrl> webhooks) {
        this.webhooks = webhooks;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public String getTextTemplate() {
        return this.textTemplate;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public List<WebHookUrl> getWebhooks() {
        return this.webhooks;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public java.lang.String toString() {
        return "FeishuSettings(textTemplate=" + this.getTextTemplate() + ", webhooks=" + this.getWebhooks() + ")";
    }
}
