package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número do funcionário:");
        int numero = sc.nextInt();

        System.out.println("Digite o número de horas trabalhadas");
        int horaTrab = sc.nextInt();

        System.out.println("Digite o valor da hora");
        double valorHora = sc.nextDouble();

        double salario = horaTrab*valorHora;
        System.out.printf("Funcionário %d. %n Salário = U$ %.2f%n", numero, salario);

        sc.close();
    }
}
