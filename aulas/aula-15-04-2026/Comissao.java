import java.util.Scanner;

public class Comissao {

    public static Scanner entrada = new Scanner(System.in);

    public static double leridouble(String mensagem) {
        double valor_double;
        System.out.print(mensagem + ": "); 
        valor_double = entrada.nextDouble();
        return valor_double;
    }

    public static void main(String[] args) {
        double nota1, com;
        com = 0;
    
        nota1 = leridouble("Valor de venda! ");

        if(nota1 < 1000) 
            com = (nota1 * 0.05);
    
        else 
            if((nota1 >= 1001) && (nota1 <= 5000))
            com = (nota1 * 0.08);
        
        else 
            if ((nota1 > 5000))
            com = (nota1 * 0.12);

        System.out.println(com);    
        entrada.close();
    }
}