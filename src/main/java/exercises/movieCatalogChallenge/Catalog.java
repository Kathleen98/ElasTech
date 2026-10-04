package exercises.movieCatalogChallenge;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Catalog {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Movie[]  movies = new Movie[5];
        int total = 0;
        int option = 0;

        while(option != 5){
            System.out.println("\n=== MEU CATÁLOGO ===");
            System.out.println("1 - Cadastrar filme");
            System.out.println("2 - Listar filmes");
            System.out.println("3 - Buscar por título");
            System.out.println("4 - Estatísticas");
            System.out.println("5 - Sair");
            System.out.print("Escolha: ");

            try{

                option = sc.nextInt();
                sc.nextLine();
            }catch(InputMismatchException e){
                sc.nextLine();
                System.out.println("Digite apenas números!");
                continue;
            }

            switch (option) {
                case 1:
                    if(total == movies.length){
                        System.out.println("Catálogo cheio! Não cabemais nenhum filme");
                    }else{
                        movies[total] = new Movie();

                        System.out.println("Título");
                        movies[total].title = sc.nextLine();

                        System.out.println("Gênero");
                        movies[total].gender = sc.nextLine().toUpperCase();

                        System.out.println("Nota (0 a 10)");
                        movies[total].note = sc.nextDouble();
                        sc.nextLine();

                        movies[total].classification = classifies(movies[total].note);
                        total ++;

                        System.out.println("Filme cadastrado!");
                    }
                    break;
                case 2:
                    if(total == 0){
                        System.out.println("Nenhum filme cadastrado ainda");
                    }else{
                        for(int i = 0 ; i < total ; i ++){
                            System.out.printf("%s [%s] = Nota %.1f - %s%n",
                                    movies[i].title, movies[i].gender, movies[i].note, movies[i].classification
                            );
                        }
                    }
                    break;
                case 3:
                    System.out.print("Título para buscar: ");
                    String busca = sc.nextLine();
                    boolean achou = false;
                    for (int i = 0; i < total; i++) {
                        if (movies[i].title.equalsIgnoreCase(busca)) {
                            System.out.printf("%s [%s] - Nota %.1f - %s%n",
                                    movies[i].title, movies[i].gender,
                                    movies[i].note, movies[i].classification);
                            achou = true;
                            break;
                        }
                    }
                    if (!achou) {
                        System.out.println("Filme não encontrado.");
                    }
                    break;
                case 4:
                    if (total == 0) {
                        System.out.println("Cadastre algum filme primeiro.");
                    } else {
                        double soma = 0;
                        int melhor = 0;
                        int otimos = 0;
                        for (int i = 0; i < total; i++) {
                            soma += movies[i].note;
                            if (movies[i].note <= movies[melhor].note) {
                                melhor = i;
                            }
                            if (movies[i].classification.equals("Ótimo")) {
                                otimos++;
                            }
                        }
                        System.out.println("Total de filmes: " + total);
                        System.out.printf("Média das notas: %.2f%n", soma / total);
                        System.out.println("Melhor filme: " + movies[melhor].title);
                        System.out.println("Filmes ótimos: " + otimos + " de " + total);
                    }
                    break;
                case 5: System.out.println("Até a próxima sessão de cinema!"); break;
                default: System.out.println("Opção inválida");
            }
        }

        sc.close();


    }

    public static String classifies(double rating){
        if(rating >= 8){
            return "Ótimo";
        }else if(rating >= 5){
            return "Bom";
        }else{
            return "Ruim";
        }
    }
}
