package operadoresAritméticos;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a temperatura em Fahrenheit:");
        double f = scanner.nextDouble();

        double resultado = (f-32)/9*5;
        System.out.println("O valor da conversão é " +resultado);
    }
}
