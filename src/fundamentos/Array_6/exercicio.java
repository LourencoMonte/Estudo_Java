package fundamentos.Array_6;
import java.util.Arrays;
import java.util.Scanner;

public class exercicio {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        int maiorValor = Integer.MIN_VALUE;
        int menorValor = Integer.MAX_VALUE;;
        double somatorio = 0;
        
        /*Cria array com 5 elementos digitados pelo usuário */
        for(int i = 0; i < numeros.length; i++) {
        System.out.println("Digite o número " + (i + 1) + " de 5: ");
            numeros[i] = sc.nextInt();

            /*Define maior valor */
            if (numeros[i] > maiorValor) {
                maiorValor = numeros[i];
            }

              /*Define menor valor */
            if (numeros[i] < menorValor) {
                menorValor = numeros[i];
            }

            somatorio = somatorio + numeros[i];
        }

        double media = somatorio / numeros.length;



        System.out.println(Arrays.toString(numeros));
        System.out.println("Maior valor: " + maiorValor);
        System.out.println("Menor valor: " + menorValor);
        System.out.println("Média: " + media);

        sc.close();
    }
}