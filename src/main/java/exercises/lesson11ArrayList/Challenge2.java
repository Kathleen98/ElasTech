package exercises.lesson11ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Challenge2 {
//    - Crie uma lista já preenchida com quatro frutas. Imprima a primeira, a última e quantas frutas tem.

    public static ArrayList<String> fruit = new ArrayList<String>(Arrays.asList("Maça", "Uva", "Melão", "Manga"));

    public static void printFruits() {
        System.out.println("A primeira fruta é: " + fruit.getFirst() + " " +
                "\n a última fruta é: " + fruit.getLast() +
                "\n a quantidade de frutas no array list é: " + fruit.size()

        );
    }
}
