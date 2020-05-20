package com.dbs.java.dependencyinjection.injector;

import com.dbs.java.dependencyinjection.consumer.Consumer;
import com.dbs.java.dependencyinjection.consumer.MyDIApplication;
import com.dbs.java.dependencyinjection.service.impl.EmailServiceImpl;

public class EmailServiceInjector implements MessageServiceInjector {

  @Override
  public Consumer getConsumer() {
    final MyDIApplication app = new MyDIApplication();
    app.setService(new EmailServiceImpl());
    return app;
  }

}
