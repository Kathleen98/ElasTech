package exercises.lesson12HashSet;

import java.util.HashSet;
import java.util.List;

public class Colors {
//    2. Crie um HashSet de cores usando addAll. Depois use contains dentro
//   de um if para avisar se a cor "verde" já está no conjunto ou não.

    public HashSet<String> color = new HashSet<String>();

    public void addColors() {
        color.addAll(List.of("Azul", "Amarelo", "Preto"));

        if (color.contains("verde")) {
            System.out.println("A cor verde está no conjunto de cores");
        } else {
            System.out.println("A cor verde não está no conjunto de cores");
        }
    }
}
