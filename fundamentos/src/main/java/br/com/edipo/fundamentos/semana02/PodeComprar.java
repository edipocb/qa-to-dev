package br.com.edipo.fundamentos.semana02;

import java.util.Scanner;

public class PodeComprar {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Saldo disponível do comprador: ");
        double saldo = teclado.nextDouble();

        System.out.print("Preço do produto: ");
        double preco = teclado.nextDouble();

        if (saldo >= preco) {

            System.out.println("Escolha a forma de pagamento");
            System.out.println("1 = Pix / 2 = Cartão / 3 = Boleto");
            System.out.print("Opção: ");

            int opcao = teclado.nextInt();
            double valorFinal = 0;
            boolean pagamentoValido = true;

            switch (opcao) {
                case 1 -> {
                    valorFinal = preco - (preco * 0.05);
                    System.out.println("Você escolheu Pix. Valor com desconto: R$ " + valorFinal);
                }

                case 2 -> {
                    valorFinal = preco;
                    System.out.println("Você escolheu Cartão");
                }

                case 3 -> {
                    valorFinal = preco;
                    System.out.println("Você escolheu Boleto");
                }

                default -> {
                    pagamentoValido = false;
                    System.out.println("Opção inválida. Compra cancelada.");
                }
            }
            if (pagamentoValido) {
                double saldoRestante = saldo - valorFinal;
                System.out.println("Compra aprovada! Saldo restante: R$ " + saldoRestante);
            }

        } else {
            double falta = preco - saldo;
            System.out.println("Saldo insuficiente, faltam R$ " + falta);
        }

        teclado.close();

    }

}
