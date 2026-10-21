package exercises.constructor;

public class Main {
    public static void main(String[] args) {
        Show print = new Show();

        Scheduling thor = new Scheduling(
                "Thor",
                "Banho",
                "14h",
                true,
                true,
                false,
                "Alégico a shampoo",
                10
        );
        Scheduling luna = new Scheduling(
                "Luna",
                "Tosa",
                "10h",
                false,
                false,
                false,
                "",
                0
        );
        Scheduling mel = new Scheduling(
                "Mel",
                "Banho",
                "16h",
                false,
                false,
                false,
                "",
                0

        );


        print.printAll(thor);
        print.printAll(luna);
        print.printAll(mel);

    }
}
