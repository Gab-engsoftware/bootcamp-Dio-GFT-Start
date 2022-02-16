package desafios;

import java.util.Scanner;

public class AreaDoCirculo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double area;
        final double PI = 3.14159;
        double raio = entrada.nextDouble();

        area = PI * (Math.pow(raio,2));

        System.out.printf("A=%.4f\n", area);
    }
}