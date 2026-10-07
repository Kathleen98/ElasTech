package exercises.lesson12HashSet;

import java.util.HashSet;
import java.util.List;

public class HashWithCPF {
//    Crie um HashSet com três CPFs e imprima. Depois remova um deles e
//   imprima de novo, junto com o tamanho.

    public HashSet<String> cpf = new HashSet<String>(List.of("544.565.258-75", "534.545.578-45", "564.876.476-37"));

    public void processList() {
        System.out.println(cpf);
        cpf.remove("544.565.258-75");
        System.out.println(cpf);
    }
}
