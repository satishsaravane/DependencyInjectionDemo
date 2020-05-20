package com.dbs.java.dependencyinjection.consumer;

import com.dbs.java.dependencyinjection.service.MessageService;

public class MyDIApplication implements Consumer {

  private MessageService service;

  public MyDIApplication(MessageService svc) {
    this.service = svc;
  }

  public MyDIApplication() {
  }

  public void setService(final MessageService service) {
    this.service = service;
  }

  @Override
  public void processMessages(final String msg, final String receiver, final String sender) {
    //do some msg validation, manipulation logic etc
    this.service.sendMessage(msg, receiver, sender);
  }

}
