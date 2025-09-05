package estruturasDeDados.listas;
import java.util.ArrayList;

public class ListaEstatica {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>(); // Lista dinâmica, mas baseada em array
        lista.add(10);  // Adiciona elemento
        lista.add(20);
        lista.add(30);
        
        System.out.println(lista);  // [10, 20, 30]
    }
}
