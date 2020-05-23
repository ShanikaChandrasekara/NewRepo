package com.one23.official.service;

import com.one23.official.model.StoreManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;
import org.springframework.mail.javamail.JavaMailSender;

@Service
public class NotificationService {

    private JavaMailSender javaMailSender;

    @Autowired
    public NotificationService(JavaMailSender javaMailSender){
        this.javaMailSender = javaMailSender;
    }

    public void sendNotification(StoreManager storeManager) throws MailException {
        //Send email
        SimpleMailMessage mail = new SimpleMailMessage();
        mail.setTo(storeManager.getEmail());
        mail.setFrom("shanikachandrasekarabus@gmail.com");
        mail.setSubject("Username and Password for the new store manager");
        mail.setText("Congratulations for your new admission as the store manager of the Fashion Store. Your new details are as follows. Username : "
                + storeManager.getId() + "Password : " + storeManager.getPassword());

        javaMailSender.send(mail);
    }

}
