package org.com.spring.mySpring;

public class SmsService implements MessageService {
	@Override
	public void sendMessage(String str) {
		System.out.println("Send sms " + str);
	}
}
