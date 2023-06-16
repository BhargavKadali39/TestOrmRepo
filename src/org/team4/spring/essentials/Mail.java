package org.team4.spring.essentials;

import java.util.Properties;
import java.util.Random;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Mail {
	public void email(String mail) {
		String to = mail;
		String subject = "Password Reset";
		String body = "The OTP for the Password Reset: " + generateOTP();
		sendEmail(to, subject, body);
	}

	private static void sendEmail(String to, String subject, String body) {
		// SMTP server configuration
		System.out.println("In1");
		String host = "smtp.gmail.com";
		int port = 587;
		String username = "venkiepennant@gmail.com";
		String password = "zlzeeqlwziwvymop";

		System.out.println("In2");

		// Set properties
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.port", port);
		props.put("mail.smtp.ssl.protocols", "TLSv1.2");
		props.put("mail.smtp.ssl.ciphers", "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");

		System.out.println("In3");

		// Create session
		Session session = Session.getInstance(props, new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				System.out.println("In4");
				return new PasswordAuthentication(username, password);
			}
		});

		try {
			// Create message
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(username));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
			message.setSubject(subject);
			message.setText(body);

			System.out.println("In5");

			// Send message
			Transport.send(message);

			System.out.println("Email sent successfully.");
		} catch (MessagingException e) {
			System.out.println(e);
		}
	}

	private static String generateOTP() {
		Random random = new Random();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 6; i++) {
			int randomIndex = random.nextInt(10);
			sb.append(randomIndex);
		}
		return sb.toString();
	}
}
