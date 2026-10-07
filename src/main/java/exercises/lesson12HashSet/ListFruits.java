package exercises.lesson12HashSet;

import java.util.HashSet;
import java.util.List;

public class ListFruits {
//     Crie um HashSet com três frutas e percorra ele com for,
//   imprimindo uma por linha.

    public HashSet<String> fruits = new HashSet<String>(List.of("Manga", "Uva", "Banana Maçã"));

    public void printFruits() {
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }

}
