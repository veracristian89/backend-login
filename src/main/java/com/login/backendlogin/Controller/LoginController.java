/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.login.backendlogin.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author c_ver
 */
@RestController
public class LoginController {

    @GetMapping("/usuarios")
    public String getUsuarios() {
        return "Todos los Usuarios";
    }
}
