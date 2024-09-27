package operadoresAritméticos;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a temperatura em celsius");
        double c = scanner.nextDouble();
        double resultado = (c/5)*9+32;
        System.out.println("Resultado da conversão de Celsius para Fahrenheit é " +resultado);


    }
}
