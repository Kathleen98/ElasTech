package exercises.lesson12HashMap;

import java.util.HashMap;
import java.util.Map;

public class ContactList {
//     Crie uma agenda (nome -> telefone) com duas pessoas. Use containsKey
//   dentro de um if para mostrar o telefone de alguém que está na agenda
//   e de alguém que não está.

    public HashMap<String, String> list = new HashMap<String, String>(Map.of(
            "Kathleen", "11 97857-9087",
            "Amora", "15 94677-9087"
    ));

    public void verifyContact() {
        if (list.containsKey("Kathleen")) {
            System.out.println(list.get("Kathleen"));
        } else {
            System.out.println("Esse contato não está salvo na agenda!");
        }
    }
}
