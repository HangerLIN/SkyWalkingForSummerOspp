// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: opentelemetry/proto/metrics/v1/metrics.proto

package io.opentelemetry.proto.metrics.firehose.v0_7;

public interface DoubleHistogramOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opentelemetry.proto.metrics.v1.DoubleHistogram)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .opentelemetry.proto.metrics.v1.DoubleHistogramDataPoint data_points = 1;</code>
   */
  java.util.List<io.opentelemetry.proto.metrics.firehose.v0_7.DoubleHistogramDataPoint> 
      getDataPointsList();
  /**
   * <code>repeated .opentelemetry.proto.metrics.v1.DoubleHistogramDataPoint data_points = 1;</code>
   */
  io.opentelemetry.proto.metrics.firehose.v0_7.DoubleHistogramDataPoint getDataPoints(int index);
  /**
   * <code>repeated .opentelemetry.proto.metrics.v1.DoubleHistogramDataPoint data_points = 1;</code>
   */
  int getDataPointsCount();
  /**
   * <code>repeated .opentelemetry.proto.metrics.v1.DoubleHistogramDataPoint data_points = 1;</code>
   */
  java.util.List<? extends io.opentelemetry.proto.metrics.firehose.v0_7.DoubleHistogramDataPointOrBuilder> 
      getDataPointsOrBuilderList();
  /**
   * <code>repeated .opentelemetry.proto.metrics.v1.DoubleHistogramDataPoint data_points = 1;</code>
   */
  io.opentelemetry.proto.metrics.firehose.v0_7.DoubleHistogramDataPointOrBuilder getDataPointsOrBuilder(
      int index);

  /**
   * <pre>
   * aggregation_temporality describes if the aggregator reports delta changes
   * since last report time, or cumulative changes since a fixed start time.
   * </pre>
   *
   * <code>.opentelemetry.proto.metrics.v1.AggregationTemporality aggregation_temporality = 2;</code>
   * @return The enum numeric value on the wire for aggregationTemporality.
   */
  int getAggregationTemporalityValue();
  /**
   * <pre>
   * aggregation_temporality describes if the aggregator reports delta changes
   * since last report time, or cumulative changes since a fixed start time.
   * </pre>
   *
   * <code>.opentelemetry.proto.metrics.v1.AggregationTemporality aggregation_temporality = 2;</code>
   * @return The aggregationTemporality.
   */
  io.opentelemetry.proto.metrics.firehose.v0_7.AggregationTemporality getAggregationTemporality();
}
