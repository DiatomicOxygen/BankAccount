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

    public int getAccountID() {
      return accountID;
    }

    public void setPassword(String newPassword) {
      password = newPassword;
    }

    public boolean deposit (double amount) {
      if (amount < 0) {
        return false;
      }
      balance += amount;
      return true;
    }

    public boolean withdraw(double amount) {
      if (amount < 0) {
        return false;
      }
      if (balance - amount < 0) {
        return false;
      }
      balance -= amount;
      return true;
    }

    public String toString() {
      return accountID + "\t" + balance;
    }
}
