package fundamentos.EstruturasDeControle_4;
import java.util.Scanner;
import java.util.Arrays;

public class Continue {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        for(int i = 0; i < numeros.length;) {
            System.out.println("Digite um número par! ");
            int valor = sc.nextInt();

                if(valor % 2 != 0){
                    System.out.println("O número digitado é impar! Tente novamente.");
                    continue;
                }

            numeros[i] = valor;
            i++;    
            System.out.println("Array tual: " + Arrays.toString(numeros)); 
        }
        sc.close();
    }
    
}
