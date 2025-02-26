import java.util.Scanner;
import java.util.ArrayList;

abstract class Pessoa{
long cpf;
String nomePessoa;
int idade;

//Classe Pessoa
public Pessoa(){
    //Construtor Pessoa Padrão
    this.cpf = 0L;
    this.nomePessoa = "";
    this.idade = 0;
    }
    //Construtor Pessoa (Parâmetro) 
    public Pessoa(long cpf, String nome, int idade){
    this.cpf = cpf;
    this.nomePessoa = nome;
    this.idade = idade;
    }

    public String getNomePessoa(){
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa){
        this.nomePessoa = nomePessoa;
    }

    //Método inserirCPF
    public void inserirCPF(Scanner scanner){
    System.out.println("Digite o CPF");
    cpf = scanner.nextLong();
    scanner.nextLine();
    }
    //Método inserirNome
    public void inserirNome(Scanner scanner){
    System.out.println("Digite o nome: ");
    nomePessoa = scanner.nextLine();
    }
    //Método inserirIdade
    public void inserirIdade(Scanner scanner){
    System.out.println("Digite a idade");
    idade = scanner.nextInt();
    scanner.nextLine();
    }
    //Método mostrarDados
    public void mostrarDados(){
        System.out.println("CPF: " + cpf);
        System.out.println("Nome: " + nomePessoa);
        System.out.println("Idade: " + idade);
        System.out.println();
    }
    //Método fazerAniversario
    public void fazerAniversario(){
    idade = idade + 1;
    }
}

//Classe Visitante(Herda de Pessoa)
class Visitante extends Pessoa{
    //Construtor Visitante Padrão
    public Visitante(){
        this.cpf = 0L;
        this.nomePessoa = "";
        this.idade = 0;
    }
    //Construtor Visitante (Parâmetro)
    public Visitante(long cpf, String nomePessoa, int idade){
        this.cpf = cpf;
        this.nomePessoa = nomePessoa;
        this.idade = idade;
    }
    //Método mostrarDados
    @Override
    public void mostrarDados(){
        System.out.println("CPF: " + cpf);
        System.out.println("Nome: " + nomePessoa);
        System.out.println("Idade: " + idade);
    }
    //Método Visitar
    public void visitar(){
        System.out.println("Visitando");
        System.out.println();
    }

}

//Classe Aluno(Herda de Pessoa)
class Aluno extends Pessoa{
    int matricula;
    //Construtor Aluno Padrão
    public Aluno(){
        this.matricula = 0;
    }
    //Construtor Aluno(Parâmetro)
    public Aluno(int matricula){
        this.matricula = matricula;
    }
    //Método inserirMatrícula
    public void inserirMatricula(Scanner scanner){
        System.out.println("Inserir matrícula: ");
        matricula = scanner.nextInt();
        scanner.nextLine();
        System.out.println();
    }
    //Método mostrarDados
    @Override
    public void mostrarDados(){
        System.out.println("CPF: " + cpf);
        System.out.println("Nome: " + nomePessoa);
        System.out.println("Idade: " + idade);
        System.out.println("Matrícula: " + matricula);
    }
    //Método pagarMensalidade
    public void pagarMensalidade(){
        System.out.println("Mensalidade paga");
        System.out.println();
    }
}
    //Classe Bolsista(Herda de Aluno)
    class Bolsista extends Aluno{
        //Construtor Bolsista Padrão
        public Bolsista(){
            this.cpf = 0;
            this.nomePessoa = "";
            this.idade = 0;
            this.matricula = 0;
        }
        //Construtor Bolsista(Parâmetro)
        public Bolsista(long cpf, String nomePessoa, int idade, int matricula){
            this.cpf = cpf;
            this.nomePessoa = nomePessoa;
            this.idade = idade;
            this.matricula = matricula;
        }
        //Método pagarMensalidade
        @Override
        public void pagarMensalidade(){
            System.out.println("Mensalidade gratuita");
            System.out.println();
        }
    }
    //Classe Regular(Herda de Aluno)
    class Regular extends Aluno{
        //Método pagarMensalidade
        @Override
        public void pagarMensalidade(){
            System.out.println("Mensalidade integralmente paga");
            System.out.println();
        }

    }

//Classe Professor(Herda de Pessoa)
class Professor extends Pessoa{
    String centro;
    //Construtor Professor Padrão
    public Professor(){
        this.cpf = 0L;
        this.nomePessoa = "";
        this.idade = 0;
        this.centro = "";
    }
    //Construtor Professor(Parâmetro)
    public Professor(long cpf, String nomePessoa, int idade, String centro){
        this.cpf = cpf;
        this.nomePessoa = nomePessoa;
        this.idade = idade;
        this.centro = centro; 
    }
    //Método mostrarDados
    @Override
    public void mostrarDados(){
        System.out.println("CPF: " + cpf);
        System.out.println("Nome: " + nomePessoa);
        System.out.println("Idade: " + idade);
    }
    //Método darAula
    public void darAula(){
        System.out.println("Dando aula");
        System.out.println();
    }
}

//Classe Disciplina
class Disciplina{
    int codigo;
    String nomeDisciplina;
    int semestre;
    //Construtor Disciplina Padrão
    Disciplina(){
        this.codigo = 0;
        this.nomeDisciplina = "";
        this.semestre = 0;
    }
    //Construtor Disciplina(Parâmetro)
    Disciplina(int codigo, String nome, int semestre){
        this.codigo = codigo;
        this.nomeDisciplina = nome;
        this.semestre = semestre;
    }

