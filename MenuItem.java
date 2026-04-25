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
}