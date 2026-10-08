package exercises.lesson12HashMap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NameAndAge {
//    Crie um HashMap de nomes e idades com três pessoas. Imprima o mapa
//   inteiro e depois use get para mostrar a idade de uma delas.

    public HashMap<String, Integer> list = new HashMap<String, Integer>(Map.of(
            "Kathleen", 28,
            "Bolota", 6,
            "Mel", 6,
            "Amora", 5
            ));

    public void printList(){
        System.out.println(list);
    }

    public void getValue(){
        System.out.println(list.get("Kathleen"));
    }

}
