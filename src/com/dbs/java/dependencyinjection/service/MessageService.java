package com.dbs.java.dependencyinjection.service;

public interface MessageService {

  void sendMessage(final String msg, final String receiver, final String sender);
}
