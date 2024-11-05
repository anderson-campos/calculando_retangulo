import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scam = new Scanner(System.in);

        System.out.print("Digite a LARGURA: ");
        int largura = scam.nextInt();

        System.out.print("Digite a ALTURA: ");
        int altura = scam.nextInt();

        int area = areaRetangulo.areDoRetangulo(largura, altura);

        System.out.print("O valor da área do retangulo é de: " + area);
    }
}
