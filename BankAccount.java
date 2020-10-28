public class BankAccount {

    private double balance = 0.0;
    private int accountID = 0;
    private String password = "";

    public BankAccount(int newID, String newPassword) {
      accountID = newID;
      password = newPassword;
    }

    public double getBalance() {
      return balance;
    }

    public int getID() {
      return accountID;
    }

    public void setPassword(String newPassword) {
      password = newPassword;
    }

    //temporary method to test if setPassword works
    public String getPassword() {
      return password;
    }

}
