import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private float price;
    private int availability;

    public Book(String title, String author, float price, int availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public float getPrice() {
        return price;
    }

    public int getAvailability() {
        return availability;
    }

    public void decrementAvailability(int quantity) {
        availability -= quantity;
    }

    public void incrementAvailability(int quantity) {
        availability += quantity;
    }
}

class Customer {
    private String customer_id;
    private String name;
    private String email;
    private ArrayList<Book> shopping_cart;
    private ArrayList<Order> order_history;

    public Customer(String customer_id, String name, String email) {
        this.customer_id = customer_id;
        this.name = name;
        this.email = email;
        this.shopping_cart = new ArrayList<>();
        this.order_history = new ArrayList<>();
    }

    public String getCustomerId() {
        return customer_id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void add_to_cart(Book book) {
        if (book.getAvailability() > 0) {
            shopping_cart.add(book);
            book.decrementAvailability(1);
        } else {
            System.out.println("Sorry, the book is not available.");
        }
    }

    public void remove_from_cart(Book book) {
        if (shopping_cart.remove(book)) {
            book.incrementAvailability(1);
        }
    }

    public void display_cart() {
        System.out.println("Shopping Cart for " + name + ":");
        for (Book book : shopping_cart) {
            System.out.println("Book Title: " + book.getTitle());
        }
    }

    public void checkout() {
        if (shopping_cart.isEmpty()) {
            System.out.println("Your shopping cart is empty. Please add books to your cart before checking out.");
            return;
        }

        double total_price = 0;
        for (Book book : shopping_cart) {
            total_price += book.getPrice();
        }

        order_history.add(new Order(total_price));
        shopping_cart.clear();
        System.out.println("Thank you for your purchase!");
    }

    public void display_order_history() {
        System.out.println(name + "'s Order History:");
        for (Order order : order_history) {
            System.out.println("Total Price: $" + order.getTotalPrice());
        }
    }
}

class Order {
    private double total_price;

    public Order(double total_price) {
        this.total_price = total_price;
    }

    public double getTotalPrice() {
        return total_price;
    }
    
}

