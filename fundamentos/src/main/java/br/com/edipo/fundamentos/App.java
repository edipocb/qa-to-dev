package br.com.edipo.fundamentos;

public class App {

    public static void main(String[] args) {
        System.out.println(saudacao("Edipo"));
        System.out.println(despedida("Edipo"));
        System.out.println(saudacao("Maria"));        
        System.out.println(despedida("Maria"));
    }  
      
    // Método separado para poder ser testado (sua primeira tarefa de QA no código!)
    public static String saudacao(String nome) {
        return "Olá, " + nome + "! Bem-vindo ao Java.";
    }

    public static String despedida(String nome) {
        return "Até logo, " + nome + "!";         
    }
}
