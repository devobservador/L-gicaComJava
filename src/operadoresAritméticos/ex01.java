package operadoresAritméticos;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ex01 {
    public static void main(String[] args) {
        // creuza sabe o ano de  nascimento mas não sabe a idade dela
        //creuza precisa fazer uma viajem mas precisa fazer a conversão do valor


        Scanner scanner = new Scanner(System.in);
        System.out.println("digite  o seu ano de nascimento:");
        int anoNascimento= scanner.nextInt();

        System.out.println("digite o ano atual:");
        int anoAtual = scanner.nextInt();

        int resultado = anoAtual-anoNascimento;
        System.out.println("Creuza a  sua idade é " + resultado +"anos" + " e por isso você vai colocar " + resultado + "  velas  no seu aniversario");



    }
}