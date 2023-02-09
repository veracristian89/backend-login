/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.login.backendlogin.Controller;

import com.login.backendlogin.dto.AccountDto;
import com.login.backendlogin.model.Account;
import com.login.backendlogin.model.User;
import org.springframework.web.bind.annotation.RestController;



/**
 *
 * @author c_ver
 */
@RestController
public class LoginController {
    
    User usuario = new User(1,"Cristian","Vera","Av Evergreen 555");
    Account cuenta = new Account(1,1,"null","null");
    
    AccountDto cuentaDto = new AccountDto();
    
    cuentaDto.setAcc_id(cuenta.getAcc_id());
    
}
