package exercises.lesson12HashMap;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
//    Crie um HashMap de estoque (produto -> quantidade) com dois itens.
//   Use getOrDefault para mostrar a quantidade de um produto que existe
//   e de um que não existe (devolvendo 0). Depois tente com get normal
//   no que não existe e compare.

    public HashMap<String, Integer> list = new HashMap<String, Integer>(Map.of(
            "Ração",4,
            "Areia",7
            ));


    public void printDefaultvalue() {
        System.out.println(list.getOrDefault("Brinquedo", 0));
    }

    public void printValue() {
        System.out.println(list.get("Brinquedo"));
    }

}
