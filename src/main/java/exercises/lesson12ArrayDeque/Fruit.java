package exercises.lesson12ArrayDeque;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Fruit {
//   Crie uma fila com addAll. Use peek para mostrar quem é o próximo e
//   imprima a fila logo depois. Repare que ela não mudou.

    //    Mesma fila. Agora use poll para atender o primeiro e imprima a fila
//   depois. Compare com o exercício 2.

    public ArrayDeque<String> fruit = new ArrayDeque<String>();

    public void addFruit() {
        fruit.addAll(List.of("Manga", "Uva", "Kiwi"));
        System.out.println(fruit.peek());
        System.out.println(fruit);
    }

    public void printNext() {
        fruit.poll();
        System.out.println(fruit);
    }

}
