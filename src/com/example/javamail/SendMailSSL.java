/*package com.example.javamail;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

public class SendMailSSL {
	public static void main(String[] args) {

		String to = "letters.syed@gmail.com";

		// Get the session object
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");

		Session session = Session.getDefaultInstance(props,
				new javax.mail.Authenticator() {
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication("talib.man.united@gmail.com", "xxx");
					}
				});

		// compose message
		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress("talib.man.united@gmail.com"));
																			
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			message.setSubject("Test Mail");
			message.setText("Testing.......");

			// send message
			Transport.send(message);

			System.out.println("message sent successfully");

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}

	}
}*/