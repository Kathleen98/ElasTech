package exercicios.aula3EstruturasDeDecisao;

public class Variavel {
    public static void main(String[] args) {
        // Crie uma variável idade e mostre a categoria de uma pessoa: menos de 13 anos é "Criança", de 13 a 17 é "Adolescente",
        // de 18 a 59 é "Adulto" e 60 ou mais é "Idoso

        int age = 12;

        if(age < 13){
            System.out.println("Child");
        }else if(age >= 13 && age <= 17){
            System.out.println("Teenager");
        }else if(age >= 18 && age <= 59){
            System.out.println("Adult");
        }else{
            System.out.println("Elderly");
        }
    }
}
