package fundamentos.Array_6;
import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número da operação: ");
        float number1 = sc.nextFloat();
        sc.nextLine();

        System.out.println("Digite a operação (+, -, *, /)");
        String operation = sc.nextLine();

        System.out.println("Digite o segundo número da operação: ");
        float number2 = sc.nextFloat();
        sc.nextLine();
        
        switch (operation) {
            case "+":
            System.out.println("A soma é: " + (number1 + number2));
            break;

            case "-":
            System.out.println("A subtração é: " + (number1 - number2));

            case "*":
            System.out.println("A multiplicação é: " + (number1 * number2));

            case "/":
            System.out.println("A divisão é: " + (number1 / number2));

            default:
            System.out.println("Operação inválida");

        }
        sc.close();
    }
}
