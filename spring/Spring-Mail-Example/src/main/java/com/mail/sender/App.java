package com.mail.sender;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Mail.xml");
    	 
    	MailSender mm = (MailSender)context.getBean("mailMail");
        mm.sendMail("Vijay", "This is test  content, please ignore ");
        
    }
}
