package com.example.mynam_000.androboum;

/**
 * Created by mynam_000 on 21/12/2017.
 */

public class Profil {
    private String email;
    boolean isConnected;
    private String uid;
    public Profil() {
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public boolean isConnected() {
        return isConnected;
    }
    public void setConnected(boolean connected) {
        isConnected = connected;
    }
    public String getUid() {
        return uid;
    }
    public void setUid(String uid) {
        this.uid = uid;
    }
}