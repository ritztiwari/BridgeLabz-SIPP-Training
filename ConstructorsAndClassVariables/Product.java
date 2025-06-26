public class Product {
    // Instance Variables
    private String productName;
    private double price;

    // Class Variable
    private static int totalProducts = 0;

    // Constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;  // Increment totalProducts whenever a new product is created
    }

    // Instance Method
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
    }

    // Class Method
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

    // Main method to test
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 1500.00);
        Product p2 = new Product("Smartphone", 800.00);
        Product p3 = new Product("Headphones", 150.00);

        p1.displayProductDetails();
        p2.displayProductDetails();
        p3.displayProductDetails();

        Product.displayTotalProducts();  // Calling class method using class name
    }
}
