package com.tamada.chatdemo.models;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by inventbird on 31/10/17.
 */

@IgnoreExtraProperties
public class UserModel {
    private String id;
    private String userName;
    private String email;
    private String password;

    public UserModel() {
    }

    public UserModel(String id, String userName, String email, String password) {
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
