package br.com.edipo.fundamentos.semana02;

import java.util.Scanner;

public class Somatorio {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Gostaria de somar até qual número: ");
        int digitado = teclado.nextInt();
        if (digitado <= 0) {
            System.out.println("Digite um número positivo.");
        } else {
            int soma = 0;
            for (int i = 1; i <= digitado; i++) {
                soma = soma + i;
            }
            System.out.println("A soma de 1 a " + digitado + " é " + soma + ".");

            teclado.close();
        }

    }
}
