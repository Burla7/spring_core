package cn.qcode.entity;

import java.io.Serializable;

import static sun.security.internal.interfaces.TlsMasterSecret.serialVersionUID;

/**
 * Created by Administrator on 2017/6/16.
 */

    public class User implements Serializable {

    private static final long serialVersionUID = 225921914899485751L;
    private int uid;
    private String userName;
    private String password;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    @Override
    public String toString() {
        return "uId: "+this.uid + ", Name: " + this.userName + ",Pass: " + this.password;
    }
}  
