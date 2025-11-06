package fundamentos.Array_6;

public class percorrerArray {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("Método tradicional: " );

        for(int i = 0; i < numeros.length; i++){
            System.out.println("Posição " + i + ": " + numeros[i]);
        }

        /*------------------------#-------------------------------*/

        System.out.println("For each: " );

        for (int n : numeros) {
            System.out.println("Valor " + n);
        }

    }
}