    //Método mostrarDados
    public void mostrarDados(){
        System.out.println("Codigo da disciplina: " + codigo);
        System.out.println("Nome da disciplina: " + nomeDisciplina);
        System.out.println("Semestre: " + semestre);
        System.out.println();
    }

}

//Classe Turma
class Turma{
    String codigo;
    String disciplina;
    String professor;
    ArrayList<Aluno> alunos;
    //Construtor Turma Padrão
    public Turma(){
        this.codigo = "";
        this.disciplina = "";
        this.professor = "";
        this.alunos = new ArrayList<>();
    }
    //Construtor Turma(Parâmetro)
    public Turma(String codigo, String disciplina, String professor, ArrayList<Aluno> alunos){
        this.codigo = codigo;
        this.disciplina = disciplina;
        this.professor = professor;
        this.alunos = alunos;
    }   

    public void mostrarDados(){
        System.out.println("Código: " + codigo);
        System.out.println("Disciplina: " + disciplina);
        System.out.println("Professor: " + professor);
    }

    public void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
    }

    public void removerAluno(Aluno aluno){
        alunos.remove(aluno);
    }
    int indice;
    public void listarAlunos(){
        
        System.out.println("Lista de alunos: ");
            for(indice = 0; indice < alunos.size(); indice++){
                System.out.println(alunos.get(indice).getNomePessoa());
            }
        System.out.println();
    }
}

//-------------------------------------------------Classe Main---------------------------------------------------------------
public class Main{
    public static void main (String[] args){
Scanner scanner = new Scanner(System.in);
//Objetos Disciplina
Disciplina disciplina1 = new Disciplina(10, "Raciocínio Lógico", 2);
Disciplina disciplina2 = new Disciplina(20, "Programação Orientado a Objetos", 2 );
Disciplina disciplina3 = new Disciplina(30, "Matemática", 2);

//Objetos Alunos
Regular alunoRegular1 = new Regular();
Regular alunoRegular2 = new Regular();
Bolsista alunoBolsista = new Bolsista();

//Objeto Professor
Professor professor = new Professor(1234567890L, "Paulo", 40, "de informática" );

//Objetos Visitantes
Visitante visitante1 = new Visitante(2345678901L, "Endrik", 23 );
Visitante visitante2 = new Visitante(3456789012L, "Roberto Carlos", 300);

//Objetos Turma
Turma turma1 = new Turma("A", "Raciocínio Lógico", "Paulo", new ArrayList<> ());
turma1.adicionarAluno(alunoRegular1);
turma1.adicionarAluno(alunoRegular2);
turma1.adicionarAluno(alunoBolsista);

Turma turma2 = new Turma("B", "Programação Orientado a Objetos", "Paulo", new ArrayList<>());
turma2.adicionarAluno(alunoRegular1);
turma2.adicionarAluno(alunoRegular2);
turma2.adicionarAluno(alunoBolsista);

Turma turma3 = new Turma("C", "Matemática", "Paulo", new ArrayList<>());
turma3.adicionarAluno(alunoRegular1);
turma3.adicionarAluno(alunoRegular2);
turma3.adicionarAluno(alunoBolsista);
    
    //Inserir dados
//Aluno 1
System.out.println("Inserir dados de Aluno 1");
alunoRegular1.inserirCPF(scanner);
alunoRegular1.inserirIdade(scanner);
alunoRegular1.inserirNome(scanner);
alunoRegular1.inserirMatricula(scanner);

//Aluno 2
System.out.println("Inserir dados de Aluno 2");
alunoRegular2.inserirCPF(scanner);
alunoRegular2.inserirIdade(scanner);
alunoRegular2.inserirNome(scanner);
alunoRegular2.inserirMatricula(scanner);

//Aluno 3
System.out.println("Inserir dados de Aluno 3");
alunoBolsista.inserirCPF(scanner);
alunoBolsista.inserirIdade(scanner);
alunoBolsista.inserirNome(scanner);
alunoBolsista.inserirMatricula(scanner);

    //Exibir dados
System.out.println("Dados gerais:");
System.out.println();

//Disciplinas
System.out.println("Disciplina 1");
disciplina1.mostrarDados();

System.out.println("Disciplina 2");
disciplina2.mostrarDados();

System.out.println("Disciplina 3");
disciplina3.mostrarDados();

//Alunos
System.out.println("Aluno 1");
alunoRegular1.mostrarDados();
alunoRegular1.pagarMensalidade();

System.out.println("Aluno 2");
alunoRegular2.mostrarDados();
alunoRegular2.pagarMensalidade();

System.out.println("Aluno 3");
alunoBolsista.mostrarDados();
alunoBolsista.pagarMensalidade();

//Professor
System.out.println("Professor");
professor.mostrarDados();
professor.darAula();

//Visitante
System.out.println("Visitante 1");
visitante1.mostrarDados();
visitante1.visitar();

System.out.println("Visitante 2");
visitante2.mostrarDados();
visitante2.visitar();

//Turmas
System.out.println("Turma 1");
turma1.mostrarDados();
turma1.listarAlunos();

System.out.println("Turma 2");
turma2.mostrarDados();
turma2.listarAlunos();

System.out.println("Turma 3");
turma3.mostrarDados();
turma3.listarAlunos();

scanner.close();

    }
}
