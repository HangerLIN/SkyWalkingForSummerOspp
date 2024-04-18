// Generated by delombok at Thu Apr 18 20:39:51 CST 2024
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
package org.apache.skywalking.oap.server.core.source;

import org.apache.skywalking.oap.server.core.analysis.manual.searchtag.TagType;
import org.apache.skywalking.oap.server.library.util.StringUtil;

@ScopeDeclaration(id = DefaultScopeDefine.TAG_AUTOCOMPLETE, name = "TagAutocomplete")
public class TagAutocomplete extends Source {
    @Override
    public int scope() {
        return DefaultScopeDefine.TAG_AUTOCOMPLETE;
    }

    @Override
    public String getEntityId() {
        return StringUtil.join('=', tagKey, tagValue);
    }

    private String tagKey;
    private String tagValue;
    private TagType tagType;

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setTagKey(final String tagKey) {
        this.tagKey = tagKey;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public String getTagKey() {
        return this.tagKey;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setTagValue(final String tagValue) {
        this.tagValue = tagValue;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public String getTagValue() {
        return this.tagValue;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setTagType(final TagType tagType) {
        this.tagType = tagType;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public TagType getTagType() {
        return this.tagType;
    }
}
