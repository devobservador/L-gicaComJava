package operadoresAritméticos;

import java.util.Scanner;

public class ec02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Creuza me informe o quanto de dinheiro você possui em carteira para fazer a conversão em R$:");
        double reais = scanner.nextInt();

        double dolar = 2.20;

        double conversão = reais/dolar;
        System.out.println("Creuza a conversão do seu dinheiro para " + conversão +"US$");
    }
}
