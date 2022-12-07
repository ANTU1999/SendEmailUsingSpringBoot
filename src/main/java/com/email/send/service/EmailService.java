package com.email.send.service;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.email.send.entity.Email;

@Service
public class EmailService {

	@Autowired
	private JavaMailSender javaMailSender;
	
	public void sendMail(Email email) {
		try {
			MimeMessage message=javaMailSender.createMimeMessage();
			MimeMessageHelper helper=new MimeMessageHelper(message);
			helper.setFrom("antumanna259@gmail.com");
			helper.setTo(email.getTo());
			helper.setSubject(email.getSub());
			helper.setText(email.getMessage());
			javaMailSender.send(message);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
