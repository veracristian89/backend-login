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
    int acc_id;
    int acc_usr_id;
    String acc_username;
    String acc_password;
    int usr_id;
    String usr_first_name;
    String usr_last_name;
    String usr_address;
}
