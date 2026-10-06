package exercises.lesson11Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class Challenge5 {
//    Crie uma lista com seis nomes e imprima todos usando um laço, no formato `"0: Ana"`. (Dica: i + ": " + comando para pegar posição da lista)

    public static ArrayList<String> nameInFor = new ArrayList<>(Arrays.asList("Lucas", "Camila", "Matheus", "Beatriz", "Gabriel", "Juliana"));

    public static void namesInFTheFor() {
        for (int i = 0; i < nameInFor.size(); i++) {
            System.out.println(i + ": " + nameInFor.get(i));
        }
    }
}
