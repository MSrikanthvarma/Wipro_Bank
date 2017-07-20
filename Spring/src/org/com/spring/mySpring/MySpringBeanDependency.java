package org.com.spring.mySpring;

public class MySpringBeanDependency {
	MessageService messageService;

	public MySpringBeanDependency(MessageService messageService) {
		super();
		this.messageService = messageService;
	}

	public void run(String str) {
		messageService.sendMessage(str);
	}
}
