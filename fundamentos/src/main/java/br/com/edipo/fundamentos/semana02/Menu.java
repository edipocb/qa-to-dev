package br.com.edipo.fundamentos.semana02;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("====Menu====");
            System.out.println("1 - Dizer Olá");
            System.out.println("2 - Tabuada do 5");
            System.out.println("0 - Sair");

            System.out.print("Escolha uma das opções: ");

            opcao = teclado.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.println("Olá");
                }
                case 2 -> {
                    for (int i = 1; i <= 10; i++) {
                        System.out.println("5 x " + i + " = " + (5 * i));
                    }
                }
                case 0 -> {
                    System.out.println("Até logo!");
                }
                default -> {
                    System.out.println("Opção inválida!");
                }
            }
        }
        teclado.close();

    }

}
