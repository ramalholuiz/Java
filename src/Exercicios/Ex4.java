package Exercicios;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("DIGITE OS VALORES DE A, B , C e D");

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        float DIFERENCA = (A*B-C*D);

        System.out.printf("DIFERENCA = %f%n", DIFERENCA);

         sc.close();
    }
}
