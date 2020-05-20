package com.dbs.java.dependencyinjection.test;

import com.dbs.java.dependencyinjection.consumer.Consumer;
import com.dbs.java.dependencyinjection.consumer.MyDIApplication;
import com.dbs.java.dependencyinjection.service.MessageService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.dbs.java.dependencyinjection.injector.MessageServiceInjector;

public class MyDIApplicationJUnitTest {

  private MessageServiceInjector injector;

  @Before
  public void setUp() {
    injector = new MessageServiceInjector() {

      @Override
      public Consumer getConsumer() {
        return new MyDIApplication(new MessageService() {

          @Override
          public void sendMessage(final String msg, final String receiver, final String sender) {
            System.out.println("Mock Message Service implementation");

          }
        });
      }
    };
  }

  @Test
  public void test() {
    Consumer consumer = injector.getConsumer();
    consumer.processMessages("Hi Satish", "satish@gmail.com", "test@gmail.com");
  }

  @After
  public void tear() {
    injector = null;
  }

}
