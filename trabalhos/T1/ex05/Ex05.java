import java.util.Scanner;

public class Ex05 {

    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String mensagem) {
        int valor_inteiro;

        System.out.print(mensagem);
        valor_inteiro = entrada.nextInt();

        return valor_inteiro;
    }

    public static void main(String[] args) {

        int primeiro, segundo, terceiro, maior, menor, meio;

        maior = 0;
        meio = 0;
        menor = 0;

        primeiro = lerInteiro("");
        segundo = lerInteiro("");
        terceiro = lerInteiro("");

        if (primeiro > segundo && primeiro > terceiro) {
            maior = primeiro;
            if (segundo > terceiro) {
                meio = segundo;
                menor = terceiro;
            } else {
                meio = terceiro;
                menor = segundo;
            }
        }

        if (segundo > primeiro && segundo > terceiro) {
            maior = segundo;
            if (primeiro > terceiro) {
                meio = primeiro;
                menor = terceiro;
            } else { 
                meio = terceiro;
                menor = primeiro;
            }
        }

        if (terceiro > primeiro && terceiro > segundo) {
            maior = terceiro;
            if (primeiro > segundo) {
                meio = primeiro;
                menor = segundo;
            } else {
                meio = segundo;
                menor = primeiro;
            }
        }

        System.out.println(menor);
        System.out.println(meio);
        System.out.println(maior);
    }
}