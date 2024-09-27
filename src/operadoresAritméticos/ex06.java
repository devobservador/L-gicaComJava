package operadoresAritméticos;

import java.util.Scanner;

public class ex06 {

    public static void main(String[] args) {
        // creuza teve que pegar um empréstimo

        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o valor do empréstimo :");
        double emprestimo = scanner.nextDouble();
        double juros = 20.0;
        double calculoPorcentagem= (juros/100)*1000;
        emprestimo+=calculoPorcentagem;
        System.out.println(" O valor do seu empréstimo é de R$"+emprestimo + ".Com Juros de " + juros + "%");
        System.out.print(" Em quantas parcelas vai querer dividir ?");
        double Parcelas =scanner.nextDouble();
        if(Parcelas==0 || Parcelas==1){
            System.out.println(" O valor do seu empréstimo se mantem, R$ "+emprestimo);

        }else{
            double CalculoParcelas = emprestimo/Parcelas;
            System.out.println("O valor da suas parcelas são de " + CalculoParcelas);
        }













    }
}
