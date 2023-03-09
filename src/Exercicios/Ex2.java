package Exercicios;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args){
        System.out.println("Digite as medidas");

        Scanner sc = new Scanner(System.in);

        int Valor1=sc.nextInt();
        int Valor2=sc.nextInt();
        int Soma= Valor1 + Valor2;

        System.out.printf("Soma = %d", Soma);


        sc.close();
    }
}
