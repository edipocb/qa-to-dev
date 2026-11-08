package br.com.edipo.fundamentos.semana02;

import java.util.Scanner;

public class Calculadora {

    public static double somar(double numero1, double numero2) {
        return numero1 + numero2;
    }

    public static double subtrair(double numero1, double numero2) {
        return numero1 - numero2;
    }

    public static double multiplicar(double numero1, double numero2) {
        return numero1 * numero2;
    }

    public static double dividir(double numero1, double numero2) {
        return numero1 / numero2;
    }

    public static boolean podeDividir(double divisor) {
        return divisor != 0;
    }

    public static double resto(double numero1, double numero2) {
        return numero1 % numero2;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("numero 1: ");
        double numero1 = teclado.nextDouble();

        System.out.print("numero 2: ");
        double numero2 = teclado.nextDouble();

        System.out.println("Resultado soma " + numero1 + " + " + numero2 + " = " + somar(numero1, numero2));

        System.out.println("Resultado subtração " + numero1 + " - " + numero2 + " = " + subtrair(numero1, numero2));

        System.out.println(
                "Resultado multiplicação " + numero1 + " * " + numero2 + " = " + multiplicar(numero1, numero2));

        if (podeDividir(numero2)) {
            System.out.println("Resultado divisão " + numero1 + " / " + numero2 + " = " + dividir(numero1, numero2));
            System.out.println("Resultado resto10 " + numero1 + " % " + numero2 + " = " + resto(numero1, numero2));
        } else {
            System.out.println("Não é possível calcular por zero.");
        }

        teclado.close();
    }

}
