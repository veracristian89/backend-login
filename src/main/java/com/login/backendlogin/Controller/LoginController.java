/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.login.backendlogin.Controller;

import com.login.backendlogin.dto.AccountDto;
import com.login.backendlogin.model.Account;
import com.login.backendlogin.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



/**
 *
 * @author c_ver
 */
@RestController
public class LoginController {
    
    @GetMapping("/usuario/{id}")
        @ResponseBody
        public AccountDto devolverCuenta(@PathVariable long id){
            User usuario = new User(10,"Cristian","Vera","Av Evergreen 555");
            Account cuenta = new Account(10,10,"veracristian89","clave123");
    
            AccountDto cuentaDto = new AccountDto();
    
            cuentaDto.setAcc_id(cuenta.getAcc_id());
            cuentaDto.setAcc_usr_id(cuenta.getAcc_usr_id());
            cuentaDto.setAcc_username(cuenta.getAcc_username());
            cuentaDto.setAcc_password(cuenta.getAcc_password());
            cuentaDto.setUsr_id(usuario.getUsr_id());
            cuentaDto.setUsr_first_name(usuario.getUsr_first_name());
            cuentaDto.setUsr_last_name(usuario.getUsr_last_name());
            cuentaDto.setUsr_address(usuario.getUsr_address());
            
            return cuentaDto;
        }
}
