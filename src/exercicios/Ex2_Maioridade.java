package Estudo_Java.src.exercicios;
import java.util.Scanner;

public class Ex2_Maioridade {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        if (idade >= 18){
            System.out.println("O usuário é maior de idade.");
        } else {
                System.out.println("O usuário é menor de idade.");
            }

        sc.close();
    }
    
}
