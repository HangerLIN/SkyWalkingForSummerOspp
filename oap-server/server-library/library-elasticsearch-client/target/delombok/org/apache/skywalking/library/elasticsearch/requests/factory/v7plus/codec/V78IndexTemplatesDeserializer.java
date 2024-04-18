// Generated by delombok at Thu Apr 18 20:39:45 CST 2024
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
package org.apache.skywalking.library.elasticsearch.requests.factory.v7plus.codec;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.base.Strings;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import org.apache.skywalking.library.elasticsearch.response.IndexTemplate;
import org.apache.skywalking.library.elasticsearch.response.IndexTemplates;
import static java.util.stream.Collectors.toMap;

final class V78IndexTemplatesDeserializer extends JsonDeserializer<IndexTemplates> {
    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(V78IndexTemplatesDeserializer.class);
    private static final TypeReference<List<IndexTemplateWrapper>> TYPE_REFERENCE = new TypeReference<List<IndexTemplateWrapper>>() {
    };

    @Override
    public IndexTemplates deserialize(final JsonParser p, final DeserializationContext ctxt) throws IOException {
        while (!p.nextFieldName(new SerializedString("index_templates"))) {
            if (p.currentName() == null) {
                return new IndexTemplates(Collections.emptyMap());
            }
            p.skipChildren();
        }
        if (p.nextToken() != JsonToken.START_ARRAY) {
            throw new UnsupportedOperationException("this might be a new ElasticSearch version and we don\'t support yet");
        }
        final JsonNode array = p.getCodec().readTree(p);
        final List<IndexTemplate> templates = new ArrayList<>(array.size());
        for (final JsonNode node : array) {
            final String name = node.get("name").asText();
            if (Strings.isNullOrEmpty(name)) {
                log.error("index template without a name: {}", node);
                continue;
            }
            final JsonNode indexTemplateNode = node.get("index_template");
            if (indexTemplateNode == null) {
                log.error("index template without index_template: {}", node);
                continue;
            }
            final IndexTemplateWrapper wrapper = p.getCodec().treeToValue(indexTemplateNode, IndexTemplateWrapper.class);
            wrapper.getTemplate().setName(name);
            wrapper.getTemplate().setIndexPatterns(wrapper.getIndexPatterns());
            templates.add(wrapper.getTemplate());
        }
        final Map<String, IndexTemplate> templateMap = templates.stream().collect(toMap(IndexTemplate::getName, Function.identity()));
        return new IndexTemplates(templateMap);
    }


    static final class IndexTemplateWrapper {
        @JsonProperty("index_patterns")
        private List<String> indexPatterns;
        private IndexTemplate template;

        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public IndexTemplateWrapper() {
        }

        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public List<String> getIndexPatterns() {
            return this.indexPatterns;
        }

        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public IndexTemplate getTemplate() {
            return this.template;
        }

        @JsonProperty("index_patterns")
        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public void setIndexPatterns(final List<String> indexPatterns) {
            this.indexPatterns = indexPatterns;
        }

        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public void setTemplate(final IndexTemplate template) {
            this.template = template;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public boolean equals(final java.lang.Object o) {
            if (o == this) return true;
            if (!(o instanceof V78IndexTemplatesDeserializer.IndexTemplateWrapper)) return false;
            final V78IndexTemplatesDeserializer.IndexTemplateWrapper other = (V78IndexTemplatesDeserializer.IndexTemplateWrapper) o;
            final java.lang.Object this$indexPatterns = this.getIndexPatterns();
            final java.lang.Object other$indexPatterns = other.getIndexPatterns();
            if (this$indexPatterns == null ? other$indexPatterns != null : !this$indexPatterns.equals(other$indexPatterns)) return false;
            final java.lang.Object this$template = this.getTemplate();
            final java.lang.Object other$template = other.getTemplate();
            if (this$template == null ? other$template != null : !this$template.equals(other$template)) return false;
            return true;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final java.lang.Object $indexPatterns = this.getIndexPatterns();
            result = result * PRIME + ($indexPatterns == null ? 43 : $indexPatterns.hashCode());
            final java.lang.Object $template = this.getTemplate();
            result = result * PRIME + ($template == null ? 43 : $template.hashCode());
            return result;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public java.lang.String toString() {
            return "V78IndexTemplatesDeserializer.IndexTemplateWrapper(indexPatterns=" + this.getIndexPatterns() + ", template=" + this.getTemplate() + ")";
        }
    }
}
