package exercises.lesson12ArrayDeque;

import java.util.ArrayDeque;

public class People {
//    Crie uma fila e coloque três pessoas nela com add. Imprima a fila
//   e quantas pessoas tem.

    public ArrayDeque<String> people = new ArrayDeque<String>();

    public void printPeople(){
        people.add("Bolota");
        people.add("Mel");
        people.add("Amora");

        System.out.println(people);
        System.out.println(people.size());
    }


}
