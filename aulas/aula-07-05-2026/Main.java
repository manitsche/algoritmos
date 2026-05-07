import java.util.Scanner;

public class Main {

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

    public static int lerInteiroNaoNegativo(String mensagem) {
        int valor_inteiro;

        System.out.print(mensagem);
        valor_inteiro = entrada.nextInt();

        do { // Executa o bloco de código pelo menos uma vez, e depois verifica a condição
            System.out.print("Digite um valor não negativo: ");
            valor_inteiro = entrada.nextInt();
        } while (valor_inteiro < 0);

        return valor_inteiro;
    }

    public static int lerInteiroPositivo(String mensagem) {
        int valor_inteiro;

        System.out.print(mensagem);
        valor_inteiro = entrada.nextInt();

        do { // Executa o bloco de código pelo menos uma vez, e depois verifica a condição
            System.out.print("Digite um valor positivo: ");
            valor_inteiro = entrada.nextInt();
        } while (valor_inteiro > 0);

        return valor_inteiro;
    }

    public static void ex01() {
        int n, soma, contador;

        n = lerInteiro("Digite um valor inteiro: ");
        soma = 0;
        contador = 0;

        System.out.print("Divisores: ");

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                soma = soma + i;
                contador = contador + 1;
            }
        }

        System.out.println();

        System.out.println("Soma dos divisores: " + soma);

        if (soma == n) {
            System.out.println(n + " é um número perfeito.");
        } else {
            System.out.println(n + " não é um número perfeito.");
        }

        if (n > 1 && contador == 1) {
            System.out.println(n + " é um número primo.");
        } else {
            System.out.println(n + " não é um número primo.");
        }
    }


    public static void main(String[] args) {

        ex01();
       
    }
}