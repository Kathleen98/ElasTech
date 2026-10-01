package org.example.exercicios.estruturasDeDecisao;

public class EstrutDecisao {

    public static void main(String[] args) {

        //    1 — Crie uma variável idade e mostre a categoria de uma pessoa: menos de 13 anos é "Criança", de 13 a 17 é "Adolescente", de 18 a 59 é "Adulto" e 60 ou mais é "Idoso".

        int age = 90;

        if(age < 13){
            System.out.println("Criança");
        }else if(age >= 13 && age <= 17){
            System.out.println("Adolescente");
        }else if(age >= 18 && age <= 59){
            System.out.println("Adulto");
        }else{
            System.out.println("Idoso");
        }

        //2 — Crie variáveis para o saldo da conta (R$ 500.00) e o valor de uma compra (R$ 320.00). Se o saldo for suficiente, mostre "Compra aprovada!" e o saldo restante. Se não for, mostre "Saldo insuficiente" e quanto está faltando.

        double balance = 500.00;
        double purchase = 320.00;

        if(balance - purchase >= 0){
            System.out.println("Compra aprovada! Saldo restante : R$ " + (balance - purchase));
        }else{
            System.out.println("Saldo insuficiente, valor pendente: R$ " + (purchase - balance));
        }


//      3 — Crie uma variável opcao com um número de 1 a 4 e, usando switch, mostre o pedido escolhido no cardápio: 1 é Café, 2 é Cappuccino, 3 é Chocolate quente e 4 é Chá. Qualquer outro número mostra "Opção inválida".

        int option = 5;

        switch (option){
            case 1 :
                System.out.println("Café");
                break;
            case 2 :
                System.out.println("Capuccino");
                break;
            case 3:
                System.out.println("Chocolate quente");
                break;
            case 4:
                System.out.println("Chá");
                break;
            default:
                System.out.println("Opção inválida");
        }

//      4 — Crie variáveis idade (17) e temAutorizacao (true). Mostre se a pessoa pode entrar na festa: precisa ter 18 anos ou ter autorização. Faça o mesmo para precisa ter 18 anos e ter autorização.

        int age2 = 17;
        boolean isAuthorization = true;

        if(age2 >= 18 || isAuthorization){
            System.out.println("Pode entrar na festa, tem idade ou autorização");
        }else if(age2 >= 18 && isAuthorization){
            System.out.println("Pode entrar na festa, tem idade e autorização");
        }

//      Desafio: Crie variáveis para três notas de uma aluna. Calcule a média e mostre: "Aprovada" se for 7 ou mais, "Recuperação" entre 5 e 6.9, e "Reprovada" abaixo de 5. Mostre também a média na tela. Valores: nota1 = 5.3, nota2 = 7.8 , nota3 = 4.5.

        double score1 = 2;
        double score2 = 4.5;
        double score3 = 6;
        double media = (score1 + score2 + score3 ) / 3;

        if(media >= 7){
            System.out.printf("Aprovado! Sua média é : %.2f", media);
        } else if (media >= 5 && media <= 6.9) {
            System.out.printf("Recuperação! Sua média é : %.2f", media);
        }else if(media < 5){
            System.out.printf("Reprovada! Sua média é : %.2f", media);
        }

    }


}
