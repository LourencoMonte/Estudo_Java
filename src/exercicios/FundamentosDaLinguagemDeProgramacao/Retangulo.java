package exercicios.FundamentosDaLinguagemDeProgramacao;

import java.util.Scanner;

public class Retangulo {

   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o comprimento da base do retangulo: ");
        float base = sc.nextFloat();

        System.out.println("Digite o comprimento da altura do retangulo: ");
        float altura = sc.nextFloat();

        float area = base* altura;

        System.out.printf("A área do quadrado é %f quadrados.%n", area);

        sc.close();
    }
    
}