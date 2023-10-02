package org.bedu.java.backend.s5;

import org.bedu.java.backend.s5.e1.models.Saludo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class S5Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(S5Application.class, args);
    }
    //@Autowired
    // Cambia el acceso de privado a publico para
    // asignar la instancia y luego regresa a publico a privado
    // lo que provoca una inicializacion lenta

    private Saludo saludo;

    /* @Autowired
    //  No cambia el nivel de acceso pero permitye modificar la instancia
    public void setSaludo(Saludo saludo){
        this.saludo = saludo;
    }
    */


    @Autowired
    //Es la manera recomnedada , ya que no cambia el nivel de acceso y
    // y no permite modificar la instancia
    public S5Application(/* @Autowired*/ Saludo saludo) {
        this.saludo = saludo;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(saludo.getNombre());
    }
    // -----------------------e1--------------------

}
