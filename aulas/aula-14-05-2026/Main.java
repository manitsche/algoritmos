public class Main {

    public static void main(String[] args) {
 
        int contador = 4;

        for (int linha = 0; linha < 5; linha++) {
            for (int caractere = 0; caractere < 9; caractere++) {
                if (caractere < contador || caractere >= 9 - contador) {
                    System.out.print("_");
                } else {
                    System.out.print("*");
                }
            }

            contador = contador - 1;
            System.out.println();
        }
    }
}