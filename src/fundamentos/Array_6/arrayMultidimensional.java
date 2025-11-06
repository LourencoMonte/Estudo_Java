package fundamentos.Array_6;
import java.util.Arrays;

public class arrayMultidimensional {
    public static void main(String[] args){
        int [][] matriz = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        System.out.println(matriz[2][0]);
        System.out.println(Arrays.deepToString(matriz));
        for (int[] linha : matriz) {
            for (int valor : linha) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
}
