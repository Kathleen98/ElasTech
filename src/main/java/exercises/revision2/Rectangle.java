package exercises.revision2;

class Rectangle extends Mould  {
    private double length;
    private double width;

    public Rectangle(String name){
        super(name);
    }

    public double calcArea() {
        return length * width;
    }
}
