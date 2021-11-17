package loops;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex3_MaiorMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;

        int count = 0;
        do {
            System.out.println("Digite o número: ");
            numero = scan.nextInt();
            count = count + 1;
            soma = soma + numero;

            if (numero > maior) maior = numero;

        }while (count < 5);

        System.out.println("Maior número: " + maior);
        System.out.println("Média: " + (soma / 5));
    }
}
