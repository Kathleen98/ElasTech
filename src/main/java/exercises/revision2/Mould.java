package exercises.revision2;

abstract class Mould {
    String name;

    public Mould(String name){
        this.name = name;
    }

    public void printName(){
        System.out.println(this.name);
    }

    abstract double calcArea();
}
