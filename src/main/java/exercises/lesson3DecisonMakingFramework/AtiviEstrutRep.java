package exercicios.aula3EstruturasDeDecisao;

public class AtiviEstrutRep {
    public static void main(String[] args) {
//        1 - Mostre os números de 1 a 30, um por linha, usando for.

        for(int i = 1; i <= 30 ; i++){
//            System.out.println(i);
        }

//        2 - Mostre a contagem regressiva de 10 até 1 e depois a palavra "Fim!".

        for(int i = 10 ; i <= 10 && i >= 1  ; i--){
//            System.out.println(i);
                if(i == 1){
//                    System.out.println("Fim!");
                }
        }

//        3 - Faça o mesmo do exercício 1, agora usando while. Compare os dois códigos.
        int num = 1;
        while(num <= 30){
//            System.out.println(num);
            num++;
        }

//         Crie uma variável com um número e mostre a tabuada dele de 1 a 10.

        int multiplication = 3;

        for(int i = 1 ; i <= 10 ; i++){
            System.out.println(multiplication + " x " + i + " = " + (multiplication * i));
        }
    }
}
