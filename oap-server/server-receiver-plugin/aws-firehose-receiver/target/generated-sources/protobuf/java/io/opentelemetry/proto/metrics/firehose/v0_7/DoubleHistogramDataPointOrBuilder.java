// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: opentelemetry/proto/metrics/v1/metrics.proto

package io.opentelemetry.proto.metrics.firehose.v0_7;

public interface DoubleHistogramDataPointOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opentelemetry.proto.metrics.v1.DoubleHistogramDataPoint)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The set of labels that uniquely identify this timeseries.
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.common.v1.StringKeyValue labels = 1;</code>
   */
  java.util.List<io.opentelemetry.proto.common.firehose.v0_7.StringKeyValue> 
      getLabelsList();
  /**
   * <pre>
   * The set of labels that uniquely identify this timeseries.
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.common.v1.StringKeyValue labels = 1;</code>
   */
  io.opentelemetry.proto.common.firehose.v0_7.StringKeyValue getLabels(int index);
  /**
   * <pre>
   * The set of labels that uniquely identify this timeseries.
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.common.v1.StringKeyValue labels = 1;</code>
   */
  int getLabelsCount();
  /**
   * <pre>
   * The set of labels that uniquely identify this timeseries.
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.common.v1.StringKeyValue labels = 1;</code>
   */
  java.util.List<? extends io.opentelemetry.proto.common.firehose.v0_7.StringKeyValueOrBuilder> 
      getLabelsOrBuilderList();
  /**
   * <pre>
   * The set of labels that uniquely identify this timeseries.
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.common.v1.StringKeyValue labels = 1;</code>
   */
  io.opentelemetry.proto.common.firehose.v0_7.StringKeyValueOrBuilder getLabelsOrBuilder(
      int index);

  /**
   * <pre>
   * start_time_unix_nano is the last time when the aggregation value was reset
   * to "zero". For some metric types this is ignored, see data types for more
   * details.
   * The aggregation value is over the time interval (start_time_unix_nano,
   * time_unix_nano].
   * 
   * Value is UNIX Epoch time in nanoseconds since 00:00:00 UTC on 1 January
   * 1970.
   * Value of 0 indicates that the timestamp is unspecified. In that case the
   * timestamp may be decided by the backend.
   * </pre>
   *
   * <code>fixed64 start_time_unix_nano = 2;</code>
   * @return The startTimeUnixNano.
   */
  long getStartTimeUnixNano();

  /**
   * <pre>
   * time_unix_nano is the moment when this aggregation value was reported.
   * 
   * Value is UNIX Epoch time in nanoseconds since 00:00:00 UTC on 1 January
   * 1970.
   * </pre>
   *
   * <code>fixed64 time_unix_nano = 3;</code>
   * @return The timeUnixNano.
   */
  long getTimeUnixNano();

  /**
   * <pre>
   * count is the number of values in the population. Must be non-negative. This
   * value must be equal to the sum of the "count" fields in buckets if a
   * histogram is provided.
   * </pre>
   *
   * <code>fixed64 count = 4;</code>
   * @return The count.
   */
  long getCount();

  /**
   * <pre>
   * sum of the values in the population. If count is zero then this field
   * must be zero. This value must be equal to the sum of the "sum" fields in
   * buckets if a histogram is provided.
   * </pre>
   *
   * <code>double sum = 5;</code>
   * @return The sum.
   */
  double getSum();

  /**
   * <pre>
   * bucket_counts is an optional field contains the count values of histogram
   * for each bucket.
   * The sum of the bucket_counts must equal the value in the count field.
   * The number of elements in bucket_counts array must be by one greater than
   * the number of elements in explicit_bounds array.
   * </pre>
   *
   * <code>repeated fixed64 bucket_counts = 6;</code>
   * @return A list containing the bucketCounts.
   */
  java.util.List<java.lang.Long> getBucketCountsList();
  /**
   * <pre>
   * bucket_counts is an optional field contains the count values of histogram
   * for each bucket.
   * The sum of the bucket_counts must equal the value in the count field.
   * The number of elements in bucket_counts array must be by one greater than
   * the number of elements in explicit_bounds array.
   * </pre>
   *
   * <code>repeated fixed64 bucket_counts = 6;</code>
   * @return The count of bucketCounts.
   */
  int getBucketCountsCount();
  /**
   * <pre>
   * bucket_counts is an optional field contains the count values of histogram
   * for each bucket.
   * The sum of the bucket_counts must equal the value in the count field.
   * The number of elements in bucket_counts array must be by one greater than
   * the number of elements in explicit_bounds array.
   * </pre>
   *
   * <code>repeated fixed64 bucket_counts = 6;</code>
   * @param index The index of the element to return.
   * @return The bucketCounts at the given index.
   */
  long getBucketCounts(int index);

  /**
   * <pre>
   * explicit_bounds specifies buckets with explicitly defined bounds for values.
   * The bucket boundaries are described by "bounds" field.
   * This defines size(bounds) + 1 (= N) buckets. The boundaries for bucket
   * at index i are:
   * (-infinity, bounds[i]) for i == 0
   * [bounds[i-1], bounds[i]) for 0 &lt; i &lt; N-1
   * [bounds[i], +infinity) for i == N-1
   * The values in bounds array must be strictly increasing.
   * Note: only [a, b) intervals are currently supported for each bucket except the first one.
   * If we decide to also support (a, b] intervals we should add support for these by defining
   * a boolean value which decides what type of intervals to use.
   * </pre>
   *
   * <code>repeated double explicit_bounds = 7;</code>
   * @return A list containing the explicitBounds.
   */
  java.util.List<java.lang.Double> getExplicitBoundsList();
  /**
   * <pre>
   * explicit_bounds specifies buckets with explicitly defined bounds for values.
   * The bucket boundaries are described by "bounds" field.
   * This defines size(bounds) + 1 (= N) buckets. The boundaries for bucket
   * at index i are:
   * (-infinity, bounds[i]) for i == 0
   * [bounds[i-1], bounds[i]) for 0 &lt; i &lt; N-1
   * [bounds[i], +infinity) for i == N-1
   * The values in bounds array must be strictly increasing.
   * Note: only [a, b) intervals are currently supported for each bucket except the first one.
   * If we decide to also support (a, b] intervals we should add support for these by defining
   * a boolean value which decides what type of intervals to use.
   * </pre>
   *
   * <code>repeated double explicit_bounds = 7;</code>
   * @return The count of explicitBounds.
   */
  int getExplicitBoundsCount();
  /**
   * <pre>
   * explicit_bounds specifies buckets with explicitly defined bounds for values.
   * The bucket boundaries are described by "bounds" field.
   * This defines size(bounds) + 1 (= N) buckets. The boundaries for bucket
   * at index i are:
   * (-infinity, bounds[i]) for i == 0
   * [bounds[i-1], bounds[i]) for 0 &lt; i &lt; N-1
   * [bounds[i], +infinity) for i == N-1
   * The values in bounds array must be strictly increasing.
   * Note: only [a, b) intervals are currently supported for each bucket except the first one.
   * If we decide to also support (a, b] intervals we should add support for these by defining
   * a boolean value which decides what type of intervals to use.
   * </pre>
   *
   * <code>repeated double explicit_bounds = 7;</code>
   * @param index The index of the element to return.
   * @return The explicitBounds at the given index.
   */
  double getExplicitBounds(int index);

  /**
   * <pre>
   * (Optional) List of exemplars collected from
   * measurements that were used to form the data point
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.metrics.v1.DoubleExemplar exemplars = 8;</code>
   */
  java.util.List<io.opentelemetry.proto.metrics.firehose.v0_7.DoubleExemplar> 
      getExemplarsList();
  /**
   * <pre>
   * (Optional) List of exemplars collected from
   * measurements that were used to form the data point
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.metrics.v1.DoubleExemplar exemplars = 8;</code>
   */
  io.opentelemetry.proto.metrics.firehose.v0_7.DoubleExemplar getExemplars(int index);
  /**
   * <pre>
   * (Optional) List of exemplars collected from
   * measurements that were used to form the data point
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.metrics.v1.DoubleExemplar exemplars = 8;</code>
   */
  int getExemplarsCount();
  /**
   * <pre>
   * (Optional) List of exemplars collected from
   * measurements that were used to form the data point
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.metrics.v1.DoubleExemplar exemplars = 8;</code>
   */
  java.util.List<? extends io.opentelemetry.proto.metrics.firehose.v0_7.DoubleExemplarOrBuilder> 
      getExemplarsOrBuilderList();
  /**
   * <pre>
   * (Optional) List of exemplars collected from
   * measurements that were used to form the data point
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.metrics.v1.DoubleExemplar exemplars = 8;</code>
   */
  io.opentelemetry.proto.metrics.firehose.v0_7.DoubleExemplarOrBuilder getExemplarsOrBuilder(
      int index);
}
