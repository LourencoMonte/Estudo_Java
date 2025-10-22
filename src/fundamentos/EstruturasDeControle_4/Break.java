package fundamentos.EstruturasDeControle_4;
import java.util.Scanner;

public class Break {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numeroSecreto = 7;

    while(true) {
        System.out.println("Digite o número secreto para sair do loop");
        int num = sc.nextInt();

        if (num == numeroSecreto){
            System.out.println("Vocẽ acertou o número!");
            break;
        }

        System.out.println("Errado! Tente novamente.\n");

        }
        sc.close(); 
    }
}

