package com.lichking.model;

import java.security.Timestamp;

/**
 * Created by flash on 15/9/19.
 */
public class DealOrder {
    private int id;
    private int user_id;
    private int house_id;
    private String ordernum;
    private Timestamp checkindate;
    private Timestamp checkoutdate;
    private int state;
    private int unitprice;
    private Timestamp orderdate;
    private int commentstate;
    private int total;

    public void setId(int id) {
        this.id = id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public void setHouse_id(int house_id) {
        this.house_id = house_id;
    }

    public void setOrdernum(String ordernum) {
        this.ordernum = ordernum;
    }

    public void setCheckindate(Timestamp checkindate) {
        this.checkindate = checkindate;
    }

    public void setCheckoutdate(Timestamp checkoutdate) {
        this.checkoutdate = checkoutdate;
    }

    public void setState(int state) {
        this.state = state;
    }

    public void setUnitprice(int unitprice) {
        this.unitprice = unitprice;
    }

    public void setOrderdate(Timestamp orderdate) {
        this.orderdate = orderdate;
    }

    public void setCommentstate(int commentstate) {
        this.commentstate = commentstate;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public int getUser_id() {
        return user_id;
    }

    public int getHouse_id() {
        return house_id;
    }

    public String getOrdernum() {
        return ordernum;
    }

    public Timestamp getCheckindate() {
        return checkindate;
    }

    public Timestamp getCheckoutdate() {
        return checkoutdate;
    }

    public int getState() {
        return state;
    }

    public int getUnitprice() {
        return unitprice;
    }

    public Timestamp getOrderdate() {
        return orderdate;
    }

    public int getCommentstate() {
        return commentstate;
    }

    public int getTotal() {
        return total;
    }
}
