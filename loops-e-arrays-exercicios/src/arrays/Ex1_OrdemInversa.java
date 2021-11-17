package arrays;

public class Ex1_OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {-3, 5, -1, 4, 8, 12};

        System.out.println("Vetor: ");
        int count = 0;
        while (count < vetor.length){
            System.out.println(vetor[count] + " ");
            count++;
        }

        for (int i = (vetor.length - 1); i >= 0; i--){
            System.out.println(vetor[i]);
        }
    }
}
