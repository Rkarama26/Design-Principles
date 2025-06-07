package solid;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class Product {

    public  String name;
    public double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

}

//Violating SRP: ShoppingCart is handling multiple responsibilities-----
//
//class ShoppingCart {
//
//    private List<Product> product = new ArrayList<>();
//
//
//    // add product
//    public void addproduct(Product p){
//        product.add(p);
//    }
//    // return product
//    public List<Product> getProducts(){
//        return product;
//    }
//
//    // calculate total price in cart
//    double calculateTotal(){
//
//        return product.stream()
//                .mapToDouble(Product::getPrice).sum();
//
//    }
//
//    void printInvoice(){
//        System.out.println("Shopping cart Invoice");
//        product.forEach(p -> System.out.println(p.getName()+ " && " + p.getPrice()));
//    }
//
//    void saveToDB(){
//        System.out.println("saving to database...........!");
//    }
//
//
//    public static void main(String[] args) {
//
//        ShoppingCart cart = new ShoppingCart();
//
//        cart.addproduct(new Product("LAPTOP", 56789));
//        cart.addproduct(new Product("MOBILE", 7999));
//
//        cart.printInvoice();
//        cart.saveToDB();
//
//    }
// }

// Now following SRP
class ShoppingCart {
    private List<Product> products = new ArrayList<>();

    void addProduct(Product p){
        products.add(p);
    }
    List<Product> getProducts(){

        return products;
    }
}