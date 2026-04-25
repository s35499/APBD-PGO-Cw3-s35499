public class Main {
    public static void main(String[] args) {
        System.out.println("Creating menu items...");
        System.out.println();

        MenuItem espresso = new MenuItem("1", "Espresso", 29.99, "coffee");
        MenuItem cappuccino = new MenuItem("2", "Cappuccino", 13.99, "coffee");
        MenuItem dessert = new MenuItem("3", "Cheesecake", 37.99, "dessert");

        System.out.println("Menu items created: " + MenuItem.getCount());
        System.out.println();

        System.out.println("Creating client...");
        System.out.println();

        Client client = new Client(1, "Adam", "Smith", "adam@mail.com");

        System.out.println(client);
        System.out.println();

        System.out.println("Creating order...");
        System.out.println();

        Order order = new Order(client);

        System.out.println("Adding items to order...");
        System.out.println();

        order.addItem(espresso);
        order.addItem(cappuccino);
        order.addItem(dessert);

        System.out.println("Order created successfully!");
        System.out.println();

        System.out.println("Order summary ...");
        System.out.println();

        System.out.println(order);
        System.out.println();

        System.out.println("Calculating ...");
        System.out.println();

        System.out.println("Total price: " + order.totalPrice());
        System.out.println("Items count: " + order.itemCount());
        System.out.println();

        System.out.println("Equality check ...");
        System.out.println();

        MenuItem duplicate = new MenuItem("1", "Espresso copy", 9.0, "coffee");

        System.out.println("Espresso equals duplicate? " + espresso.equals(duplicate));
        System.out.println();

        System.out.println("Finalizing order ...");
        System.out.println();

        order.markPaid();

        System.out.println("Order after payment:");
        System.out.println();

        System.out.println(order);
    }
}
