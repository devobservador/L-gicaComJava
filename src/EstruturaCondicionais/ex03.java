package EstruturaCondicionais;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o seu peso:");
        double peso = scanner.nextDouble();
        System.out.println("digite a sua altura");
        double altura = scanner.nextDouble();

        double imc = peso/(altura*altura);
        System.out.println(imc);

        if (imc<18.5) {
            System.out.println("muito abaixo do peso");
        } else if (imc>18.5 || imc==24.9) {
            System.out.println("Peso Adequado");

        } else if (imc>25 || imc==29.9) {
            System.out.println("SobrePeso");

        } else if (imc>= 30.0 || imc==34.9) {
            System.out.println("obesidade grau 1");
                    
            
        } else if (imc>=35.0 || imc==39.9) {
            System.out.println("obesidade grau 2");
            
        } else  {
            System.out.println("Obesidade grau 3");
            
        }


    }
}
