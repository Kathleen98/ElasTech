package exercises.lesson3DecisonMakingFramework;

import java.util.Scanner;

public class AtividadeArrays {
    public static void main(String[] args) {

//        1 — Crie um array com os nomes de 5 pessoas. Mostre o primeiro, o terceiro e o último.

        String[] names = {"Kathleen", "Bolota", "Amora", "Mel", "Maya"};

        System.out.println(names[0] + " " + names[2] + " " + names[4]);

//        2 — Crie um array com as notas {8, 6, 10, 7, 9}. Usando um laço, mostre todas, uma por linha, assim: "Nota 1: 8".

        int[] notas = {8 , 6, 10, 7, 9};

        for(int i = 0 ; i < notas.length ; i++){
            System.out.println("Nota " + ( i + 1) + ": "  + notas[i]);
        }

//        3 — Com o mesmo array de notas, calcule e mostre a soma e a média.

        int soma= 0;
        for (int i = 0 ; i < notas.length ; i++){
            soma =  soma + notas[i];
        }

        System.out.println("A média da soma é: " + (soma / notas.length));

//        4 — Peça 5 números para a pessoa, guarde num array, e depois mostre todos de trás pra frente.

        int[] nums = new int[6];

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i <= 5 ; i++){
            System.out.println("Informe um número: ");
            nums[i] = (sc.nextInt());
        }

        sc.close();

        System.out.println("\nExibindo os números de trás para frente:");

        for(int i = 5 ; i >= 0 ; i--){
            System.out.println(nums[i]);
        }
    }
}
