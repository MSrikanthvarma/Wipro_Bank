package org.com.sample.spark

import java.util.Properties

import org.apache.kafka.clients.producer.KafkaProducer
import org.apache.kafka.clients.producer.ProducerRecord

object KafkaProducer1 {
  def main(args: Array[String]): Unit = {
    val props = new Properties()
    props.put("log4j.debug", "true")
    props.put("bootstrap.servers", "localhost:9092")
    props.put("acks", "all");
    props.put("client.id", "ScalaProducerExample")
    props.put("zookeeper.connect", "localhost:2181")
    props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer")
    props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer")
    props.put("batch.size", "1000000");
    props.put("linger.ms", "100000");

    val producer = new KafkaProducer[String, String](props)
    for (i <- 1 to 100000) {
      val key = i.toString()
      val value = "value" + i
      val data = new ProducerRecord[String, String]("test", key, value)
      producer.send(data)
    }
    producer.close()
    println("succesfully produced data");
  }
}