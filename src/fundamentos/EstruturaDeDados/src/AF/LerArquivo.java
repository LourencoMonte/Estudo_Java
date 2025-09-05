package AF;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LerArquivo {
    public static void main (String[] args) {
        String nomeArquivo = "teste.txt";

        try (Scanner scanner = new Scanner(new File(nomeArquivo))){
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        }
    }
    
}
