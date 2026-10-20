package exercises.revision2;

public class Product {
//    Crie uma classe Produto com os atributos privados nome (String), preco (double) e quantidade (int).

    private String productName;
    private double productPrice;
    private int productQuantity;

//    Crie getters e setters para todos os atributos.

    public String getProductName(){
        return this.productName;
    }

    public double getProductPrice(){
        return this.productPrice;
    }

    public int getProductQuantity(){
        return this.productQuantity;
    }

    public void setProductName(String name){
        this.productName = name;
    }

    public void setProductPrice(double price){
//        O setter de preco não deve aceitar valores menores ou iguais a zero.
        if(price > 0){
            this.productPrice = price;
        }else{
            System.out.println("Product price cannot be negative");
        }
    }

    public void setProductQuantity(int quantity){
//        O setter de quantidade não deve aceitar valores negativos.
        if(quantity < 0){
            System.out.println("Product quantity cannot be negative");
        }else{
            this.productQuantity = quantity;
        }
    }

}
