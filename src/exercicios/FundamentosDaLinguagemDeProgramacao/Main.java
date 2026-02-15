package exercicios.FundamentosDaLinguagemDeProgramacao;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String name = scanner.nextLine();

        System.out.print("Digite seu ano de nascimento: ");
        var birtYear = scanner.nextInt();

        LocalDate dataNascimento = LocalDate.of(birtYear, 1, 1);
        LocalDate hoje = LocalDate.now();

        int age = Period.between(dataNascimento, hoje).getYears();

        System.out.printf("Olá %s. Você tem %d anos.%n", name, age);

        scanner.close();
    }
    
}
