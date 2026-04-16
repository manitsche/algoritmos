import java.util.Scanner;

public class Notas {

    public static Scanner entrada = new Scanner(System.in);

    public static double leridouble(String mensagem) {
        double valor_double;
        System.out.print(mensagem + ": "); 
        valor_double = entrada.nextDouble();
        return valor_double;
    }

    public static void main(String[] args) {
        double nota1;
    
        nota1 = leridouble("digite a nota");
        if(nota1 >= 9) 
            System.out.println("A");
    
        else 
            if((nota1 <= 9)&& (nota1 >= 7))
            System.out.println("B");
        
        else 
            if ((nota1 < 7))
            System.out.println("C");        
        entrada.close();
    }
}