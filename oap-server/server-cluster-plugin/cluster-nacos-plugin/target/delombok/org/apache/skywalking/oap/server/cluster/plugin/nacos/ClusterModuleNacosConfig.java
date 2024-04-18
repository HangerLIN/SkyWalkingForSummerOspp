// Generated by delombok at Thu Apr 18 20:40:28 CST 2024
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
package org.apache.skywalking.oap.server.cluster.plugin.nacos;

import org.apache.skywalking.oap.server.library.module.ModuleConfig;

public class ClusterModuleNacosConfig extends ModuleConfig {
    private String serviceName;
    private String hostPort;
    private String namespace = "public";
    private String internalComHost;
    private int internalComPort = -1;
    private String username;
    private String password;
    private String accessKey;
    private String secretKey;

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public String getServiceName() {
        return this.serviceName;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public String getHostPort() {
        return this.hostPort;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public String getNamespace() {
        return this.namespace;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public String getInternalComHost() {
        return this.internalComHost;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public int getInternalComPort() {
        return this.internalComPort;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public String getUsername() {
        return this.username;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public String getPassword() {
        return this.password;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public String getAccessKey() {
        return this.accessKey;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public String getSecretKey() {
        return this.secretKey;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setServiceName(final String serviceName) {
        this.serviceName = serviceName;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setHostPort(final String hostPort) {
        this.hostPort = hostPort;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setNamespace(final String namespace) {
        this.namespace = namespace;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setInternalComHost(final String internalComHost) {
        this.internalComHost = internalComHost;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setInternalComPort(final int internalComPort) {
        this.internalComPort = internalComPort;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setUsername(final String username) {
        this.username = username;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setPassword(final String password) {
        this.password = password;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setAccessKey(final String accessKey) {
        this.accessKey = accessKey;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setSecretKey(final String secretKey) {
        this.secretKey = secretKey;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public java.lang.String toString() {
        return "ClusterModuleNacosConfig(serviceName=" + this.getServiceName() + ", hostPort=" + this.getHostPort() + ", namespace=" + this.getNamespace() + ", internalComHost=" + this.getInternalComHost() + ", internalComPort=" + this.getInternalComPort() + ", username=" + this.getUsername() + ", password=" + this.getPassword() + ", accessKey=" + this.getAccessKey() + ", secretKey=" + this.getSecretKey() + ")";
    }
}
