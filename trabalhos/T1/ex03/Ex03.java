import java.util.Scanner;

public class Ex03 {

    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String mensagem) {
        int valor_inteiro;

        System.out.print(mensagem);
        valor_inteiro = entrada.nextInt();

        return valor_inteiro;
    }

    public static double lerReal(String mensagem) {

        double valor_real;

        System.out.print(mensagem); // Entrada em uma unica linha
        valor_real = entrada.nextDouble();

        return valor_real;
    }

    public static void main(String[] args) {
        
        int distancia, combustivel;
        double consumo;   
    
        distancia = lerInteiro("distancia: ");
        combustivel = lerInteiro("combustivel: ");

        consumo = (distancia / combustivel);

        System.out.println("consumo: " + consumo);
    }
}