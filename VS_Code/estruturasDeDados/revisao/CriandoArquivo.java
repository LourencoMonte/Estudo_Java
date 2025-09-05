package estruturasDeDados.revisao;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class CriandoArquivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nomeArquivo = "meuArquivo.txt";

        System.out.println("Digite: ");
        String conteudo = scanner.nextLine();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))){
            writer.write(conteudo);
            System.out.println("Arquivo criado e escrito com sucesso!");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao criar o arquivo.");
            e.printStackTrace();
        }
        scanner.close();
    }
}
