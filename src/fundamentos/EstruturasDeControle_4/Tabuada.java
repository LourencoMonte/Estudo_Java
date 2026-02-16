package fundamentos.EstruturasDeControle_4;
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para receber a tabuada completa do mesmo.");
        int tab = sc.nextInt();
        System.out.println("\nTabuada do " + tab + ":\n");

       for(int i = 0; i <= 10; i++){
            System.out.println(tab + "x" + i + "=" + tab * i);
       }
       

       sc.close();
    }
}
