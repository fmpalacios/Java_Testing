package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("Calculator Test")
public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    /**
     * La anotación @Nested indica que esta es una clase de prueba interna que forma parte de una
     * estructura de prueba mayor.
     * 
     * El uso de @Nested proporciona varios beneficios: - Mejor organización de pruebas relacionadas
     * - Configuración compartida entre pruebas del mismo contexto - Informes de prueba más
     * descriptivos - Capacidad de crear diferentes configuraciones para distintos grupos de pruebas
     * 
     * Las pruebas verifican varias funcionalidades de la clase Calculator, incluyendo operaciones
     * de suma y resta con diferentes tipos de números (positivos, negativos, cero) y casos límite
     * con valores grandes.
     */
    @Nested
    @DisplayName("Add operations")
    class AddTest {
        @Test
        @DisplayName("Given a calculator, when adding two positive numbers, then the result is their arithmetic sum")
        public void testAddPositiveNumbers() {
            assertEquals(5, calculator.add(2, 3), "2 + 3 should equal 5");
        }

        @Test
        @DisplayName("Given a calculator, when adding a number with zero, then the result is the original number")
        public void testAddWithZero() {
            assertEquals(7, calculator.add(7, 0), "7 + 0 should equal 7");
            assertEquals(4, calculator.add(0, 4), "0 + 4 should equal 4");
        }

        @Test
        @DisplayName("Given a calculator, when adding with negative numbers, then the result follows arithmetic addition rules")
        public void testAddNegativeNumbers() {
            assertEquals(-5, calculator.add(-2, -3), "-2 + -3 should equal -5");
            assertEquals(1, calculator.add(-2, 3), "-2 + 3 should equal 1");
            assertEquals(-1, calculator.add(2, -3), "2 + -3 should equal -1");
        }
    }
}
