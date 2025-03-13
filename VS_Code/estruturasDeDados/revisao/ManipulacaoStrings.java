package estruturasDeDados.revisao;
import java.util.Scanner;

public class ManipulacaoStrings {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva uma frase");
        String texto = scanner.nextLine();

        System.out.println(texto.length() + " caracteres(incluindo espaços)");
        System.out.println(texto.toUpperCase());
        System.out.println(texto.contains("Java"));

        scanner.close();
    }
    
}
