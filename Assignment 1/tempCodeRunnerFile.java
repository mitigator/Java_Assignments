public class Bookstore {
    public static void main(String[] args) {
        Book book1 = new Book("Book 1", "Author 1", (float)25.99, 10);
        Book book2 = new Book("Book 2", "Author 2", (float)19.99, 5);

        Customer customer1 = new Customer("2347256", "Shubham Mishra", "shubhammishra@example.com");
        Customer customer2 = new Customer("101", " Customer2", "Customer2@example.com");
        Customer customer3 = new Customer("102", " Customer3", "Customer3@example.com");

        customer1.add_to_cart(book1);
        customer1.add_to_cart(book2);
        customer2.add_to_cart(book2);

        System.out.println(customer1.getName() + "'s Shopping Cart:");
        customer1.display_cart();
        customer1.checkout();
        customer1.display_order_history();

        System.out.println("");
        System.out.println(customer2.getName() + "'s Shopping Cart:");
        customer2.display_cart();
        customer2.checkout();
        customer2.display_order_history();

        System.out.println("");
        System.out.println(customer3.getName() + "'s Shopping Cart:");
        customer3.display_cart();
        customer3.checkout();
        customer3.display_order_history();
       
    }
}
