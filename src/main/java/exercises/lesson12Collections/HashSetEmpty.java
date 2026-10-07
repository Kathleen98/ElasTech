package exercises.lesson12Collections;

import java.util.HashSet;

public class HashSetEmpty {
//    Crie um HashSet vazio. Imprima o isEmpty(). Adicione um valor e
//   imprima o isEmpty() de novo.

    public HashSet<String> list = new HashSet<>();

    public void printValue(){
        System.out.println(list.isEmpty());
        list.add("um valor de string");
        System.out.println(list.isEmpty());
    }
}
