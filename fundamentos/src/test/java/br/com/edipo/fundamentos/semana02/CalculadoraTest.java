package br.com.edipo.fundamentos.semana02;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    private static final double DELTA = 0.0001;

    @Test
    void deveSomarDoisNumerosDiferentes() {
        // Arrange
        double numero1 = 10.0;
        double numero2 = 3.0;
        // Act
        double resultado = Calculadora.somar(numero1, numero2);
        // Assert
        assertEquals(13.0, resultado, DELTA);
    }

    @Test
    void deveSubtrairDoisNumeros() {
        double numero1 = 10.0;
        double numero2 = 3.0;

        double resultado = Calculadora.subtrair(numero1, numero2);

        assertEquals(7.0, resultado, DELTA);
    }

    @Test
    void deveMultiplicarDoisNumeros() {
        double numero1 = 10.0;
        double numero2 = 3.0;

        double resultado = Calculadora.multiplicar(numero1, numero2);

        assertEquals(30.0, resultado, DELTA);
    }

    @Test
    void deveDividirComResultadoDecimal() {
        double numero1 = 10.0;
        double numero2 = 3.0;

        double resultado = Calculadora.dividir(numero1, numero2);

        assertEquals(3.33333, resultado, DELTA);
    }

    @Test
    void deveCalcularRestoDaDivisao() {
        double numero1 = 10.0;
        double numero2 = 3.0;

        double resultado = Calculadora.resto(numero1, numero2);

        assertEquals(1.0, resultado, DELTA);
    }

    @Test
    void deveManterSinalDoDividendoNoResto() {
        double numero1 = -7.0;
        double numero2 = 3.0;

        double resultado = Calculadora.resto(numero1, numero2);

        assertEquals(-1.0, resultado, DELTA);
    }

    @Test
    void naoDevePermitirDividirPorZero() {
        double divisor = 0.0;

        assertFalse(Calculadora.podeDividir(divisor));
    }

    @Test
    void devePermitirDividirPorPositivo() {
        double divisor = 5.0;

        assertTrue(Calculadora.podeDividir(divisor));
    }

    @Test
    void devePermitirDividirPorNegativo() {
        double divisor = -4.0;

        assertTrue(Calculadora.podeDividir(divisor));
    }

    @Test
    void devePermitirDividirPorDecimalPequeno() {
        double divisor = 0.5;

        assertTrue(Calculadora.podeDividir(divisor));
    }
}
