package arrays;

import java.util.Scanner;

import static java.lang.System.*;

public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(in);

        String[] consoantes = new String[6];
        int qdtConsoantes = 0;

        int count = 0;
        do {
            out.println("Letra: ");
            String letra = scan.next();


            if (!(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u")) ){
                consoantes[count] = letra;
                qdtConsoantes++;
            }

            count++;

        }while (count < consoantes.length);

        for (String consoante : consoantes) {

            if (consoante != null) {
                System.out.println(consoante + " ");
            }

        }
    }
}
