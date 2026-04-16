import java.util.Scanner;

public class Ex01 {

    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String mensagem) {
        int valor_inteiro;

        System.out.print(mensagem);
        valor_inteiro = entrada.nextInt();

        return valor_inteiro;
    }

    public static void main(String[] args) {

        int a, b, c, d, x1, x2, y1, y2;

        a = lerInteiro("Digite o valor de A: ");
        b = lerInteiro("Digite o valor de B: ");
        c = lerInteiro("Digite o valor de C: ");
        d = lerInteiro("Digite o valor de D: ");
        x1 = lerInteiro("Digite o valor de X1: ");
        x2 = lerInteiro("Digite o valor de X2: ");   

        y1 = (a * x1) + (b * x2);
        y2 = (c * x1) + (d * x2);

        System.out.println("y1: " + y1);
        System.out.println("y2: " + y2);      
    }
}