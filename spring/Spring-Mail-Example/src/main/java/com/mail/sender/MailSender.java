package com.mail.sender;

import org.springframework.mail.SimpleMailMessage;



public class MailSender
{
	private org.springframework.mail.MailSender mailSender;
	private SimpleMailMessage simpleMailMessage;
	
	public void setSimpleMailMessage(SimpleMailMessage simpleMailMessage) {
		this.simpleMailMessage = simpleMailMessage;
	}

	public void setMailSender(org.springframework.mail.MailSender mailSender) {
		this.mailSender = mailSender;
	}
	
	public void sendMail(String dear, String content) {

		SimpleMailMessage message = new SimpleMailMessage(simpleMailMessage);
		
		message.setText(String.format(
				simpleMailMessage.getText(), dear, content));

		mailSender.send(message);
		
	}
	
	
}
