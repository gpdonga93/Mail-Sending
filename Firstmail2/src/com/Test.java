package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext; 

public class Test {

	public static void main(String[] args) {
		
		
		@SuppressWarnings("resource")
		ApplicationContext ct= new ClassPathXmlApplicationContext("ApplicationContext1.xml");
		
		MainMail m= (MainMail) ct.getBean("mailMail");
		
		String Sender="EmterSenderEmailId.com";
		String receiver="EnterReceiverMailId.com";
		
		m.sendMail(Sender, receiver, "Test Email","hello java" );
	}

}
