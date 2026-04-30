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
        int i, numero_digitado, qtde_par;

        i = 0;
        qtde_par = 0;

        while (i < 5) {
            numero_digitado = lerInteiro("Digite um numero inteiro: ");
            if (numero_digitado % 2 == 0) {
                qtde_par = qtde_par + 1;
            }
            
            i = i + 1;
        }

        System.out.println("A quantidade de numeros pares digitados foi: " + qtde_par);
    }

    public static void ex02() {
        double nota, soma_das_notas, media_da_turma;
        int i, cont_nota_minima;
   
        i = 0;
        cont_nota_minima = 0;
        soma_das_notas = 0;

        while (i < 10) {
            nota = lerReal("Nota: ");
            soma_das_notas = soma_das_notas + nota;

            if (nota >= 7.0) {
                cont_nota_minima = cont_nota_minima + 1;
            }
        
            i = i + 1;
        }

        media_da_turma = soma_das_notas / 10.0;

        System.out.println("Quantidade de alunos aprovados: " + cont_nota_minima);
        System.out.println("Soma das notas: " + soma_das_notas);
        System.out.println("Média da turma: " + media_da_turma);
    }

    public static void ex03() {
       int numero, quant_positivo, quant_negativo;
    
       quant_positivo = 0;
       quant_negativo = 0;

       numero = lerInteiro("Digite um numero inteiro: ");
       
        while (numero != 0) {
            numero = lerInteiro("Digite um numero inteiro: ");
            if (numero > 0) {
                quant_positivo = quant_positivo + 1;
            } else { 
                quant_negativo = quant_negativo + 1;
            }
        }
        
        System.out.println("Quantidade de numeros positivos: " + quant_positivo);
        System.out.println("Quantidade de numeros negativos: " + quant_negativo);
    }

    public static void ex04() {
        int numero, i, fatorial;

        numero = lerInteiro("Digite um numero: ");

        if (numero == 0) {
            fatorial = 1;
        }

        fatorial = 1;
        i = numero;

        while (i > 1) {
            fatorial = fatorial * i;
            i = i - 1;
        }

        System.out.println("Fatorial de " + numero + " e: " + fatorial);
    }

    public static void main(String[] args) {
        
        // ex01();
        // ex02();
        // ex03();
        ex04();

    }
}