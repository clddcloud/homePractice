package org.example.e148;

public class E148ThisKeyword {
    public static void main(String[] args) {
        ShoppingStore item1 = new ShoppingStore("Blanket", 99.98, 1);
        ShoppingStore item2 = new ShoppingStore("Mattress", 439.18, 1);
        double totalSum = item1.itemTotalPrice() + item2.itemTotalPrice();
        System.out.println("You purchased " + totalSum + " Today");
    }
}
class ShoppingStore{
    private String item;
    private double price;
    private int quantity;

    public ShoppingStore(String item, double price, int quantity){
        this.item=item;
        this.price=price;
        this.quantity=quantity;
    }
    public double itemTotalPrice (){
        System.out.println(item+" Total Value "+(price*quantity));
        return price*quantity;
    }
}
   