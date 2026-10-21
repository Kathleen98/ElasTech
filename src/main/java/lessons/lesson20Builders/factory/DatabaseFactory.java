package lessons.lesson20Builders.factory;

import lessons.lesson19InterfaceReview.interfaces.DataBase;
import lessons.lesson19InterfaceReview.interfaces.MongoDB;
import lessons.lesson19InterfaceReview.interfaces.PostgresSQL;

public class DatabaseFactory {

    public static DataBase create(int option){
        switch (option){
            case 1:
                    return new MongoDB();
            case 2:
                    return new PostgresSQL();
            default:
                    throw new IllegalArgumentException("Argument invalid");
        }
    }
}
