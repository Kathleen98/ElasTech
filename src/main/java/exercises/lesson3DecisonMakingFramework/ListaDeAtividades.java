package exercises.lesson3DecisonMakingFramework;

import java.util.Scanner;

public class ListaDeAtividades {
    public static void main(String[] args) {

//      1 - Crie um programa que peça ao usuário para digitar o nome de um lanche e o valor dele. Em seguida, verifique: se o valor for maior que R$ 30.00, aplique um desconto de R$ 5.00. No final, exiba uma mensagem usando               concatenação e printf para formatar o preço com duas casas decimais.
//      Exemplo de saída: "O lanche Xis-Bacon custa R$ 28.50 \n"


        String name;
        double price;

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o nome do lanche: ");
        name = sc.nextLine();
        System.out.println("Informe o valor do lanche: ");
        price = sc.nextDouble();

        if(price > 30.00){
            price = price - 5.00;
        }

        System.out.printf("");



    }
}
