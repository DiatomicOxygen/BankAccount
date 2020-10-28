public class Customer {
  public static void main(String[] args) {
    BankAccount B1 = new BankAccount(5213452, "12345");
    //System.out.println(B1.getBalance());
    //System.out.println(B1.getAccountID());
    //B1.setPassword("banana");
    //System.out.println(B1.deposit(200));
    //System.out.println(B1.getBalance());
    //System.out.println(B1.deposit(-100));
    //System.out.println(B1.getBalance());
    //System.out.println(B1.withdraw(201));
    //System.out.println(B1.getBalance());
    //System.out.println(B1.withdraw(-200));
    //System.out.println(B1.getBalance());
    //System.out.println(B1.withdraw(200));
    //System.out.println(B1.getBalance());
    B1.deposit(200.1283);
    System.out.println(B1.toString());


  }
}
