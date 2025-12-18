package fundamentos.Metodos_7;
import java.util.ArrayList;

public class Boletim {
    ArrayList <Double> notas = new ArrayList<>();

    public double calcularMedia(double n1, double n2){
        return (n1 + n2) / 2;
    }
    public double calcularMedia(double... notas) {
        double soma = 0;

        for(double n: notas){
            soma += n;
        }
        return soma / notas.length;
    }
   

    public static void main(String[] args) {
        Boletim b = new Boletim();
        
        System.out.println(b.calcularMedia(8, 6));
        // Teste 1: Duas notas
        // System.out.println(b.calcularMedia(8.0, 6.0));
        System.out.println(b.calcularMedia(10, 5, 7.5, 8));
        // Teste 2: Várias notas
        // System.out.println(b.calcularMedia(10.0, 5.0, 7.5, 8.0));
    }
}
