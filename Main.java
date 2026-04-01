import java.util.Scanner;

public class Main {

    public static Scanner entrada = new Scanner(System.in);

    public static String lerString(String mensagem) {
        String frase;

        System.out.print(mensagem); // Entrada em uma unica linha
        frase = entrada.nextLine();

        return frase;
    }
    
    public static void main(String[] args) {
        
        //variáveis
        String nome, sobrenome;
        
        nome = lerString("Digite seu nome: ");
        sobrenome = lerString("Digite seu sobrenome: ");
        System.out.println("Ola, " + nome + " " + sobrenome);

        entrada.close();
    }
}