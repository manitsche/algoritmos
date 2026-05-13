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

    public static void ex01() {
        
        int nvotos, votos_c1, votos_c2; 
        
        nvotos = 10;
        votos_c1 = 0; 
        votos_c2 = 0;

        do {
            int voto = lerInteiro("Digite o número do candidato (1 ou 2): ");
            if (voto == 1) {
                votos_c1 = votos_c1 + 1;
            } else if (voto == 2) {
                votos_c2 = votos_c2 + 1;
            } else {
                System.out.println("Voto inválido. Tente novamente.");
            }   

        } while (votos_c1 + votos_c2 < nvotos);
        
        System.out.println("Votos do candidato 1: " + votos_c1);
        System.out.println("Votos do candidato 2: " + votos_c2);
        
        if (votos_c1 > votos_c2) {
            System.out.println("O candidato 1 venceu!");
        } else if (votos_c2 > votos_c1) {
            System.out.println("O candidato 2 venceu!");
        } else {
            System.out.println("Empate!");
        }
    }

    public static void ex02() {
        
        int numero;

        numero = lerInteiro("Digite um número inteiro: ");

        for (int linha = 0; linha < numero; linha++) {
            for (int coluna = 0; coluna < numero; coluna++) {
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        // ex01();
        ex02();
    }
}