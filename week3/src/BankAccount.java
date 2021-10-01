package week3.src;
//overload --> when you create functions with a same name different parameters

//override --> you keep a same function with same parameters (header) but
// you may change the body of that function.

public class BankAccount {
    private double balance;
    private String type;
    private String bank;
    private String accHolder;

    // overload the constructor
    public BankAccount(double balance, String type, String bank, String accHolder) {
        this.balance = balance;
        this.type = type;
        this.bank = bank;
        this.accHolder = accHolder;

    }

    public BankAccount(String bank, String accHolder) {
        balance = 0;
        type = "chequing";
        this.bank = bank;
        this.accHolder = accHolder;

    }

    public double getBalance() {
        return balance;
    }

    public String getType() {
        return type;
    }

    public String getBank() {
        return bank;
    }

    public String getAccHolder() {
        return accHolder;
    }

    public void withdraw(double amount) {
        balance -= amount;

    }

    public void deposit(double amount) {
        balance += amount;
    }

    public String toString() {
        return "\nBankAccount\n" + "Balance: " + balance + "\nType: " + type + "\nBank: " + bank + "\nAccount Holder: "
                + accHolder;
    }
}
