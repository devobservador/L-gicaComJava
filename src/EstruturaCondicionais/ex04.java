package EstruturaCondicionais;

import java.util.Scanner;

public class ex04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ano atual(yyy):");
        int anoAtual= scanner.nextInt();
        System.out.println("Ano nascimento(yyy):");
        int anoNascimento = scanner.nextInt();
        int idade = anoAtual-anoNascimento;
        if(idade>=18){
            System.out.println("Apto para tirar a carteira");

        }else{
            System.out.println("Inapto para tirar uma carteira");
        }
    }
}
