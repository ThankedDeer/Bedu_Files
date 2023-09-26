package e3;

import e1.Calculadora;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraDivideTest {
    static Calculadora calculadora;
    @BeforeAll
    static void setUp(){
        calculadora = new Calculadora();
    }
    @Test
    @DisplayName("caso divide")
    void divide() {
        assertEquals(4, calculadora.divide(8,2));
    }
}