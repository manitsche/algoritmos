import java.util.Scanner;

public class Ex04 {

    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String mensagem) {
        int valor_inteiro;

        System.out.print(mensagem);
        valor_inteiro = entrada.nextInt();

        return valor_inteiro;
    }

    public static void main(String[] args) {

        int valor, notas100, notas50, notas10, notas5, notas1; 
        
        valor = lerInteiro("valor: ");

        if (valor >= 1 && valor <= 600) {

            notas100 = valor / 100;
            valor = valor % 100;

            notas50 = valor / 50;
            valor = valor % 50;

            notas10 = valor / 10;
            valor = valor % 10;

            notas5 = valor / 5;
            valor = valor % 5;

            notas1 = valor;

            if (notas100 > 0) {
                if (notas100 == 1) {    
                    System.out.println("1 nota de R$ 100");
                } else {
                    System.out.println(notas100 + " notas de R$ 100");
                }
            }

            if (notas50 > 0) {
                if (notas50 == 1) {    
                    System.out.println("1 nota de R$ 50");
                } else {
                    System.out.println(notas50 + " notas de R$ 50");
                }
            }

            if (notas10 > 0) {
                if (notas10 == 1) {    
                    System.out.println("1 nota de R$ 10");
                } else {
                    System.out.println(notas10 + " notas de R$ 10");
                }
            }

            if (notas5 > 0) {
                if (notas5 == 1) {    
                    System.out.println("1 nota de R$ 5");
                } else {
                    System.out.println(notas5 + " notas de R$ 5");
                }
            }

            if (notas1 > 0) {
                if (notas1 == 1) {    
                    System.out.println("1 nota de R$ 1");
                } else {
                    System.out.println(notas1 + " notas de R$ 1");
                }
            }
        }
    }
}