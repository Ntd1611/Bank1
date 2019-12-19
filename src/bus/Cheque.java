package bus;

import java.util.List;

public class Cheque extends Account {
    public Cheque() {
        super();
    }

    public Cheque(int PIN, double balance, double interest, int accountNumber, AccountType type, Date dateOpen, Customer customer, List<Transaction> transactionList) {
        super(PIN, balance, interest, accountNumber, type, dateOpen, customer, transactionList);
    }

    @Override
    public String toString() {
        String message = "";
        if(this.getTransactionList().size() > 4) {
            message += super.toString() + "\n You exceed your free transactions per month" + this.calculateExceedFees(super.getTransactionList().size());
        }
        else {
            message += super.toString();
        }
        return message;
    }

}
