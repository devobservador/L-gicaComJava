package EstruturaCondicionais;

import java.util.Scanner;

public class ex02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um numero:");
        int ParOuImpar = scanner.nextInt();

        if(ParOuImpar%2==0){
            System.out.println("O numero que você digitou é par " +ParOuImpar);

        }else{
            System.out.println(" O numero que você digitou é impar " +ParOuImpar);
        }

    }
}
