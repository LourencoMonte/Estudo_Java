package fundamentos.Metodos_7;

public class Produto {
    String nome;
    double preco;

    // --- CORRIJA ESTE MÉTODO ---
    public void cadastrar(String nome, double preco) {
        this.nome = nome;   // Está errado!
        this.preco = preco; // Está errado!
    }

    public void exibir() {
        System.out.println("Produto: " + nome + " | R$ " + preco);
    }

    public static void main(String[] args) {
        Produto p = new Produto();
        p.cadastrar("Arroz", 25.90);
        p.exibir(); // Se estiver errado, vai imprimir: "Produto: null | R$ 0.0"
    }
}