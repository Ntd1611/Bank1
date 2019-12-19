package bus;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public abstract class Account implements Serializable, IPayable {
    private int PIN;
    private double balance = 0;
    private double interest = 0.02;
    private int accountNumber;
    private static int numberOfAccounts = 0;
    private AccountType type;
    private Date DateOpen;
    private Customer customer;
    private List<Transaction> transactionList;


    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) { this.balance = balance; }

    public double getInterest() {
        return interest;
    }
    public void setInterest(double interest) {
        this.interest = interest;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) { this.accountNumber = accountNumber; }

    public AccountType getType() { return type; }
    public void setType(AccountType type) { this.type = type; }

    public Date getDateOpen() { return DateOpen; }
    public void setDateOpen(Date dateOpen) { DateOpen = dateOpen; }

    public Customer getCustomer() { return customer; }
    public void setCustomer(Customer customer) { this.customer = customer; }

    public List<Transaction> getTransactionList() { return transactionList; }
    public void setTransactionList(List<Transaction> transactionList) { this.transactionList = transactionList; }

    public int getPIN() { return PIN; }
    public void setPIN(int PIN) { this.PIN = PIN;}


    public Account() {
        this.balance = 0;
        this.interest = 0;
        this.accountNumber = 0;
        this.type = AccountType.Default;
        DateOpen = new Date();
        this.customer = new Customer();
        this.transactionList = new ArrayList<Transaction>();
        this.PIN = 0;
    }

    public Account(int PIN, double balance, double interest, int accountNumber, AccountType type, Date dateOpen, Customer customer, List<Transaction> transactionList) {
        this.PIN = PIN;
        this.balance = balance;
        this.interest = interest;
        this.accountNumber = accountNumber;
        this.type = type;
        DateOpen = dateOpen;
        this.customer = customer;
        this.transactionList = transactionList;
    }

    public void withdraw(double amount) {
        if(amount + 5 > balance) { // 5 dollar fee
            System.out.println("You can not withdraw more than your balance");
            return;
        }
        else {
            balance -= amount + 5;
            System.out.println("You have withdrawn: " + amount + "$");
            System.out.println("Your balance now is: " + balance);
        }
    }

    public void deposit(double amount) {
        if(amount < 0) {
            System.out.println("You cannot deposit negative money");
            return;
        }
        amount = amount + amount * interest;
        balance += amount;
        System.out.println("You deposited " + amount + "");
        System.out.println("Your balance is: " + balance + "$");
    }

    @Override
    public double calculateCreditBalance() {
        double withdraw = 0,deposit = 0;

        for(Transaction str : this.getTransactionList()) {
            if(str.getType() == TransactionType.Deposit) {
                deposit += str.getAmount();
            }
            if(str.getType() == TransactionType.Withdraw) {
                withdraw -= str.getAmount();
            }
        }
        return deposit - withdraw;
    }

    @Override
    public double calculateChequeBalance() {
        return 0;
    }

    @Override
    public double calculateSavingBalance() {
        return 0;
    }


    public double calculateExceedFees(int size) {
        double fee =0;
        if(size > 4) {
            for(int i=0; i<this.getTransactionList().size(); i++) {
                fee += 1;
            }
        }
        return  fee;
    }

    @Override
    public String toString() {
        return "Account{" +
                "PIN=" + PIN +
                ", balance=" + balance +
                ", interest=" + interest +
                ", accountNumber=" + accountNumber +
                ", type=" + type +
                ", DateOpen=" + DateOpen +
                ", customer=" + customer +
                ", transactionList=" + transactionList +
                '}';
    }
}
