package question2;

public class CustomerAccount {
    String cusName;
    long accNum;
    double accBalance;

    public CustomerAccount(String cusName, long accNum, double accBalance) {
        this.cusName = cusName;
        this.accNum = accNum;
        this.accBalance = accBalance;
    }

    public boolean deposit(double amount) {
        if (amount <= 0) return false;
        accBalance += amount;
        return true;
    }
    public boolean withdraw(double amount) throws AccountException {
        if (amount <= 0) return false;
        else if (amount > accBalance) {
            throw new AccountException("Insufficient balance. Current balance: $" + accBalance + ", Attempted withdrawal: $" + amount);
        } else {
            if ((accBalance - amount) < 100) throw new AccountException("Balance cannot go below $100 after withdrawal. Current balance: $" + accBalance + ", Attempted withdrawal: $" + amount);
            accBalance -= amount;
            return true;
        }
    }

    public double getBalance() {
        return accBalance;
    }

    public static void main(String[] args) {
        try {
            CustomerAccount account1 = new CustomerAccount("Test customer", 4567890, 300.0);

            System.out.println("Initial Balance: " + account1.getBalance());
            account1.deposit(100.0); // successful deposit
            account1.withdraw(1000.0); // This brings insufficient balance
            account1.withdraw(100.0); // successful withdraw
            System.out.println("Balance: " + account1.getBalance());
            account1.withdraw(250.0); // Low balance below 100
            System.out.println(account1.getBalance());
        } catch (AccountException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
