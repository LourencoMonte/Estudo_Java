package fundamentos.EstruturasDeControle_4;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            System.out.println("Neste código você vai digitar um número, e logo após outro número maior.");

            System.out.println("Digite o número piso");
            int numPiso = sc.nextInt();

            System.out.println("Agora digite o número teto");
            int numTeto = sc.nextInt();

            System.out.println("Digite (1) para receber os números Ímpares ou (2) para receber os números Pares.");
            int escolha = sc.nextInt();

            switch (escolha){
            case 1:
                for(int i = numTeto; i >= numPiso; i--){
                    if(i % 2 != 0){
                    System.out.println(i);
                }   }
                break;
            
            case 2:
                for(int i = numTeto; i >= numPiso; i--){
                    if(i % 2 == 0){
                    System.out.println(i);
                }   }
                break;

            default: 
            System.out.println("Opção selecionada inválida");
                
            } 
        sc.close();
    }
}