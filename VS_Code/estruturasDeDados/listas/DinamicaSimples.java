package estruturasDeDados.listas;

class No {
    int valor;
    No proximo;
    
    No(int valor) {
        this.valor = valor;
        this.proximo = null;
    }
}

public class DinamicaSimples {
    No inicio;

    public void adicionar(int valor) {
        No novo = new No(valor);
        if (inicio == null) {
            inicio = novo;
        } else {
            No atual = inicio;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novo;
        }
    }

    public void imprimir() {
        No atual = inicio;
        while (atual != null) {
            System.out.print(atual.valor + " -> ");
            atual = atual.proximo;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DinamicaSimples lista = new DinamicaSimples();
        lista.adicionar(10);
        lista.adicionar(20);
        lista.adicionar(30);
        lista.imprimir();  // 10 -> 20 -> 30 -> null
    }
}
