package desafios;

import java.util.Scanner;

public class OFilme {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double valorA = leitor.nextDouble();
        double valorB = leitor.nextDouble();
        double resultado = ((valorB-valorA) * 100)/valorA;
        System.out.printf("%.2f%%\n", resultado);
    }

}