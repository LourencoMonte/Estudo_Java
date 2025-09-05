package Estudo_Java;
import java.util.Scanner;

public class Ex3_Tabuada {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        System.out.println("-------------------------------");
        System.out.println("Tabuada de Adição do número: " + num);
        System.out.println("-------------------------------");
        for (int i = 1; i <= 10; i += 1) {
            System.out.println(num + " + " + i + " = " + (num + i)); 
        }
        
        System.out.println("----------------------------------");
        System.out.println("Tabuada de Subtração do número: " + num);
        System.out.println("----------------------------------");
        for (int i = num + 1; i <= num + 10; i += 1) {
            System.out.println(i + " - " + num + " = " + (i - num)); 
        }

        System.out.println("--------------------------------------");
        System.out.println("Tabuada de Multiplicação do número: " + num);
        System.out.println("--------------------------------------");
        for (int i = 1; i <= 10; i += 1) {
            System.out.println(num + " x " + i + " = " + (num * i)); 
        }

        System.out.println("--------------------------------");
        System.out.println("Tabuada de Divisão do número: " + num);
        System.out.println("--------------------------------");
        for (int i = 1; i <= 10; i += 1) {
            int x = num * i;
            System.out.println(x + " / " + num + " = " + i);
        }

       

        sc.close();
    }
}  
