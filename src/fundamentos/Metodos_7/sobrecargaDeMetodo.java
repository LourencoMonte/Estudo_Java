package fundamentos.Metodos_7;
import java.util.Scanner;

public class sobrecargaDeMetodo {
    Scanner sc = new Scanner(System.in);

    /*Métodos com sobrecarga*/

    /* Somar */
    public static int somar(int a, int b) {
        return a + b;
    }
    public static int somar(int a, int b, int c) {
        return a + b + c;
    }
    public static double somar(double a, double b){
        return a + b;
    }
    public static double somar(double a, double b, double c){
        return a + b + c;
    }

    /* Subtrair */
    public static int subtrair(int a, int b){
        return a - b;
    }
    public static int subtrair(int a, int b, int c){
        return a - b - c;
    }
    public static double subtrair(double a, double b){
        return a - b;
    }
    public static double subtrair(double a, double b, double c){
        return a - b - c;
    }
    public static void main(String[] args){
        System.out.println("Resultado: " + somar(10, 20));
        System.out.println("Resultado: " + somar(10.5, 20));
        System.out.println("Resultado: " + somar(10, 20, 30));
        
        System.out.println("Resultado:" + subtrair(10, 5));
        System.out.println("Resultado:" + subtrair(10, 5, 5));
        System.out.println("Resultado:" + subtrair(10, 5.5));


    }
    
}
