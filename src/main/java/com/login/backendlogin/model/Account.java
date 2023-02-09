/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.login.backendlogin.model;

/**
 *
 * @author c_ver
 */
public class Account {

    public Account(int acc_id, int acc_usr_id, String acc_username, String acc_password) {
        this.acc_id = acc_id;
        this.acc_usr_id = acc_usr_id;
        this.acc_username = acc_username;
        this.acc_password = acc_password;
    }

    public int getAcc_id() {
        return acc_id;
    }

    public void setAcc_id(int acc_id) {
        this.acc_id = acc_id;
    }

    public int getAcc_usr_id() {
        return acc_usr_id;
    }

    public void setAcc_usr_id(int acc_usr_id) {
        this.acc_usr_id = acc_usr_id;
    }

    public String getAcc_username() {
        return acc_username;
    }

    public void setAcc_username(String acc_username) {
        this.acc_username = acc_username;
    }

    public String getAcc_password() {
        return acc_password;
    }

    public void setAcc_password(String acc_password) {
        this.acc_password = acc_password;
    }
    int acc_id;
    int acc_usr_id;
    String acc_username;
    String acc_password;
}
