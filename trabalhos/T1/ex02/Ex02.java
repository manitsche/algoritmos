import java.util.Scanner;

public class Ex02 {

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

       int temp_em_celsius;
       double temp_em_far;

       temp_em_celsius = lerInteiro("celsius: ");

       temp_em_far = (temp_em_celsius * 9 / 5) + 32;

       System.out.println("fahrenheit: " + temp_em_far);
    }
}