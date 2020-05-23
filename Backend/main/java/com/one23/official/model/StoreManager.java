package com.one23.official.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString

@Document(collection = "StoreManager")
public class StoreManager {
    @Id
    private String username;
    private String email;
    private String password;
    private String confirmpassword;


    public String getId() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String userName) {
        username = userName;
    }

    public void setEmail(String eMail) {
        email = eMail;
    }


    public void setPassword(String passWord) {
        password = passWord;
    }
}
