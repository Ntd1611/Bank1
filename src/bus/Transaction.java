package bus;

public class Transaction {

    private int transactionNumber;
    private double amount;
    private TransactionType type;
    private Date transactionDate;
    private String description;

    public int getTransactionNumber() { return transactionNumber; }
    public void setTransactionNumber(int transactionNumber) { this.transactionNumber = transactionNumber; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }

    public TransactionType getType() { return type; }
    public void setType(TransactionType type) { this.type = type; }

    public Date getTransactionDate() { return transactionDate; }
    public void setTransactionDate(Date transactionDate) { this.transactionDate = transactionDate; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public Transaction() {
        this.transactionNumber = 0;
        this.amount = 0;
        this.type = TransactionType.Default;
        this.transactionDate = new Date();
        this.description = "";
    }

    public Transaction(int transactionNumber, double amount, TransactionType type, Date transactionDate, String description) {
        this.transactionNumber = transactionNumber;
        this.amount = amount;
        this.type = type;
        this.transactionDate = transactionDate;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionNumber=" + transactionNumber +
                ", amount=" + amount +
                ", type=" + type +
                ", transactionDate=" + transactionDate +
                ", description='" + description + '\'' +
                '}';
    }
}
