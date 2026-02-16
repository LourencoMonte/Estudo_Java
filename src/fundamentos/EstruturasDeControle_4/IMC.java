package fundamentos.EstruturasDeControle_4;
import java.util.Scanner;

public class IMC {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua altura em metros.");
        String alturaStr = sc.next().replace(",", ".");
        double heigh = Double.parseDouble(alturaStr);

        System.out.println("Digite sua massa corporal em kilogramas.");
        String pesoStr = sc.next().replace(",", ".");
        double weight = Double.parseDouble(pesoStr);

        double imc = weight/(heigh*heigh);

        if (imc < 18.5){
            System.out.printf("Seu IMC é %.1f. Você está abaixo do peso.%n", imc);
        } else if(imc < 25){
            System.out.printf("Seu IMC é %.1f. Você está com o peso ideal.%n", imc);
        } else if(imc < 30){
            System.out.printf("Seu IMC é %.1f. Você está levemente acima do peso.%n", imc);
        } else if(imc < 35){
            System.out.printf("Seu IMC é %.1f. Você está com obesidade grau I.%n", imc);
        } else if(imc < 40){
            System.out.printf("Seu IMC é %.1f. Você está com obesidade grau II(Severa).%n", imc);
        } else if(imc >= 40){
            System.out.printf("Seu IMC é %.1f. Você está com obesidade grau III(Mórbida).%n", imc);
        }
       sc.close();
    }
}
