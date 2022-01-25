package com.example.Spring_Ejercicio4_5_6.Ejercicio1.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Nos permite trabajar con JSON
public class HelloController {

    @GetMapping("/saludo") // Indicamos la ruta a la que accede esta funcion.
    public String saludar(){
        return "Hola Rafael";
    }

}
