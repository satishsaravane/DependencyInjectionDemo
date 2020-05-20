package com.dbs.java.dependencyinjection.consumer;

public interface Consumer {

  void processMessages(final String msg, final String receiver, final String sender);
}
