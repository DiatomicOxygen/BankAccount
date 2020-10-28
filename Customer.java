public class Customer {
  public static void main(String[] args) {
    BankAccount B1 = new BankAccount(1, "12345");
    System.out.println(B1.getBalance());
    System.out.println(B1.getID());
    B1.setPassword("banana");
    System.out.println(B1.deposit(200));
    System.out.println(B1.getBalance());
    System.out.println(B1.deposit(-100));
    System.out.println(B1.getBalance());
  }
}
