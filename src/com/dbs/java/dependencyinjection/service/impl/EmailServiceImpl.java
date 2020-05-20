package com.dbs.java.dependencyinjection.service.impl;

import com.dbs.java.dependencyinjection.service.MessageService;

public class EmailServiceImpl implements MessageService {

  @Override
  public void sendMessage(final String msg, final String receiver, final String sender) {
    System.out
        .println("Email sent to " + receiver + " with Message=" + msg + " from sender::" + sender);
  }

}
