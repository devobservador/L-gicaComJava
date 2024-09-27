package operadoresAritméticos;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o valor do eletronico creuza:");
        double valor = scanner.nextDouble();

        double calculo=(valor*60)/100;
        System.out.println("o imposto do valor é " + calculo);


    }

}
