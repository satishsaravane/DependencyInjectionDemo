package com.dbs.java.dependencyinjection.test;

import com.dbs.java.dependencyinjection.consumer.Consumer;
import com.dbs.java.dependencyinjection.injector.EmailServiceInjector;
import com.dbs.java.dependencyinjection.injector.MessageServiceInjector;
import com.dbs.java.dependencyinjection.injector.SMSServiceInjector;

public class MyMessageDITest {

  public static void main(String[] args) {
    final String msg = "This is to test dependency injection";
    final String receiver = "satish@gmail.com";
    final String toPhoneNum = "+65882678";
    final String fromPhoneNum = "+6586452";
    final String sender = "test@gmail.com";
    MessageServiceInjector injector = null;
    Consumer app = null;

    injector = new EmailServiceInjector();
    app = injector.getConsumer();
    app.processMessages(msg, receiver, sender);

    injector = new SMSServiceInjector();
    app = injector.getConsumer();
    app.processMessages(msg, toPhoneNum, fromPhoneNum);
  }

}
