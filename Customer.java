public class Customer {
  public static void main(String[] args) {
    // test for #1
    BankAccount B1 = new BankAccount(5213452, "12345");

    //Test for #2
    System.out.println(B1.getBalance());
    System.out.println(B1.getAccountID());

    //Test for #3
    B1.setPassword("banana");

    //Test for #4a
    System.out.println(B1.deposit(200));
    System.out.println(B1.getBalance());
    System.out.println(B1.deposit(-100));
    System.out.println(B1.getBalance());

    //Test for #4b
    System.out.println(B1.withdraw(201));
    System.out.println(B1.getBalance());
    System.out.println(B1.withdraw(-200));
    System.out.println(B1.getBalance());
    System.out.println(B1.withdraw(200));
    System.out.println(B1.getBalance());

    //Test for 5
    B1.deposit(200.1283);
    System.out.println(B1.toString());

    System.out.println(B1.authenticate("banana"));
    System.out.println(B1.authenticate("banona"));

  }
}
