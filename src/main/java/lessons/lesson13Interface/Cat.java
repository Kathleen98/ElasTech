package lessons.lesson13Interface;

public class Cat implements  Animal{

    @Override
    public void makeSound() {
        System.out.println("Miau!");
    }
}
