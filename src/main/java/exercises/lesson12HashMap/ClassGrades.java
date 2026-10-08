package exercises.lesson12HashMap;

import java.util.HashMap;
import java.util.Map;

public class ClassGrades {
//    Crie um HashMap de notas com três alunas. Imprima o mapa e o tamanho.
//   Remova uma delas e imprima de novo.

    public HashMap<String, Double> list = new HashMap<String, Double>(Map.of(
            "Ana", 6.5,
            "Bia", 7.4,
            "Carla", 5.5
    ));

    public void printValueAndSize(){
        System.out.println(list);
        System.out.println(list.size());
    }

    public void deleteItem(){
        list.remove("Ana");
        System.out.println(list);
    }
}
