package exercises.lesson12HashMap;

import java.util.HashMap;
import java.util.Map;

public class ProductAndPrice {
//    Crie um HashMap de produtos e preços. Coloque "café" com valor 5.00,
//   imprima, e depois faça put de "café" DE NOVO com valor 7.50.
//   Imprima outra vez e veja o que aconteceu com o tamanho.

    public HashMap<String, Double> list = new HashMap<>(Map.of(
            "Café", 5.00
    ));


    public void printCoffe() {
        System.out.println(list);
    }

    public void editCoffe() {
        list.put("Café", 7.50);
        System.out.println(list);
    }

}
