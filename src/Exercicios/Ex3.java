package Exercicios;
import java.util.Locale;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do raio: ");

        double raio = sc.nextDouble();
        double Area = (3.14159*(raio*raio));

        System.out.printf("Area = %.4f%n",Area);

        sc.close();
    }
}
