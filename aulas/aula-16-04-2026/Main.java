import java.util.Scanner;

public class Main {
    
    public static Scanner entrada = new Scanner(System.in);

    public static double lerReal(String mensagem) {
        double valor_real;

        System.out.print(mensagem); // Entrada em uma unica linha
        valor_real = entrada.nextDouble();

        return valor_real;
    }

    public static char lerCaractere(String mensagem) {
        System.out.print(mensagem);
        return entrada.next().charAt(0); // Lê o primeiro caractere digitado
    }
    
    public static void main(String[] args){
        double valor_1, valor_2;
        char operador;

        valor_1 = lerReal("Primeiro valor: ");
        valor_2 = lerReal("Segundo valor: ");
        operador = lerCaractere("Operação: ");

        if (operador == '+') {
            System.out.println(valor_1 + valor_2);
        } else {
            if (operador == '-') {
                System.out.println(valor_1 - valor_2);    
            } else {
                if (operador == '*') {
                    System.out.println(valor_1 * valor_2);
                } else {
                    if (operador == '/') {
                        if (valor_2 == 0.0) { 
                            System.out.println("Divisão por zero não permitida");
                        } else {
                            System.out.println(valor_1 / valor_2);
                        }
                    } else {
                        System.out.println("Operação inválida");
                    }
                }
            }
        }
    }
}