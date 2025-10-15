package exercicios.ex1CaculaNumeros;
import java.util.Scanner;
import java.util.Locale;

public class Ex1_Calcula2Numeros {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Digite o primeiro número: ");
        double n1 = sc.nextDouble();
        
        System.out.print("Digite o segundo número: ");
        double n2 = sc.nextDouble();
        
        System.out.println("Soma: " + (n1 + n2));
        System.out.println("Subtração: " + (n1 - n2));
        System.out.println("Multiplicação: " + (n1 * n2));
        System.out.println("Divisão: " + (n1 / n2));

        sc.close();  
       
    }
 
}
