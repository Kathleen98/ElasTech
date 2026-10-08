package exercises.lesson12HashMap;

public class Exercises {

    public static void main(String[] args) {
        NameAndAge nameAndAge = new NameAndAge();
        nameAndAge.printList();
        nameAndAge.getValue();

        ProductAndPrice productAndPrice = new ProductAndPrice();
        productAndPrice.printCoffe();
        productAndPrice.editCoffe();

        ContactList contactList = new ContactList();
        contactList.verifyContact();

        Inventory inventory = new Inventory();
        inventory.printDefaultvalue();
        inventory.printValue();

        ClassGrades classGrades = new ClassGrades();
        classGrades.printValueAndSize();
        classGrades.deleteItem();

    }


}
