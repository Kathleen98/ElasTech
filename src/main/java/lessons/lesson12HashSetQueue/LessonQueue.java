package lessons.lesson12HashSetQueue;

import java.util.ArrayDeque;
import java.util.List;

public class LessonQueue {
    public static void main(String[] args) {
        LessonQueue.addName();
    }

    public static ArrayDeque<String> fila = new ArrayDeque<>();


    public static void addName(){
        fila.add("Kathleen");
        fila.addAll(List.of("Bolota Theodoro Filipi", "Amora", "Mel", "Maya"));
        System.out.println(fila);
    }

}
