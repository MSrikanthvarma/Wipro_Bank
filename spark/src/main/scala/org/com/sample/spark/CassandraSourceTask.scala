package org.com.sample.spark

import org.apache.kafka.connect.source.SourceTask

class CassandraSourceTask extends SourceTask {
  def poll(): java.util.List[org.apache.kafka.connect.source.SourceRecord] = ???
  def start(props: java.util.Map[String, String]): Unit = {
    
  }
  def stop(): Unit = ???

  // Members declared in org.apache.kafka.connect.connector.Task
  def version(): String = ???
}