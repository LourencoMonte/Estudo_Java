package fundamentos.Metodos_7;

/* Métodos com retorno e parâmetro */
public class exercitando{

    /*Métodos*/
    public static int somar(int a, int b){
        return a + b;
    }

     public static int subtrair(int a, int b){
        return a - b;
    }

     public static int multiplicar(int a, int b){
        return a * b;
    }

     public static int dividir(int a, int b){
        return a / b;
    }

    /*Método main*/
    public static void main(String[] args){
        System.out.println(somar(10, 20));
    }
}
