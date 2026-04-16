import java.util.Scanner;

public class Maior {

    public static Scanner entrada = new Scanner(System.in);

    public static int lerinteiro(String mensagem) {
        int valor_inteiro;
        System.out.print(mensagem); 
        valor_inteiro = entrada.nextInt();
        return valor_inteiro;
    }

    public static void main(String[] args) {
        int n1, n2, n3;
        int maior = 0;
        int menor;

        n1= lerinteiro("Digite o primeiro numero \n");
        n2= lerinteiro("Digite o segundo numero \n");
        n3= lerinteiro("Digite o terceiro numero \n");
        menor = n2;
        maior = n2;

        if(n1 >= maior){
            maior = n1;
        }
        else if(n1 <= menor){
            menor = n1;
        }
        else if(n3 >= maior){
            maior = n3;
        }
        else if(n3 <= menor){
            menor = n3;
        }
        System.out.println("\n o maior numero é \n" + maior);
        System.out.println("\n o menor numero é \n" + menor);
    }
} 