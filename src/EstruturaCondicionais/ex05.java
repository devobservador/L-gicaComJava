package EstruturaCondicionais;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Primeira nota");
        double PrimeraNota = scanner.nextDouble();
        System.out.println("Segunda nota:");
        double SegundaNota = scanner.nextDouble();
        double media = (PrimeraNota+SegundaNota)/2;

        if(media>=6){
            System.out.println("Média:" + media);
            System.out.println("Aluno: Aprovado");

        } else if (media==5) {
            System.out.println("Média: " +media);
            System.out.println("Aluno: Recuperação");

        }else {
            System.out.println("Média: " +media);
            System.out.println("Aluno:Reprovado" );
        }

    }
}
