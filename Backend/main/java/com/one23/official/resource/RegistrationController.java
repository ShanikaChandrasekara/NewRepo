package com.one23.official.resource;

import com.one23.official.model.StoreManager;
import com.one23.official.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    @Autowired
    private NotificationService notificationService;

    @RequestMapping("/signupSm")
    public String signUp(){
        return "Please Sign Up";
    }

    @RequestMapping("/signup-success")
    public String signupSuccess(){

        //create store manager
        StoreManager storeManager = new StoreManager();
        storeManager.setUsername("ShanikaDilrukshi");
        storeManager.setEmail("ailichandrasekara@gmail.com");
        storeManager.setPassword("abcd");

        //Send a notification
        try {
            notificationService.sendNotification(storeManager);
        }catch (MailException e){
            e.getMessage();
        }


        return "You have been registered as a new store manager!";
    }

}
