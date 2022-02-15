package desafios;

import java.util.Scanner;

public class ExibindoNumerosPares {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int a = entrada.nextInt();
        int contador = 0;
        do{
            if(contador %2 == 0 && contador > 0 ){
                System.out.println(contador);
            }
            contador++;
        }while (contador <= a);
    }
}