package e3;

import e1.Calculadora;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraRestaTest {
    static Calculadora calculadora;
    @BeforeAll
    static void setUp(){
        calculadora = new Calculadora();
    }
    @Test
    @DisplayName("prueba resta")
    void resta() {
        assertEquals(4, calculadora.resta(8,4));

    }
}