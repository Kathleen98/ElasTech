package exercises.lesson12ArrayDeque;

import java.util.ArrayDeque;

public class EmptyQueue {
//    Crie uma fila vazia. Antes de usar o peek, teste com isEmpty():
//   - se estiver vazia  -> "Não tem ninguém na fila."
//   - se tiver gente    -> "Próximo: [nome]"
//   Depois adicione uma pessoa e teste de novo.

    public ArrayDeque<String> list = new ArrayDeque<String>();

    public void processList() {
        if (list.isEmpty()) {
            System.out.println("Não tem ninguém na fila");
        } else {
            System.out.println("Próximo: " + list.peek());
        }
    }

    public void addValue() {
        list.add("Bolota Theodoro Filipi");
    }

}
