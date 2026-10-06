package exercises.lesson11Collections;

import java.util.ArrayList;
import java.util.List;

public class Challenge1 {
//    - Crie uma lista vazia de nomes. Adicione três nomes e imprima a lista inteira.

    public static ArrayList<String> name = new ArrayList<String>();

    public static void printNames() {
        name.addAll(List.of("Bolota Theodoro Filipe", "Mel", "Amora"));
        System.out.println(name);
    }
}
