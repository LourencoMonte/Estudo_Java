package estruturasDeDados.e1;

public class Aluno {
    //Atributos
    private String nome;
    private int matricula;

    //Construtor
    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }


    //Métodos Getters e Setters
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getMatricula(){
        return matricula;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    
}

