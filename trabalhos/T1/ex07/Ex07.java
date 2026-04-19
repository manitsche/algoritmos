import java.util.Scanner;

public class Ex07 {

    public static Scanner entrada = new Scanner(System.in);

    public static char lerCaractere(String mensagem) {
        char caractere;
    
        System.out.print(mensagem);
        caractere = entrada.next().charAt(0);
    
        return caractere;
    }

    public static void main(String[] args) {

        char resposta1, resposta2, resposta3, resposta4, resposta5;
        int contador = 0;

        resposta1 = lerCaractere("Telefonou para a vitima? ");
        resposta2 = lerCaractere("Esteve no local do crime? ");
        resposta3 = lerCaractere("Mora perto da vitima? ");
        resposta4 = lerCaractere("Devia para a vitima? ");
        resposta5 = lerCaractere("Ja trabalhou com a vitima? ");

        if (resposta1 == 's') {
            contador = contador + 1;
        }
        if (resposta2 == 's') {
            contador = contador + 1;
        }
        if (resposta3 == 's') {
            contador = contador + 1;
        }
        if (resposta4 == 's') {
            contador = contador + 1;
        }
        if (resposta5 == 's') {
            contador = contador + 1;
        }

        if (contador == 2) {
            System.out.println("Suspeita");
        }
        if (contador == 3 || contador == 4) {
            System.out.println("Cumplice");
        }
        if (contador == 5) {
            System.out.println("Assassino");
        }
        if (contador == 0 || contador == 1) {
            System.out.println("Inocente");
        }
    }
}