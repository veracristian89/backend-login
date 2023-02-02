/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.login.backendlogin.Controller;

import com.login.backendlogin.User;
import java.util.ArrayList;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author c_ver
 */
@RestController
public class LoginController {

    @GetMapping("/usuarios/traer")
    public List<User> getUsuarios() {
        List<User> ListaUsers = new ArrayList<>();
        ListaUsers.add(new User("cristian","vera","direccion"));
        ListaUsers.add(new User("roberto","garcia","direccion1"));
        ListaUsers.add(new User("mariano","martinez","direccion2"));
        return ListaUsers;
    }
    
    @PostMapping("/usuarios")
    @ResponseStatus(code = HttpStatus.OK, reason = "OK")
    public void addUsuario(@RequestBody User usr) {
        System.out.println("nombre: " + usr.getUsr_first_name() + " apellido: "
                + usr.getUsr_last_name() + " direccion: " + usr.getUsr_address());
    
    }
}
