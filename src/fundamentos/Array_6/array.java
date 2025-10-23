package fundamentos.Array_6;
import java.util.Arrays;

public class array {
    public static void main(String[] args){
        int[] numeros =     new int[5];
        String[] nomes = new String[2];

        numeros[0] = 5;
        numeros[1] = 10;
        numeros[2] = 15;

        nomes[0] = "ana";
        nomes[1] = "sara";

        System.out.println(Arrays.toString(numeros));
        System.out.println(Arrays.toString(nomes));


    }
    
}
