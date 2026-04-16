import java.util.Scanner;

public class Idade {

    public static Scanner entrada = new Scanner(System.in);

    public static int lerinteiro(String mensagem) {
        int valor_inteiro;
        System.out.print(mensagem + ": "); 
        valor_inteiro = entrada.nextInt();
        return valor_inteiro;
    }

    public static void main(String[] args) {
        int idade;
        int ano_nascimento;

        idade = lerinteiro("Digite sua idade");
        ano_nascimento = lerinteiro("Digite seu ano de nascimento");

        System.out.println("\n--- Resultados ---");
        System.out.println("Idade: " + idade);
        System.out.println("Ano de Nascimento: " + ano_nascimento);

        entrada.close();
    }
}