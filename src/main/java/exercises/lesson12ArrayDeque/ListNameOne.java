package exercises.lesson12ArrayDeque;

import java.util.ArrayDeque;
import java.util.List;

public class ListNameOne {

//    Crie uma fila com três nomes e atenda todos usando
//   while (!fila.isEmpty()). No final, imprima "Fila vazia!".

    public ArrayDeque<String> list = new ArrayDeque<String>(List.of("Kathleen", "Ana", "Lucas"));

    public void printList() {
        while (!list.isEmpty()) {
            list.poll();
        }

        System.out.println("Fila vazia!");
    }

}
