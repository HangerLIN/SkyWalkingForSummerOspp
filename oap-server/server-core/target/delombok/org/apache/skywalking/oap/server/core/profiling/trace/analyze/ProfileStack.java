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
package org.apache.skywalking.oap.server.core.profiling.trace.analyze;

import com.google.common.primitives.Ints;
import com.google.protobuf.InvalidProtocolBufferException;
import java.util.List;
import java.util.Objects;
import org.apache.skywalking.apm.network.language.profile.v3.ThreadStack;
import org.apache.skywalking.oap.server.core.profiling.trace.ProfileThreadSnapshotRecord;

/**
 * Deserialize from {@link ProfileThreadSnapshotRecord}
 */
public class ProfileStack implements Comparable<ProfileStack> {
    private int sequence;
    private long dumpTime;
    private List<String> stack;

    public static ProfileStack deserialize(ProfileThreadSnapshotRecord record) {
        ThreadStack threadStack = null;
        try {
            threadStack = ThreadStack.parseFrom(record.getStackBinary());
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalArgumentException("wrong stack data");
        }
        // build data
        ProfileStack stack = new ProfileStack();
        stack.sequence = record.getSequence();
        stack.dumpTime = record.getDumpTime();
        stack.stack = threadStack.getCodeSignaturesList();
        return stack;
    }

    @Override
    public int compareTo(ProfileStack o) {
        return Ints.compare(sequence, o.sequence);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProfileStack that = (ProfileStack) o;
        return sequence == that.sequence;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sequence);
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public ProfileStack() {
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public int getSequence() {
        return this.sequence;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public long getDumpTime() {
        return this.dumpTime;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public List<String> getStack() {
        return this.stack;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setSequence(final int sequence) {
        this.sequence = sequence;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setDumpTime(final long dumpTime) {
        this.dumpTime = dumpTime;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setStack(final List<String> stack) {
        this.stack = stack;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public java.lang.String toString() {
        return "ProfileStack(sequence=" + this.getSequence() + ", dumpTime=" + this.getDumpTime() + ", stack=" + this.getStack() + ")";
    }
}
