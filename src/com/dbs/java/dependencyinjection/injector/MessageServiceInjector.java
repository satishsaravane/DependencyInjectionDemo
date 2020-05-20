package com.dbs.java.dependencyinjection.injector;

import com.dbs.java.dependencyinjection.consumer.Consumer;

public interface MessageServiceInjector {

  public Consumer getConsumer();
}
