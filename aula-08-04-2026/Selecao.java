import java.util.Scanner;

public class Selecao {

    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String mensagem) {
        int valor_inteiro;

        System.out.print(mensagem);
        valor_inteiro = entrada.nextInt();

        return valor_inteiro;
    }

    // ===========================================================================================================================

    public static void ex1MenorValor() {
        int valor1, valor2;

        valor1 = lerInteiro("Digite o primeiro valor: ");
        valor2 = lerInteiro("Digite o segundo valor: ");

        if (valor1 < valor2) {
            System.out.println(valor1 + " e menor que " + valor2);
        } else {
            System.out.println(valor2 + " e menor que " + valor1);
        }
    }

    // ===========================================================================================================================

    public static void ex3MenorEMaiorEntre3numeros() {
        int primeiro, segundo, terceiro, maior, menor;

        primeiro = lerInteiro("Digite o primeiro valor: ");
        segundo = lerInteiro("Digite o segundo valor: ");
        terceiro = lerInteiro("Digite o terceiro valor: ");

        if (primeiro > segundo && primeiro > terceiro) {
            maior = primeiro;
            System.out.println("Maior: " + primeiro);
        }
        if (segundo > primeiro && segundo > terceiro) {
            maior = segundo;
            System.out.println("Maior: " + segundo);
        }
        if (terceiro > primeiro && terceiro > segundo) {
            maior = terceiro;
            System.out.println("Maior: " + terceiro);
        }
        
        if (primeiro < segundo && primeiro < terceiro) {
            menor = primeiro;
            System.out.println("Menor: " + primeiro);
        }
        if (segundo < primeiro && segundo < terceiro) {
            menor = segundo;
            System.out.println("Menor: " + segundo);
        }
        if (terceiro < primeiro && terceiro < segundo) {
            menor = terceiro;
            System.out.println("Menor: " + terceiro);
        }
    }

    // ===========================================================================================================================

    public static void ex10Triangulo() {
        int ladoA, ladoB, ladoC;

        ladoA = lerInteiro("Digite o valor do lado A: ");
        ladoB = lerInteiro("Digite o valor do lado B: ");
        ladoC = lerInteiro("Digite o valor do lado C: ");

        if (ladoA < (ladoB + ladoC) || ladoB < (ladoA + ladoC) || ladoC < (ladoA + ladoB)) {
            System.out.println("Pode existir um triangulo");
        } else {
            System.out.println("Nao pode existir um triangulo");
        }
    }

    // ===========================================================================================================================

    public static void main(String[] args) {

        int opcao;

        System.out.println("===== LISTA DE EXERCICIOS - SELECAO =====");
        System.out.println("");
        System.out.println("1 - Menor valor");
        System.out.println("3 - Menor e maior entre 3 numeros");
        System.out.println("10 - Triangulo");
        System.out.println("");

        opcao = lerInteiro("Escolha um exercicio para executar: ");

        switch (opcao) {
            case 1:
                ex1MenorValor();
                break;
            case 3:
                ex3MenorEMaiorEntre3numeros();
                break;
            case 10:
                ex10Triangulo();
                break;
            default:
                System.out.println("Opcao invalida");
        }
    }
}