class MenuItem {
  private String code;
  private String name;
  private double price;
  private String category;

  private static int count = 0;

  public MenuItem(String code, String name, double price, String category) {
    this.code = code;
    this.name = name;
    this.price = price;
    this.category = category;

    count++;
  }

  public String getCode() {
    return code;
  }

  public double getPrice() {
    return price;
  }

  public static int getCount() {
    return count;
  }

  @Override
  public String toString() {
    return name + " (" + code + ") - " + price + " PLN";
  }

  @Override
  public boolean equals(Object obj) {
    MenuItem other = (MenuItem) obj;
    
    return this.code.equals(other.code);
  }
}