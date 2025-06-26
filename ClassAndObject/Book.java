import java.util.Scanner;

public class Book {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter title:");
        String title = sc.nextLine();
        
        System.out.print("enter author:");
        String author = sc.nextLine();
        
        System.out.print("enter price:");
        double price = sc.nextDouble();

        BookDetails book = new BookDetails(title, author, price);
        book.displayDetails();

        sc.close();
    }
}
class BookDetails{
    String title;
    String author;
    double price;

    // Constructor
    public BookDetails(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayDetails() {

        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : " + price);
    }
}
