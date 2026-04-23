import java.util.Scanner;

public class Main {

    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String mensagem) {
        System.out.print(mensagem);
        return entrada.nextInt();
    }

    public static void main(String[] args) {

        int valor = lerInteiro("Valor: ");

        if (valor < 0 || valor > 999) {
            System.out.println("Valor inválido!");
            return;
        }

        if (valor == 0) {
            System.out.println("Zero");
            return;
        }

        int centena = valor / 100;
        int dezena = (valor % 100) / 10;
        int unidade = valor % 10;
        String texto = "";

        switch (centena) {
            case 1:
                texto = "Cento";
                break;
            case 2:
                texto = "Duzentos";
                break;
            case 3:
                texto = "Trezentos";
                break;
            case 4:
                texto = "Quatrocentos";
                break;
            case 5:
                texto = "Quinhentos";
                break;
            case 6:
                texto = "Seiscentos";
                break;
            case 7:
                texto = "Setecentos";
                break;
            case 8:
                texto = "Oitocentos";
                break;
            case 9:
                texto = "Novecentos";
                break;
        }

        if (valor == 100) {
            System.out.println("Cem");
            return;
        }

        if (dezena == 1) {

            if (!texto.equals("")) {
                texto = texto + " e ";
            }

            switch (unidade) {
                case 0:
                    texto = texto + "Dez";
                    break;
                case 1:
                    texto = texto + "Onze";
                    break;
                case 2:
                    texto = texto + "Doze";
                    break;
                case 3:
                    texto = texto + "Treze";
                    break;
                case 4:
                    texto = texto + "Quatorze";
                    break;
                case 5:
                    texto = texto + "Quinze";
                    break;
                case 6:
                    texto = texto + "Dezesseis";
                    break;
                case 7:
                    texto = texto + "Dezessete";
                    break;
                case 8:
                    texto = texto + "Dezoito";
                    break;
                case 9:
                    texto = texto + "Dezenove";
                    break;
            }

        } else {

            switch (dezena) {
                case 2:
                    if (!texto.equals("")) texto = texto + " e ";
                    texto = texto + "Vinte";
                    break;
                case 3:
                    if (!texto.equals("")) texto = texto + " e ";
                    texto = texto + "Trinta";
                    break;
                case 4:
                    if (!texto.equals("")) texto = texto + " e ";
                    texto = texto + "Quarenta";
                    break;
                case 5:
                    if (!texto.equals("")) texto = texto + " e ";
                    texto = texto + "Cinquenta";
                    break;
                case 6:
                    if (!texto.equals("")) texto = texto + " e ";
                    texto = texto + "Sessenta";
                    break;
                case 7:
                    if (!texto.equals("")) texto = texto + " e ";
                    texto = texto + "Setenta";
                    break;
                case 8:
                    if (!texto.equals("")) texto = texto + " e ";
                    texto = texto + "Oitenta";
                    break;
                case 9:
                    if (!texto.equals("")) texto = texto + " e ";
                    texto = texto + "Noventa";
                    break;
            }

            if (unidade != 0) {

                if (!texto.equals("")) {
                    texto = texto + " e ";
                }

                switch (unidade) {
                    case 1:
                        texto = texto + "Um";
                        break;
                    case 2:
                        texto = texto + "Dois";
                        break;
                    case 3:
                        texto = texto + "Três";
                        break;
                    case 4:
                        texto = texto + "Quatro";
                        break;
                    case 5:
                        texto = texto + "Cinco";
                        break;
                    case 6:
                        texto = texto + "Seis";
                        break;
                    case 7:
                        texto = texto + "Sete";
                        break;
                    case 8:
                        texto = texto + "Oito";
                        break;
                    case 9:
                        texto = texto + "Nove";
                        break;
                }
            }
        }

        System.out.println(texto);
    }
}