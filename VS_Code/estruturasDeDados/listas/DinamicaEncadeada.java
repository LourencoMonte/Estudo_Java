package estruturasDeDados.listas;

class No {
    int valor;
    No proximo, anterior;

    No(int valor) {
        this.valor = valor;
        this.proximo = null;
        this.anterior = null;
    }
}

public class DinamicaEncadeada {
    No inicio, fim;

    public void adicionar(int valor) {
        No novo = new No(valor);
        if (inicio == null) {
            inicio = fim = novo;
        } else {
            fim.proximo = novo;
            novo.anterior = fim;
            fim = novo;
        }
    }

    public void imprimir() {
        No atual = inicio;
        while (atual != null) {
            System.out.print(atual.valor + " ↔ ");
            atual = atual.proximo;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DinamicaEncadeada lista = new DinamicaEncadeada();
        lista.adicionar(10);
        lista.adicionar(20);
        lista.adicionar(30);
        lista.imprimir();  // 10 ↔ 20 ↔ 30 ↔ null
    }
}
