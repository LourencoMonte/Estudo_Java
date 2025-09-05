package estruturasDeDados.revisao;

public class TryCatch {
    public static void main(String[] args){
        try{
            int resultado = 10 / 0;
        }catch(ArithmeticException e){
            System.out.println("Erro: divisão por zero não é permitida");
        }
    }
    
}
