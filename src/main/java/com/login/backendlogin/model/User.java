/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.login.backendlogin.model;

/**
 *
 * @author c_ver
 */
public class User {

    public User(int usr_id, String usr_first_name, String usr_last_name, String usr_address) {
        this.usr_id = usr_id;
        this.usr_first_name = usr_first_name;
        this.usr_last_name = usr_last_name;
        this.usr_address = usr_address;
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
    int usr_id;
    String usr_first_name;
    String usr_last_name;
    String usr_address;
}
