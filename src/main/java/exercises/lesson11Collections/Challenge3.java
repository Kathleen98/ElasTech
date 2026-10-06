package exercises.lesson11Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class Challenge3 {
// Crie uma lista com quatro nomes. Troque o nome da posição 2 por outro e imprima a lista antes e depois.
    public static ArrayList<String> nameFor = new ArrayList<String>(Arrays.asList("Bolota Theodoro Filipe", "Mel", "Amora", "Maya"));

    public static void manipulatesNames() {
        System.out.println("Lista antes da alteração: \n" +
                nameFor
        );

        nameFor.set(2, "Zoe");
        System.out.println("Lista depois da alteração: \n" + nameFor);
    }

}
