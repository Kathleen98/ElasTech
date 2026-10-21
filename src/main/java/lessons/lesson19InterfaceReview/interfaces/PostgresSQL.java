package lessons.lesson19InterfaceReview.interfaces;

public class PostgresSQL implements DataBase{

    @Override
    public void conectionDataBase() {
        System.out.println("PostgresSQL conection");;
    }
}
