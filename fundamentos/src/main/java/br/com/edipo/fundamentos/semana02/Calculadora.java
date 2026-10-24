package br.com.edipo.fundamentos.semana02;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("numero 1: ");
        double numero1 = teclado.nextDouble();

        System.out.print("numero 2: ");
        double numero2 = teclado.nextDouble();

        System.out.println("Resultados");
        double soma = numero1 + numero2;
        System.out.println("Resultado " + numero1 + " + " + numero2 + " = " + soma);
        double sub = numero1 - numero2;
        System.out.println("Resultado " + numero1 + " - " + numero2 + " = " + sub);
        double multi = numero1 * numero2;
        System.out.println("Resultado " + numero1 + " * " + numero2 + " = " + multi);

        double div = numero1 / numero2;
        if (numero2 == 0) {
            System.out.println("Resultado " + numero1 + " / " + numero2 + " = não é possível dividir por zero");
        } else {
            System.out.println("Resultado " + numero1 + " / " + numero2 + " = " + div);

        }

        double resto = numero1 % numero2;
        if (numero2 == 0) {
            System.out.println("Resultado " + numero1 + " % " + numero2 + " = não é possível dividir por zero");
        } else {
            System.out.println("Resultado " + numero1 + " % " + numero2 + " = " + resto);
        }
        teclado.close();

    }
}
