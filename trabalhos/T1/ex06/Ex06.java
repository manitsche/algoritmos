import java.util.Scanner;

public class Ex06 {

    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String mensagem) {
        int valor_inteiro;

        System.out.print(mensagem);
        valor_inteiro = entrada.nextInt();

        return valor_inteiro;
    }

    public static void main(String[] args) {

        int ano;

        ano = lerInteiro("ano: ");

        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
            System.out.println("E bissexto");
        } else {
            System.out.println("Nao e bissexto");
        }
    }
}