package org.example.exercicios.estruturasDeDecisao;

public class OpeRalacional {

    public static void main(String[] args) {
//       1- Crie variáveis para as notas de duas alunas. Mostre na tela o resultado de: são iguais,
//       são diferentes, a primeira é maior, a primeira é menor para quando:
//          - a = 10, b = 3
//          - a = 3, b = 10
//          - a = 5, b = 5

        int studentA = 10;
        int studentB = 3;

        if (studentA == studentB) {
            System.out.println("São iguais");
        } else if (studentA != studentB) {
            System.out.println("São diferentes");
        } else if (studentA > studentB) {
            System.out.println("A primeira é maior");
        } else {
            System.out.println("A primeira é menor");
        }

        //      2- Exiba na tela  a == b, sendo a = 10 e b 3.

        if (studentA == 10 && studentB == 3) {
            System.out.println("a == b");
        }

        //      3- Exiba na tela a != b, sendo a = 10 e b = 3.

        if (studentA == 10 && studentB == 3) {
            System.out.println("a != b");
        }

        //      4- Dado boolean chovendo = true, retorne na tela o resultado de !chovendo

        boolean isRain = true;

        if (isRain) {
            System.out.println("!chovendo");
        }


    }
}
