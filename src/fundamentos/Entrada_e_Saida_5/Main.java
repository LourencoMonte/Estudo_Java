package fundamentos.Entrada_e_Saida_5;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, informe seu nome");
        String name = scanner.nextLine();

        System.out.println("Informe sua idade");
        int age = scanner.nextInt();

        System.out.printf("Olá %s. Sua idade é %d.%n", name, age);

         scanner.close();
    }
}
