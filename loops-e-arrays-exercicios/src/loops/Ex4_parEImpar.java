package loops;

import java.util.Scanner;

public class Ex4_parEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qdtNumeros;
        int numero;
        int par = 0;
        int impar = 0;

        System.out.println("Quantidade de Números: ");
        qdtNumeros = scan.nextInt();

        int count = 0;
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();
            count++;

            if (numero % 2 == 0) par++;
            else impar++;

        }while (count < qdtNumeros);

        System.out.println("Números pares: " + par);
        System.out.println("Números ímpares: " + impar);
    }
}
