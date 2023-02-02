/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.login.backendlogin.Controller;

import com.login.backendlogin.Users;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    
    @PostMapping("/usuarios")
    public void addUsuario(@RequestBody Users usr) {
        System.out.println("nombre: " + usr.getUsr_first_name() + " apellido: "
                + usr.getUsr_last_name() + " direccion: " + usr.getUsr_address());

    }
}
