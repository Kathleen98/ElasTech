package lessons.lesson19InterfaceReview.interfaces;

public class MongoDB implements DataBase{

    @Override
    public void conectionDataBase() {
        System.out.println("MongoDB conection");;
    }
}
