package fundamentos.EstruturasDeControle_4;
import java.util.Scanner;

public class ex4 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            System.out.print("Digite o número inicial: ");
            int initialNum = sc.nextInt();
            int newNum;

            do {
                System.out.print("Digite outro número. Este NÃO deve ser divisor do número inicial: ");
                newNum = sc.nextInt(); 

                if(newNum < initialNum){
                    System.out.println("Número ignorado: Menor que o inicial");
                } else if(newNum % initialNum == 0){
                    System.out.println("Continuando. Número divisível");
                  }
                
                
            } while (newNum < initialNum || newNum % initialNum == 0);

        sc.close();
    }
}
