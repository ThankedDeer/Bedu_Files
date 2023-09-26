package e3;

import e1.Calculadora;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraMultiplicaTest {
    static Calculadora calculadora;
    @BeforeAll
    static void setUp(){
        calculadora = new Calculadora();
    }
    @Test
    @DisplayName("prueba multiplica")
    void multiplica() {
        assertEquals(4, calculadora.multiplica(2,2));
    }
}