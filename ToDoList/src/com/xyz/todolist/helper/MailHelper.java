//package com.xyz.todolist.helper;
//
//import java.time.LocalDate;
//import java.util.Properties;
//
//import javax.mail.Message;
//import javax.mail.MessagingException;
//import javax.mail.Session;
//import javax.mail.internet.MimeMessage;
//import javax.mail.PasswordAuthentication;
//import javax.mail.Transport;
//import javax.mail.internet.InternetAddress;
//
//public interface MailHelper {
//public static boolean sendMail(String taskName, LocalDate date) {
//	final String username = "Sonu.mp69@gmail.com";
//	final String password = "8397802680";
//	
//	Properties prop = new Properties();
//	prop.put("mail.smtp.host", "smtp.gmail.com");
//	
//	prop.put("mail.smtp.port", "587");
//	prop.put("mail.smtp.auth", "true");
//	prop.put("mail.smtp.starttls.enable", "true"); //TLS
//	}
//
////Step 1- Authentication
//Session session = Session.getInstance(prop,
//		new javax.mail.Authenticator() {
//	protected PasswordAuthentication getPasswordAuthentication() {
//		return new PasswordAuthenication(username,password);
//	}
//});
//
//		
////Step 2- From, TO, Subject, Content
//
//try {
//	
//	Message message = new MimeMessage(session);
//	message.setFrom(new InternetAddress("sender@gmail.com"));
//	message.setRecipients(
//			Message.RecipientType.TO,
//			InternetAddress.parse("rec@gmail.com,rec@gmail.com")
//			);
//	messege.setSubject("A new ToDo Assign to all");
//	message.setText("Dear User Your Task for today is "+taskName+ "and End by this date"+date);
//
//	//Step 3- Send the Message
//	Transport.send(message);
//	System.out.println("Done");
//	return true;
//
//}
//
//catch (MessagingException e) {
//	e.printStackTrace();
//	return false;
//    }
//	
//}
//
