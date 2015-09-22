package com.lichking.model;

/**
 * Created by flash on 15/9/19.
 */
public class User {
    private int id;
    private String name;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public int getSex() {
        return sex;
    }

    public String getMobile() {
        return mobile;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getPicture() {
        return picture;
    }

    public int getDel() {
        return del;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public void setDel(int del) {
        this.del = del;
    }

    private String password;
    private int sex;
    private String mobile;
    private String email;
    private String address;
    private String picture;
    private int del;

}
