package estruturasDeDados.e1;

public class Questao {
    //Atributos
    private String enunciado; 
    private String[] alternativas; 
    private int indiceCorreto;
 
    //Construtor
    public Questao(String enunciado, String [] alternativas, int indiceCorreto){
        this.enunciado = enunciado;
        this.alternativas = alternativas;
        this.indiceCorreto = indiceCorreto;
    }

    //Getters e Setters
    public String getEnunciado(){
        return enunciado;
    }
    public void setEnunciado(String enunciado){
        this.enunciado = enunciado;
    }

    public String[] getAlternativas(){
        return alternativas;
    }
    public void setAlternativas(String[] alternativas){
        this.alternativas = alternativas;
    }

    public int getIndiceCorreto(){
        return indiceCorreto;
    }
    public void setIndiceCorreto(int indiceCorreto){
        this.indiceCorreto = indiceCorreto;
    }
}


//Construir a classe Prova
    candidato
    4 questõess
    4 respostas
    nota

//Método aplicar prova
    mostrar questão
        ler e guardar resposta

//Método corrigir prova
    nota = 0
    if correto + 2,5f
    exibir resultado

//Construir classe teste