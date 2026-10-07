package exercises.lesson12Collections;

public class Exercises {
    public static void main(String[] args) {
        NameDuplicate name = new NameDuplicate();
        name.addName();

        Colors colors = new Colors();
        colors.addColors();

        NamesWithArrayList list = new NamesWithArrayList();
        list.printList();

        HashWithCPF cpfList = new HashWithCPF();
        cpfList.processList();

        ListFruits fruit = new ListFruits();
        fruit.printFruits();

        HashSetEmpty emptyList = new HashSetEmpty();
        emptyList.printValue();
    }
}
