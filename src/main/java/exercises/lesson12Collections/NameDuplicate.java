package exercises.lesson12Collections;

import java.util.HashSet;
import java.util.List;

public class NameDuplicate {
//    1. Crie um HashSet de nomes e adicione quatro valores, sendo um deles
//   repetido. Imprima o conjunto e o tamanho. Repare no que aconteceu
//   com o repetido.

    public static HashSet<String> names = new HashSet<String>();

    public void addName() {
        names.addAll(List.of("Bolota Theodoro Filipi", "Mel", "Amora", "Amora"));
        System.out.println("Lista de nomes: " + names + " o tamanho da lista é de: " + names.size());
    }
}
