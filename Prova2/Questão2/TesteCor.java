import java.util.Scanner;

public class TesteCor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Vermelho: ");
        int vermelho = sc.nextInt();
        System.out.print("Verde: ");
        int verde = sc.nextInt();
        System.out.print("Azul: ");
        int azul = sc.nextInt();

        Cor cor = new Cor(vermelho, verde, azul);

        System.out.println("Cor: " + cor);

        sc.close();
    }
}
