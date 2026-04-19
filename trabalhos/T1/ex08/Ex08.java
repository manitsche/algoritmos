import java.util.Scanner;

public class Ex08 {

    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String mensagem) {
        int valor_inteiro;

        System.out.print(mensagem);
        valor_inteiro = entrada.nextInt();

        return valor_inteiro;
    }

    public static double lerReal(String mensagem) {

        double valor_real;

        System.out.print(mensagem);
        valor_real = entrada.nextDouble();

        return valor_real;
    }

    public static void main(String[] args) {

        int lados;
        double lado, raiz3, area;

        lados = lerInteiro("lados: ");
        raiz3 = 1.732;
        lado = 0.0;

        if (lados == 3 || lados == 4) {
            lado = lerReal("lado: ");
        }

        if (lados < 3) {
            System.out.println("Nao e um poligono");
        }

        if (lados == 3) {
            System.out.println("TRIANGULO");
            area = ((lado * lado) * raiz3) / 4;
            System.out.printf("Area: %.2f\n", area);
        }

        if (lados == 4) {
            System.out.println("QUADRADO");
            area = lado * lado;
            System.out.println("Area: " + area);
        }

        if (lados == 5) {
            System.out.println("PENTAGONO");
        }

        if (lados > 5) {
            System.out.println("Poligono nao identificado");
        }
    }
}