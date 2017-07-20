package org.com.sample.spark

import java.util.Properties
import java.util.Collections
import scala.collection.JavaConverters._

import org.apache.kafka.clients.consumer.KafkaConsumer

object KafkaConsumer1 {
  def main(args: Array[String]): Unit = {
    val TOPIC = "test"
    val props = new Properties()
    props.put("bootstrap.servers", "localhost:9092")
    props.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer")
    props.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer")
    props.put("group.id", "something")
    props.put("zookeeper.connect", "localhost:2181")
    val consumer = new KafkaConsumer[String, String](props)
    consumer.subscribe(Collections.singletonList(TOPIC))
    while (true) {
      val records = consumer.poll(100)
    }
  }
}