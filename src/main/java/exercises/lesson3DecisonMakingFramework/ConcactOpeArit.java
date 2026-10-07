package exercises.lesson3DecisonMakingFramework;

public class ConcactOpeArit {

    public static void main(String[] args) {

//      1- Crie variáveis para um nome, uma cidade e uma idade. Mostre em uma única linha: "Meu nome é Ana, moro em Salvador e tenho 28 anos."

        String name = "Kathleen";
        String city = "Jundiaí";
        int age = 28;

        System.out.println("Meu nome é " + name + ", moro em " + city + " e tenho " + age + " anos");


//       2 — Crie variáveis para o nome de um produto ("Caneca"), o preço (12.50) e a quantidade (4). Mostre: "Comprei 4
//       unidades de Caneca por R$ 12.5 cada. Total: R$ 50.0"

        String product = "Caneca";
        double price = 12.50;
        int quantity = 4;

        System.out.println("Comprei " + quantity + " unidades de " + product + "por R$ " + price + " cada. Total: R$ " + quantity * price);

//      3- Crie duas variáveis com números inteiros. Mostre a soma em uma frase completa, assim: "A soma de 15 e 4 é igual a 19."

        int num1 = 4;
        int num2 = 7;

        System.out.println("A soma de " + num1 + " e " + num2 + " é igual a " + (num1 + num2));

    }

}
