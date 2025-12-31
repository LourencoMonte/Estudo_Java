package exercicios.FundamentosDaLinguagemDeProgramacao;
import java.util.Scanner;

public class DiferencaIdade {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a idade do pai: ");
        int age1 = sc.nextInt();

        System.out.println("Digite a idade do filho: ");
        int age2 = sc.nextInt();

        int diferenca = age1 - age2;

        System.out.printf("A diferença entre as idades é %d anos.%n", diferenca);

        sc.close();
    }
}
