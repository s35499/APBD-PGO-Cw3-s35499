public class Main {
  public static void main(String[] args) {
    MenuItem coffee1 = new MenuItem("1", "Espresso", 29.99, "coffee");
    MenuItem coffee2 = new MenuItem("2", "Cappuccino", 13.99, "coffee");
    MenuItem dessert = new MenuItem("3", "Cheesecake", 37.99, "dessert");

    Client client = new Client(1, "Adam", "Smith", "adam@mail.com");

    Order order = new Order(client);
    order.addItem(coffee1);
    order.addItem(coffee2);
    order.addItem(dessert);

    System.out.println(client);
    System.out.println(order);

    System.out.println("Total: " + order.totalPrice());
    System.out.println("Items: " + order.itemCount());
    System.out.println("Created products: " + MenuItem.getCount());

    MenuItem duplicate = new MenuItem("1", "Espresso copy", 9.0, "coffee");
    System.out.println("Equal? " + coffee1.equals(duplicate));

    order.markPaid();

    System.out.println(order);
  }
}