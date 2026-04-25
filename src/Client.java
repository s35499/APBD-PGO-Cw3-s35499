class Client {
  private int id;
  private String name;
  private String surname;
  private String email;

  public Client(int id, String name, String surname, String email) {
    this.id = id;
    this.name = name;
    this.surname = surname;
    this.email = email;
  }

  public int getId() {
    return id;
  }

  public String getEmail() {
    return email;
  }

  @Override
  public String toString() {
    return name + " " + surname + " (" + email + ")";
  }

  @Override
  public boolean equals(Object obj) {
    Client other = (Client) obj;
    return this.email.equals(other.email);
  }
}