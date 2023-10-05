package org.example.entidades;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
    @Test
    void suma() {
        Calculadora calculadora = new Calculadora();
        assertEquals(10, calculadora.suma(6,4));
    }
}