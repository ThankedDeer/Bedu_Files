package org.bedu.java.backend.s4.controllers;

import org.bedu.java.backend.s4.models.Saludo;
import org.springframework.web.bind.annotation.*;

@RestController
public class SaludoController {

    /*
    otras formas de obtener datos
    @PathVariable String nombre
    esto se usa cunado los parametros viene de la url
    /saludo/Eduardo
    */

    @GetMapping("/saludo/{nombre}")
    public Saludo saluda(@PathVariable String nombre){
        Saludo saludo = new Saludo();
        saludo.setMensaje("Hola!!! ");
        saludo.setNombre(nombre);

        return saludo;
    }
    @PostMapping("/saludo")
    public Saludo saluda(@RequestBody Saludo saludo){
        return saludo;
    }



}
