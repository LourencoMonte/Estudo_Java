package Programa_Simples;

import java.util.Scanner;

public class SomaComDez {
    public static void main(String[] args) {
        // Criação do scanner para ler o número digitado pelo usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicita o número ao usuário
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        
        // Soma 10 ao número e exibe o resultado
        int resultado = numero + 10;
        System.out.println("O número mais 10 é: " + resultado);
        
        // Fecha o scanner
        scanner.close();
    }
}
