package fundamentos.Metodos_7;

public class Robo {
    String nome;
    static String nomeDaFabrica = "SkyNet"; 

    public Robo(String nome) {this.nome = nome;}

    public void apresentacao() {
        System.out.println("Sou o " + nome + ", fabricado pela " + nomeDaFabrica);
    }

    public static void main(String[] args) {
        Robo R1 = new Robo("T-800");
        Robo R2 = new Robo("R2-D2");
        
        Robo.nomeDaFabrica = "Cyberdyne";
        
        R1.apresentacao();
        R2.apresentacao();
        // Pergunta mental: A fábrica mudou para os dois ou só para um?
    }
}