import java.util.ArrayList;

class Order {
  private int id;
  private Client client;
  private ArrayList<MenuItem> items;
  private boolean isPaid;

  private static int nextId = 1;

  public Order(Client client) {
    this.id = nextId++;
    this.client = client;
    this.items = new ArrayList<>();
    this.isPaid = false;
  }

  public void addItem(MenuItem item) {
    items.add(item);
  }

  public double totalPrice() {
    double sum = 0;
  
    for (MenuItem item : items) {
      sum += item.getPrice();
    }
  
    return sum;
  }

  public int itemCount() {
    return items.size();
  }

  public void markPaid() {
    isPaid = true;
  }

  @Override
  public String toString() {
    String orderChunk = "Order:" + id;
    String clientChunk = "\nclient: " + client;
    String itemsChunk = "\nitems: " + items.size();
    String paidChunk = "\npaid: " + isPaid;

    return orderChunk + clientChunk + itemsChunk + paidChunk;
  }
}