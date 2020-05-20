package com.dbs.java.dependencyinjection.injector;

import com.dbs.java.dependencyinjection.consumer.Consumer;
import com.dbs.java.dependencyinjection.consumer.MyDIApplication;
import com.dbs.java.dependencyinjection.service.impl.SMSServiceImpl;

public class SMSServiceInjector implements MessageServiceInjector {

	@Override
	public Consumer getConsumer() {
		return new MyDIApplication(new SMSServiceImpl());
	}

}
