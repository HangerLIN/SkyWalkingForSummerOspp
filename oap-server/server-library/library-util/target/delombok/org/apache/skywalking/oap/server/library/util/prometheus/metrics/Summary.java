// Generated by delombok at Thu Apr 18 20:39:42 CST 2024
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
package org.apache.skywalking.oap.server.library.util.prometheus.metrics;

import java.util.Map;

public class Summary extends Metric {
    private long sampleCount;
    private double sampleSum;
    private final Map<Double, Double> quantiles;

    public Summary(String name, Map<String, String> labels, long sampleCount, double sampleSum, Map<Double, Double> quantiles, long timestamp) {
        super(name, labels, timestamp);
        getLabels().remove("quantile");
        this.sampleCount = sampleCount;
        this.sampleSum = sampleSum;
        this.quantiles = quantiles;
    }

    @Override
    public Metric sum(Metric m) {
        Summary s = (Summary) m;
        this.sampleCount = this.sampleCount + s.getSampleCount();
        this.sampleSum = this.sampleSum + s.getSampleSum();
        return this;
    }

    @Override
    public Double value() {
        return this.getSampleSum() * 1000 / this.getSampleCount();
    }


    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public static class SummaryBuilder {
        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        private String name;
        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        private java.util.ArrayList<String> labels$key;
        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        private java.util.ArrayList<String> labels$value;
        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        private long sampleCount;
        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        private double sampleSum;
        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        private java.util.ArrayList<Double> quantiles$key;
        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        private java.util.ArrayList<Double> quantiles$value;
        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        private long timestamp;

        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        SummaryBuilder() {
        }

        /**
         * @return {@code this}.
         */
        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public Summary.SummaryBuilder name(final String name) {
            this.name = name;
            return this;
        }

        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public Summary.SummaryBuilder label(final String labelKey, final String labelValue) {
            if (this.labels$key == null) {
                this.labels$key = new java.util.ArrayList<String>();
                this.labels$value = new java.util.ArrayList<String>();
            }
            this.labels$key.add(labelKey);
            this.labels$value.add(labelValue);
            return this;
        }

        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public Summary.SummaryBuilder labels(final java.util.Map<? extends String, ? extends String> labels) {
            if (labels == null) {
                throw new java.lang.NullPointerException("labels cannot be null");
            }
            if (this.labels$key == null) {
                this.labels$key = new java.util.ArrayList<String>();
                this.labels$value = new java.util.ArrayList<String>();
            }
            for (final java.util.Map.Entry<? extends String, ? extends String> $lombokEntry : labels.entrySet()) {
                this.labels$key.add($lombokEntry.getKey());
                this.labels$value.add($lombokEntry.getValue());
            }
            return this;
        }

        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public Summary.SummaryBuilder clearLabels() {
            if (this.labels$key != null) {
                this.labels$key.clear();
                this.labels$value.clear();
            }
            return this;
        }

        /**
         * @return {@code this}.
         */
        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public Summary.SummaryBuilder sampleCount(final long sampleCount) {
            this.sampleCount = sampleCount;
            return this;
        }

        /**
         * @return {@code this}.
         */
        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public Summary.SummaryBuilder sampleSum(final double sampleSum) {
            this.sampleSum = sampleSum;
            return this;
        }

        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public Summary.SummaryBuilder quantile(final Double quantileKey, final Double quantileValue) {
            if (this.quantiles$key == null) {
                this.quantiles$key = new java.util.ArrayList<Double>();
                this.quantiles$value = new java.util.ArrayList<Double>();
            }
            this.quantiles$key.add(quantileKey);
            this.quantiles$value.add(quantileValue);
            return this;
        }

        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public Summary.SummaryBuilder quantiles(final java.util.Map<? extends Double, ? extends Double> quantiles) {
            if (quantiles == null) {
                throw new java.lang.NullPointerException("quantiles cannot be null");
            }
            if (this.quantiles$key == null) {
                this.quantiles$key = new java.util.ArrayList<Double>();
                this.quantiles$value = new java.util.ArrayList<Double>();
            }
            for (final java.util.Map.Entry<? extends Double, ? extends Double> $lombokEntry : quantiles.entrySet()) {
                this.quantiles$key.add($lombokEntry.getKey());
                this.quantiles$value.add($lombokEntry.getValue());
            }
            return this;
        }

        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public Summary.SummaryBuilder clearQuantiles() {
            if (this.quantiles$key != null) {
                this.quantiles$key.clear();
                this.quantiles$value.clear();
            }
            return this;
        }

        /**
         * @return {@code this}.
         */
        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public Summary.SummaryBuilder timestamp(final long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public Summary build() {
            java.util.Map<String, String> labels;
            switch (this.labels$key == null ? 0 : this.labels$key.size()) {
            case 0: 
                labels = java.util.Collections.emptyMap();
                break;
            case 1: 
                labels = java.util.Collections.singletonMap(this.labels$key.get(0), this.labels$value.get(0));
                break;
            default: 
                labels = new java.util.LinkedHashMap<String, String>(this.labels$key.size() < 1073741824 ? 1 + this.labels$key.size() + (this.labels$key.size() - 3) / 3 : java.lang.Integer.MAX_VALUE);
                for (int $i = 0; $i < this.labels$key.size(); $i++) labels.put(this.labels$key.get($i), (String) this.labels$value.get($i));
                labels = java.util.Collections.unmodifiableMap(labels);
            }
            java.util.Map<Double, Double> quantiles;
            switch (this.quantiles$key == null ? 0 : this.quantiles$key.size()) {
            case 0: 
                quantiles = java.util.Collections.emptyMap();
                break;
            case 1: 
                quantiles = java.util.Collections.singletonMap(this.quantiles$key.get(0), this.quantiles$value.get(0));
                break;
            default: 
                quantiles = new java.util.LinkedHashMap<Double, Double>(this.quantiles$key.size() < 1073741824 ? 1 + this.quantiles$key.size() + (this.quantiles$key.size() - 3) / 3 : java.lang.Integer.MAX_VALUE);
                for (int $i = 0; $i < this.quantiles$key.size(); $i++) quantiles.put(this.quantiles$key.get($i), (Double) this.quantiles$value.get($i));
                quantiles = java.util.Collections.unmodifiableMap(quantiles);
            }
            return new Summary(this.name, labels, this.sampleCount, this.sampleSum, quantiles, this.timestamp);
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("all")
        @lombok.Generated
        public java.lang.String toString() {
            return "Summary.SummaryBuilder(name=" + this.name + ", labels$key=" + this.labels$key + ", labels$value=" + this.labels$value + ", sampleCount=" + this.sampleCount + ", sampleSum=" + this.sampleSum + ", quantiles$key=" + this.quantiles$key + ", quantiles$value=" + this.quantiles$value + ", timestamp=" + this.timestamp + ")";
        }
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public static Summary.SummaryBuilder builder() {
        return new Summary.SummaryBuilder();
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof Summary)) return false;
        final Summary other = (Summary) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        if (!super.equals(o)) return false;
        if (this.getSampleCount() != other.getSampleCount()) return false;
        if (java.lang.Double.compare(this.getSampleSum(), other.getSampleSum()) != 0) return false;
        final java.lang.Object this$quantiles = this.getQuantiles();
        final java.lang.Object other$quantiles = other.getQuantiles();
        if (this$quantiles == null ? other$quantiles != null : !this$quantiles.equals(other$quantiles)) return false;
        return true;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof Summary;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        final long $sampleCount = this.getSampleCount();
        result = result * PRIME + (int) ($sampleCount >>> 32 ^ $sampleCount);
        final long $sampleSum = java.lang.Double.doubleToLongBits(this.getSampleSum());
        result = result * PRIME + (int) ($sampleSum >>> 32 ^ $sampleSum);
        final java.lang.Object $quantiles = this.getQuantiles();
        result = result * PRIME + ($quantiles == null ? 43 : $quantiles.hashCode());
        return result;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public java.lang.String toString() {
        return "Summary(super=" + super.toString() + ", sampleCount=" + this.getSampleCount() + ", sampleSum=" + this.getSampleSum() + ", quantiles=" + this.getQuantiles() + ")";
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public long getSampleCount() {
        return this.sampleCount;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public double getSampleSum() {
        return this.sampleSum;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public Map<Double, Double> getQuantiles() {
        return this.quantiles;
    }
}
