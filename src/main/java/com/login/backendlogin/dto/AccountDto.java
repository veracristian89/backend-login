/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.login.backendlogin.dto;

import java.io.Serializable;

/**
 *
 * @author c_ver
 */
public class AccountDto implements Serializable{


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

    public int getUsr_id() {
        return usr_id;
    }

    public void setUsr_id(int usr_id) {
        this.usr_id = usr_id;
    }

    public String getUsr_first_name() {
        return usr_first_name;
    }

    public void setUsr_first_name(String usr_first_name) {
        this.usr_first_name = usr_first_name;
    }

    public String getUsr_last_name() {
        return usr_last_name;
    }

    public void setUsr_last_name(String usr_last_name) {
        this.usr_last_name = usr_last_name;
    }

    public String getUsr_address() {
        return usr_address;
    }

    public void setUsr_address(String usr_address) {
        this.usr_address = usr_address;
    }
    int acc_id;
    int acc_usr_id;
    String acc_username;
    String acc_password;
    int usr_id;
    String usr_first_name;
    String usr_last_name;
    String usr_address;
}
