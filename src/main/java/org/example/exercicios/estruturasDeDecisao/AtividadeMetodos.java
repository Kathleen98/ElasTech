package org.example.exercicios.estruturasDeDecisao;

import org.example.exercicios.estruturasDeDecisao.Utilidades;

import java.util.Scanner;

public class AtividadeMetodos {

    public static void mostrarBoasVindas() {
        System.out.println("Bem-vinda ao curso de Java");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double media1;
        double media2;

        mostrarBoasVindas();

        Utilidades.saudar("Kathleen");

        Utilidades.saudar("Nome");

        Utilidades.saudar("Otonome");

        Utilidades.dobro(5);

        System.out.println("Informe o primeiro número: ");
        media1 = sc.nextDouble();
        System.out.println("Informe o segundo número: ");
        media2 = sc.nextDouble();

        Utilidades.calcMedia(media1, media2);

        Utilidades.eMaiorDeIdade(18);

        Utilidades.somar(1 , 6);

        Utilidades.somar(1 , 6, 8);

        Utilidades.somar(1.3 , 6.7);

        Utilidades.saudacao();

        Utilidades.saudacao("Kathleen");

    }
}
