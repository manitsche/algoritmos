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

        a = lerInteiro("a: ");
        b = lerInteiro("b: ");
        c = lerInteiro("c: ");
        d = lerInteiro("d: ");
        x1 = lerInteiro("x1: ");
        x2 = lerInteiro("x2: ");   

        y1 = (a * x1) + (b * x2);
        y2 = (c * x1) + (d * x2);

        System.out.println("y1: " + y1);
        System.out.println("y2: " + y2);      
    }
}