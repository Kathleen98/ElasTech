package exercises.lesson11ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Challenge4 {
//     Crie uma lista com quatro cidades. Remova a da posição 1 e imprima quantas sobraram.

    public static ArrayList<String> city = new ArrayList<>(Arrays.asList("Jijoca", "Jericoacoara", "Aracati", "Beberibe"));

    public static void manipulatesCities() {
        city.removeFirst();
        System.out.println("Após remover uma cidade, a lista ficou com: " + city.size() + " cidades");
    }
}
