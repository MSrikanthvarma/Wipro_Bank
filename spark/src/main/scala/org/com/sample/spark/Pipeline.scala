package org.com.sample.spark

import org.apache.spark.SparkConf
import com.datastax.spark.connector.streaming._
import org.apache.spark.streaming.StreamingContext
import org.apache.spark.streaming.Seconds
import org.apache.spark.streaming.dstream.ConstantInputDStream

object Pipeline {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("pipeline").setMaster("local[*]").set("spark.cassandra.connection.host", "127.0.0.1")
    val streamingContext = new StreamingContext(conf, Seconds(10))
    val cassandraRdd = streamingContext.cassandraTable("mykeyspace", "employee")
    val dstream = new ConstantInputDStream(streamingContext, cassandraRdd)
    dstream.foreachRDD(rdd => println(rdd.collect().mkString))
    streamingContext.start()
    streamingContext.awaitTermination()
  }
}