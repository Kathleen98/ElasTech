package exercises.lesson12ArrayDeque;

import java.util.ArrayDeque;
import java.util.List;

public class ListNameTwo {
//    Crie uma fila com três nomes e use contains para responder duas
//   perguntas: se "Bia" está na fila e se "Zoe" está.

    public ArrayDeque<String> list = new ArrayDeque<>(List.of("Bia", "Zoe", "Amora"));

    public void printList() {
        if (list.contains("Bia") && list.contains("Zoe")) {
            System.out.println("Bia e Zoe estão na lista");
        } else {
            System.out.println("Bia ou Zoe não estão na lista");
        }
    }
}
