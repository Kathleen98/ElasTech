package exercises.lesson11Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Challenge6 {
//    Crie uma lista com cinco nomes. Peça um nome à pessoa e diga se ele está na lista e em qual posição. Se não estiver, avise.

    public static ArrayList<String> nameForScanner = new ArrayList<String>(Arrays.asList("Bolota Theodoro Filipe", "Mel", "Amora", "Maya", "Kathleen"));
    public static Scanner sc = new Scanner(System.in);
    public static String foundName;


    public static void getName() {
        System.out.println("Informe um nome: \n");
        foundName = sc.nextLine();

        System.out.println(nameForScanner.contains(foundName) ? "O nome " + foundName + " está na lista na posição: " + nameForScanner.indexOf(foundName) : "O nome: " + foundName + " não está na lista.");
        sc.close();
    }
}
