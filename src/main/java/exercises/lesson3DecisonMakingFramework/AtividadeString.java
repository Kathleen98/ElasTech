package exercises.lesson3DecisonMakingFramework;

import java.util.Scanner;

public class AtividadeString {
    public static void main(String[] args) {

//        1 — Peça o nome completo da pessoa e mostre quantas letras ele tem (contando os espaços).

        String name;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu nome completo: ");
        name = sc.nextLine();

        System.out.println("Temos " + name.length() + " letras");

//        2 — Peça o nome da pessoa e mostre ele todo em MAIÚSCULO e todo em minúsculo.

        System.out.println("Informe seu nome: ");
        name = sc.nextLine();

        System.out.println(name.toUpperCase());

//        3 — Peça o nome da pessoa e mostre a primeira letra dele.

        System.out.println("Informe seu nome: ");
        name = sc.nextLine();
        System.out.println("A primeira letra do seu nome é: " + name.charAt(0));

//        4 — Peça uma frase e uma palavra. Diga se a palavra aparece dentro da frase.

        String sentence;
        String word;

        System.out.println("Informe uma frase: ");
        sentence = sc.nextLine();
        System.out.println("Informe uma palavra: ");
        word = sc.nextLine();

        if(sentence.contains(word)){
            System.out.println("A palavra " + word + " existe em '" + sentence + "'");
        }else{
            System.out.println("A palavra informada não existe na frase enviada!");
        }

//        5 — Peça o nome da pessoa duas vezes e diga se os dois são iguais, ignorando maiúsculas e minúsculas.

        String name1;
        String name2;

        System.out.println("Informe seu nome: ");
        name1 = sc.nextLine();
        System.out.println("Informe seu nome novamente");
        name2 = sc.nextLine();

        if(name1.equalsIgnoreCase(name2)){
            System.out.println("Os nomes " + name1 + " " + name2 + " são iguais");
        }else{
            System.out.println("Os nomes não são iguais");
        }
    }
}
