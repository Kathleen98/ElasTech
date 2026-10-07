package exercises.lesson10TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ActivityTryCatch {
    public static void main(String[] args) {
        ActivityTryCatch.positonAray();
        ActivityTryCatch.returnPosition();
        ActivityTryCatch.ageCapture();
        ActivityTryCatch.printName();
        ActivityTryCatch.divideNumber();
        ActivityTryCatch.showPositionName();
    }

//    1 — Faça um programa que peça dois números inteiros e mostre a divisão do primeiro pelo segundo. Se a pessoa digitar 0 no segundo, trate a ArithmeticException e mostre uma mensagem explicando que não dá pra dividir por zero.

    public static Scanner sc = new Scanner(System.in);
    public static int num1;
    public static int num2;

    public static void positonAray() {
        try {

            System.out.println("Informe o primeiro número");
            num1 = sc.nextInt();

            System.out.println("Informe o segundo número");
            num2 = sc.nextInt();


            System.out.println("O resultado da divisão é: " + num1 / num2);

        } catch (ArithmeticException ae) {
            System.out.println("Não é possível realizar uma divisão com o número 0");
        }
    }

//  2 — Crie um array com 5 notas. Peça uma posição para a pessoa e mostre a nota daquela posição. Se a posição não existir, trate a ArrayIndexOutOfBoundsException e avise que o array só vai de 0 a 4.

    public static int[] listNumbs = {5, 6, 2, 7, 9};
    public static int position;

    public static void returnPosition() {
        try {

            System.out.println("Informe um número");
            position = sc.nextInt();


            System.out.println("O número da lista na posição " + position + " é: " + listNumbs[position]);
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.println("O array vai de 0 até " + (listNumbs.length - 1));
        }
    }


//    3 — Peça a idade da pessoa com scanner.nextInt(). Se ela digitar um texto em vez de um número, trate a InputMismatchException e mostre uma mensagem pedindo um número.

    public static int age;

    public static void ageCapture() {
        try {

            System.out.println("Informe sua idade: ");
            age = sc.nextInt();

            System.out.println("Sua idade é: " + age);
        } catch (InputMismatchException ime) {
            System.out.println("Digite um número para informar sua idade!");
        }
    }

//   4 Crie uma variável String nome = null; e tente imprimir nome.length(). Trate a NullPointerException e mostre "O nome não foi preenchido."

    public static String name = null;

    public static void printName() {

        try {
            System.out.println(name.length());
        } catch (NullPointerException npe) {
            System.out.println("O nome não foi preenchido!");
        }
    }

//  5 — Peça um número para a pessoa e mostre o resto da divisão de 100 por esse número. Trate a ArithmeticException para o caso de ela digitar 0.

    public static int num3;

    public static void divideNumber() {

        try {

            System.out.println("Informe um número: ");
            num3 = sc.nextInt();

            System.out.println("O resto da divisão por 100 é: " + (100 % num3));
        } catch (ArithmeticException ae) {
            System.out.println("Informe um número maior que 0");
        }
    }


//    6 — Crie um array com 3 nomes. Mostre o nome da posição 5 de propósito e trate a ArrayIndexOutOfBoundsException com a mensagem "Essa posição não existe." Depois do try/catch, imprima "O programa continua funcionando."

    public static String[] listName = {"Bolota Theodoro Filipi", "Mel", "Amora"};

    public static void showPositionName() {

        try {

            System.out.println(listName[5]);

        } catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.println("Essa posição não existe");
        } finally {

            sc.close();
        }

        System.out.println("O programa continua funcionando");
    }
}
