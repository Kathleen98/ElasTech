package exercises.lesson11Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ActivityCollection {

    public static void main(String[] args) {
        ActivityCollection.printNames();
        ActivityCollection.printFruits();
        ActivityCollection.manipulatesNames();
        ActivityCollection.manipulatesCities();
        ActivityCollection.namesInFTheFor();
        ActivityCollection.getName();
        sc.close();
    }

    public static ArrayList<String> name = new ArrayList<String>();
    public static ArrayList<String> fruit = new ArrayList<String>(Arrays.asList("Maça", "Uva", "Melão", "Manga"));
    public static ArrayList<String> nameFor = new ArrayList<String>(Arrays.asList("Bolota Theodoro Filipe", "Mel", "Amora", "Maya"));
    public static ArrayList<String> city = new ArrayList<>(Arrays.asList("Jijoca", "Jericoacoara", "Aracati", "Beberibe"));
    public static ArrayList<String> nameInFor = new ArrayList<>(Arrays.asList("Lucas", "Camila", "Matheus", "Beatriz", "Gabriel", "Juliana"));
    public static ArrayList<String> nameForScanner = new ArrayList<String>(Arrays.asList("Bolota Theodoro Filipe", "Mel", "Amora", "Maya", "Kathleen"));
    public static Scanner sc = new Scanner(System.in);
    public static String foundName;

    public static void printNames() {
        name.addAll(List.of("Bolota Theodoro Filipe", "Mel", "Amora"));
        System.out.println(name);
    }


    public static void printFruits() {
        System.out.println("A primeira fruta é: " + fruit.getFirst() + " " +
                "\n a última fruta é: " + fruit.getLast() +
                "\n a quantidade de frutas no array list é: " + fruit.size()

        );
    }

    public static void manipulatesNames() {
        System.out.println("Lista antes da alteração: \n" +
                nameFor
        );

        nameFor.set(2, "Zoe");
        System.out.println("Lista depois da alteração: \n" + nameFor);
    }

    public static void manipulatesCities() {
        city.removeFirst();
        System.out.println("Após remover uma cidade, a lista ficou com: " + city.size() + " cidades");
    }

    public static void namesInFTheFor() {
        for (int i = 0; i < nameInFor.size(); i++) {
            System.out.println(i + ": " + nameInFor.get(i));
        }
    }


    public static void getName() {
        System.out.println("Informe um nome: \n");
        foundName = sc.nextLine();

        System.out.println(nameForScanner.contains(foundName) ? "O nome " + foundName + " está na lista na posição: " + nameForScanner.indexOf(foundName) : "O nome: " + foundName + " não está na lista.");
    }
}
