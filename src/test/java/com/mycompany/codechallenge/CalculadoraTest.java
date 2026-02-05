package com.mycompany.codechallenge;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



import com.mycompany.codechallenge.Calculadora;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de prueba unitaria para validar la lógica de Calculadora.
 */
public class CalculadoraTest {

    private final Calculadora calculadora = new Calculadora();

    @Test
    @DisplayName("Suma simple de dos enteros")
    void testSumar() {
        int resultado = calculadora.sumar(5, 3);
        assertEquals(8, resultado, "5 + 3 debería ser 8");
    }

    @Test
    @DisplayName("División funcional")
    void testDividir() {
        // En aserciones de punto flotante, es buena práctica usar un delta (margen de error)
        assertEquals(2.0, calculadora.dividir(10, 5), 0.001);
    }

    @Test
    @DisplayName("Lanzar excepción al dividir por cero")
    void testDividirPorCero() {
        // Verificamos que el código lance la excepción esperada (AritmethicException)
        assertThrows(ArithmeticException.class, () -> {
            calculadora.dividir(10, 0);
        }, "Debería lanzar ArithmeticException al dividir por cero");
    }
}