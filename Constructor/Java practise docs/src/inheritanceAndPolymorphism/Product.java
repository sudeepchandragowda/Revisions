package inheritanceAndPolymorphism;

public class Product {
    int id;
    String name;
    int quantity = 10;
    int price = 100;

    public Product(int id, String name, int quantity, int price) {
        this(id, name, quantity);
        this.price = price;
    }

    public Product(int id, String name, int quantity) {
        this(id, name);
        this.quantity = quantity;
    }

    public Product(int id, String name) {
        this(id);
        this.name = name;
    }

    public Product(int id) {
        this.id = id;
    }

    public final static int pricePerEach(int quantity, int price) {
        int pricePerEach = price/quantity;
        return pricePerEach;
    }
}
