import java.util.Scanner;

public class FuncoesBasicas {

    public static Scanner entrada = new Scanner(System.in);

    public static double lerReal(String mensagem) {

        double valor_real;

        System.out.print(mensagem); // Entrada em uma unica linha
        valor_real = entrada.nextDouble();

        return valor_real;
    }

    public static String lerFrase(String mensagem) {
        String frase;

        System.out.print(mensagem); // Entrada em uma unica linha
        frase = entrada.nextLine();

        return frase;
    }

    public static int lerInteiro(String mensagem) {
        int valor_inteiro;

        System.out.print(mensagem); // Entrada em uma unica linha
        valor_inteiro = entrada.nextInt();

        return valor_inteiro;
    }
    
    public static char lerCaractere(String mensagem) {
        char caractere;
    
        System.out.print(mensagem);
        caractere = entrada.next().charAt(0);
    
        return caractere;
    }
    
    public static void main(String[] args) {
        
        //variáveis
        String nome;
        
        nome = lerFrase("Digite seu nome: ");
        System.out.println("Ola, " + nome);

        entrada.close();
    }
}