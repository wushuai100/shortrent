package com.lichking.model;

import java.security.Timestamp;

/**
 * Created by flash on 15/9/19.
 */
public class House {
    private int id;
    private int user_id;
    private String name;
    private int renttype;
    private String address;
    private Double dayprice;
    private int bill;
    private int kind;
    private String picture1;
    private String shortcut1;
    private String picture2;
    private String shortcut2;
    private String picture3;
    private String shortcut3;
    private int guestnum;
    private int bednum;
    private int bedroomnum;
    private int roomnum;
    private int bedtype;
    private int toiletnum;
    private String roomdesc;

    public void setId(int id) {
        this.id = id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRenttype(int renttype) {
        this.renttype = renttype;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDayprice(Double dayprice) {
        this.dayprice = dayprice;
    }

    public void setBill(int bill) {
        this.bill = bill;
    }

    public void setKind(int kind) {
        this.kind = kind;
    }

    public void setPicture1(String picture1) {
        this.picture1 = picture1;
    }

    public void setShortcut1(String shortcut1) {
        this.shortcut1 = shortcut1;
    }

    public void setPicture2(String picture2) {
        this.picture2 = picture2;
    }

    public void setShortcut2(String shortcut2) {
        this.shortcut2 = shortcut2;
    }

    public void setPicture3(String picture3) {
        this.picture3 = picture3;
    }

    public void setShortcut3(String shortcut3) {
        this.shortcut3 = shortcut3;
    }

    public void setGuestnum(int guestnum) {
        this.guestnum = guestnum;
    }

    public void setBednum(int bednum) {
        this.bednum = bednum;
    }

    public void setBedroomnum(int bedroomnum) {
        this.bedroomnum = bedroomnum;
    }

    public void setRoomnum(int roomnum) {
        this.roomnum = roomnum;
    }

    public void setBedtype(int bedtype) {
        this.bedtype = bedtype;
    }

    public void setToiletnum(int toiletnum) {
        this.toiletnum = toiletnum;
    }

    public void setRoomdesc(String roomdesc) {
        this.roomdesc = roomdesc;
    }

    public void setUserule(String userule) {
        this.userule = userule;
    }

    public void setFacility(String facility) {
        this.facility = facility;
    }

    public void setCheckinTime(Timestamp checkinTime) {
        this.checkinTime = checkinTime;
    }

    public void setCheckoutTime(Timestamp checkoutTime) {
        this.checkoutTime = checkoutTime;
    }

    public void setMinday(int minday) {
        this.minday = minday;
    }

    public void setMaxday(int maxday) {
        this.maxday = maxday;
    }

    public void setRefundday(int refundday) {
        this.refundday = refundday;
    }

    public void setPayrule(int payrule) {
        this.payrule = payrule;
    }

    public void setCreate_time(Timestamp create_time) {
        this.create_time = create_time;
    }

    public void setState(int state) {
        this.state = state;
    }

    public void setDel(int del) {
        this.del = del;
    }

    public int getId() {
        return id;
    }

    public int getUser_id() {
        return user_id;
    }

    public String getName() {
        return name;
    }

    public int getRenttype() {
        return renttype;
    }

    public String getAddress() {
        return address;
    }

    public Double getDayprice() {
        return dayprice;
    }

    public int getBill() {
        return bill;
    }

    public int getKind() {
        return kind;
    }

    public String getPicture1() {
        return picture1;
    }

    public String getShortcut1() {
        return shortcut1;
    }

    public String getPicture2() {
        return picture2;
    }

    public String getShortcut2() {
        return shortcut2;
    }

    public String getPicture3() {
        return picture3;
    }

    public String getShortcut3() {
        return shortcut3;
    }

    public int getGuestnum() {
        return guestnum;
    }

    public int getBednum() {
        return bednum;
    }

    public int getBedroomnum() {
        return bedroomnum;
    }

    public int getRoomnum() {
        return roomnum;
    }

    public int getBedtype() {
        return bedtype;
    }

    public int getToiletnum() {
        return toiletnum;
    }

    public String getRoomdesc() {
        return roomdesc;
    }

    public String getUserule() {
        return userule;
    }

    public String getFacility() {
        return facility;
    }

    public Timestamp getCheckinTime() {
        return checkinTime;
    }

    public Timestamp getCheckoutTime() {
        return checkoutTime;
    }

    public int getMinday() {
        return minday;
    }

    public int getMaxday() {
        return maxday;
    }

    public int getRefundday() {
        return refundday;
    }

    public int getPayrule() {
        return payrule;
    }

    public Timestamp getCreate_time() {
        return create_time;
    }

    public int getState() {
        return state;
    }

    public int getDel() {
        return del;
    }

    private String userule;
    private String facility;
    private Timestamp checkinTime;
    private Timestamp checkoutTime;
    private int minday;
    private int maxday;
    private int refundday;
    private int payrule;
    private Timestamp create_time;
    private int state;
    private int del;


}
