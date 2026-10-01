package org.example.exercicios.estruturasDeDecisao;

import java.util.Scanner;

public class AtividadeScanner {
    public static void main(String[] args) {
//        1 - Peça o nome da pessoa e a idade dela. Exemplo: "Oi Ana, você tem 28 anos e vai fazer 29 no próximo aniversário."

        Scanner sc = new Scanner(System.in);

        String name;
        int age;

        System.out.println("Informe seu nome: ");
        name = sc.nextLine();
        System.out.println("Informe sua idade: ");
        age = sc.nextInt();

        System.out.println("Oi, " + name + "!, você tem " + age + " anos e vai fazer " + (age + 1) + " no próximo aniversário");

//        2 - Peça dois números inteiros e mostre a soma, a subtração, a multiplicação, a divisão e o resto.

        int num1;
        int num2;

        System.out.println("Informe o primeiro número");
        num1 = sc.nextInt();
        System.out.println("Informe o segundo número");
        num2 = sc.nextInt();

        System.out.println("A soma dos números é " + (num1 + num2));
        System.out.println("A subtração dos números é " + (num1 - num2));
        System.out.println("A multiplicação dos números é " + (num1 * num2));
        System.out.println("A divisão dos números é " + (num1 / num2));
        System.out.println("O resto da divisão de " + num1 + " e " + num2 + " é:  " +  (num1 - num2));

//        3 - Peça a nota de uma aluna e mostre se ela foi aprovada (7 ou mais), ficou de recuperação (entre 5 e 6.9) ou foi reprovada.

        double nota;

        System.out.println("Informe sua nota: ");
        nota = sc.nextDouble();

        if(nota >= 7){
            System.out.println("Você foi aprovada! ");
        }else if(nota >= 5 && nota <= 6.9){
            System.out.println("Você está de recuperação!");
        }else{
            System.out.println("Você foi reprovada!");
        }

//        4 - Peça um número e mostre a tabuada dele de 1 a 10.

        int number;

        System.out.println("Informe um número: ");
        number = sc.nextInt();

        for(int i = 1 ; i <= 10 ; i ++){
            System.out.println(number + " x " + i + " = " + (number * i));
        }

    }
}
