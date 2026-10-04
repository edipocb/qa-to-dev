package br.com.edipo.fundamentos.semana02;

import java.util.Scanner;

public class Dados {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = teclado.nextLine();

        System.out.print("Idade: ");
        int idade = teclado.nextInt();

        System.out.print("Salário: ");
        double salario = teclado.nextDouble();

        double salarioAnual = salario * 13;
        
        System.out.println("----Ficha----");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Salário Anual: " + salarioAnual);
        System.out.println("Idade em 10 anos: " + (idade + 10));

        teclado.close();    
}
}