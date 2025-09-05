package estruturasDeDados.listas;

class DinamicaCircular {
    No inicio;

    public void adicionar(int valor) {
        No novo = new No(valor);
        if (inicio == null) {
            inicio = novo;
            inicio.proximo = inicio; // Aponta para si mesmo
        } else {
            No atual = inicio;
            while (atual.proximo != inicio) {
                atual = atual.proximo;
            }
            atual.proximo = novo;
            novo.proximo = inicio;
        }
    }

    public void imprimir() {
        if (inicio == null) return;
        No atual = inicio;
        do {
            System.out.print(atual.valor + " → ");
            atual = atual.proximo;
        } while (atual != inicio);
        System.out.println("(volta ao início)");
    }

    public static void main(String[] args) {
        DinamicaCircular lista = new DinamicaCircular();
        lista.adicionar(10);
        lista.adicionar(20);
        lista.adicionar(30);
        lista.imprimir();  // 10 → 20 → 30 → (volta ao início)
    }
}
