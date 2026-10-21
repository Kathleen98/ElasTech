package lessons.lesson20Builders.factory;

import lessons.lesson19InterfaceReview.interfaces.DataBase;

public class Main {
//    padrão criacional que esconde a lógica de criação de objeto

    public static void main(String[] args) {
        DataBase data = DatabaseFactory.create(2);
        data.conectionDataBase();
    }
}
