package exercises.lesson12HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class NamesWithArrayList {
//    Crie um ArrayList com nomes repetidos. Use new HashSet<>(lista) para
//   tirar os repetidos. Imprima os dois e compare.

    public ArrayList<String> list = new ArrayList<String>(List.of("Bolota", "Mel", "Mel", "Amora", "Maya"));
    public HashSet<String> nameList = new HashSet<String>(list);

    public void printList() {
        System.out.println(list);
        System.out.println(nameList);
    }

}
