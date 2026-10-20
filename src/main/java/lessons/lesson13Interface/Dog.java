package lessons.lesson13Interface;

public class Dog implements Animal {
//  Crie uma interface Animal com o método emitirSom().
//   Crie a classe Cachorro que implementa ela e imprime "Au au!".
//   Na Main, crie um cachorro e chame o método. Não esqueça do @Override.


    @Override
    public void makeSound() {
        System.out.println("Au au!");
    }
}
