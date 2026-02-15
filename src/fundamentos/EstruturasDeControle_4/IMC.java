package fundamentos.EstruturasDeControle_4;
import java.util.Scanner;

public class IMC {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua altura em metros.");
        double heigh = sc.nextDouble();

        System.out.println("Digite sua massa corporal em kilogramas.");
        double weight = sc.nextDouble();

        double imc = weight/(heigh*heigh);

        System.out.println(imc);

       
       

       sc.close();
    }
}
