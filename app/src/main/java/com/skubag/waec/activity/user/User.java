package com.skubag.waec.activity.user;

public class User {

    private String phonenumber, status;

    public User(String phonenumber, String status) {
        this.phonenumber = phonenumber;
        this.status = status;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public String getStatus() {
        return status;
    }
//
//    public String getFullname() {
//        return fullname;
//    }
}