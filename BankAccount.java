public class BankAccount {

    //Instance Variables
    private double balance = 0.0;
    private int accountID = 0;
    private String password = "";

    //Constructor (#1)
    public BankAccount(int newID, String newPassword) {
      accountID = newID;
      password = newPassword;
    }

    //getBalance and getAccountID (#2)
    public double getBalance() {
      return balance;
    }

    public int getAccountID() {
      return accountID;
    }

    //setPassword (#3)
    public void setPassword(String newPassword) {
      password = newPassword;
    }

    //deposit method (#4a)
    public boolean deposit (double amount) {
      if (amount < 0) {
        return false;
      }
      balance += amount;
      return true;
    }

    //withdraw method (#4b)
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

    //toString method (#5)
    public String toString() {
      return "#" + accountID + "\t$" + balance;
    }


    private boolean authenticate(String password) {
      return this.password.equals(password);
    }

    public boolean transferTo(BankAccount other, double amount, String password) {
      if (authenticate(password)) {
        if (this.withdraw(amount) && other.deposit(amount)) {
          return true;
        }
        return false;
      }
      return false;
    }


}
