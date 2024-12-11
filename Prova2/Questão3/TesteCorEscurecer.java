import java.util.Scanner;

public class TesteCorEscurecer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vermelho = obterValorCor("Vermelho (0-255): ", sc);
        int verde = obterValorCor("Verde (0-255): ", sc);
        int azul = obterValorCor("Azul (0-255): ", sc);

        Cor cor = new Cor(vermelho, verde, azul);
        System.out.println("Cor base: " + cor);

        Cor corEscurecida = cor.escurecer();
        System.out.println("Cor escurecida: " + corEscurecida);

        sc.close();
    }

    private static int obterValorCor(String mensagem, Scanner sc) {
        int valor;
        while (true) {
            System.out.print(mensagem);
            if (sc.hasNextInt()) {
                valor = sc.nextInt();
                if (valor >= 0 && valor <= 255) {
                    break;
                } else {
                    System.out.println("Valor inválido! Por favor, insira um valor entre 0 e 255.");
                }
            } else {
                System.out.println("Entrada inválida! Por favor, insira um número inteiro.");
                sc.next();
            }
        }
        return valor;
    }
}
