package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculadoraTest {

    private final Calculadora calculadora = new Calculadora();

    @Test
    @DisplayName("Debe sumar dos numeros correctamente")
    void deberiaSumar(){
        int resultado = calculadora.sumar(2, 3);
        assertEquals(5, resultado);
    }

    @Test
    @DisplayName("Debe restar dos numeros correctamente")
    void deberiaRestar(){
        int resultado = calculadora.restar(5, 3);
        assertEquals(2, resultado);
    }

    @Test
    @DisplayName("Debe multiplicar dos numeros correctamente")
    void deberiaMultiplicar(){
        int resultado = calculadora.multiplicar(5, 3);
        assertEquals(15, resultado);
    }

    @Test
    @DisplayName("Debe dividir dos numeros correctamente")
    void deberiaDividir(){
        int resultado = calculadora.dividir(6, 3);
        assertEquals(2, resultado);
    }

    @Test
    void deberiaLanzarExcepcionSiDividePorCero() {
        Calculadora calculadora = new Calculadora();

        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> calculadora.dividir(10, 0)
        );

        assertEquals("No se puede dividir por cero", exception.getMessage());
    }

    @Test
    void deberiaSumarNumerosNegativos() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.sumar(-2, -3);
        assertEquals(-5, resultado);
    }

    @Test
    void deberiaMultiplicarPorCero() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.multiplicar(8, 0);
        assertEquals(0, resultado);
    }
}
