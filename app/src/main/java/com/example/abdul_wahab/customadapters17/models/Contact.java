package com.example.abdul_wahab.customadapters17.models;

/**
 * Created by Abdul-Wahab on 4/5/2017.
 */

public class Contact {

    private String name;
    private String phone;
    private boolean isMail;

    public Contact(String name, String phone, boolean isMail) {
        this.name = name;
        this.phone = phone;
        this.isMail = isMail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isMail() {
        return isMail;
    }

    public void setMail(boolean mail) {
        isMail = mail;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", isMail=" + isMail +
                '}';
    }
}
