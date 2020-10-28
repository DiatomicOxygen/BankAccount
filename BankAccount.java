public class BankAccount {

    private double balance = 0.0;
    private int accountID = 0;
    private String password = "";

    public BankAccount(int newID, String newPassword) {
      accountID = newID;
      password = newPassword;
    }
}
