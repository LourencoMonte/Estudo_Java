package exercicios.FundamentosDaLinguagemDeProgramacao;

import java.util.Scanner;

public class Area {

   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o comprimento do lado do quadrado: ");
        float lado = sc.nextFloat();

        float area = lado * lado;

        System.out.printf("A área do quadrado é %f quadrados.%n", area);

        sc.close();
    }
    
}
