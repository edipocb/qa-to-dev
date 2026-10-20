package br.com.edipo.fundamentos.semana02;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("numero 1: ");
        double numero1 = teclado.nextDouble();

        System.out.print("numero 2: ");
        double numero2 = teclado.nextDouble();

        double soma = numero1 + numero2;
        double sub = numero1 - numero2;
        double multi = numero1 * numero2;
        double div = numero1 / numero2;
        double resto = numero1 % numero2;

        System.out.println("Resultados");
        System.out.println("Resultado " + numero1 + " + " + numero2 + " = " + soma);
        System.out.println("Resultado " + numero1 + " - " + numero2 + " = " + sub);
        System.out.println("Resultado " + numero1 + " * " + numero2 + " = " + multi);
        System.out.println("Resultado " + numero1 + " / " + numero2 + " = " + div);
        System.out.println("Resultado " + numero1 + " % " + numero2 + " = " + resto);

        teclado.close();

    }
}
