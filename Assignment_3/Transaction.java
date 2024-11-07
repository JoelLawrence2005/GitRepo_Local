import java.util.Date;

public class Transaction {
    private String transactionType;
    private double amount;
    private String description;
    private Date transactionDate;

    public Transaction(String tr_type, double amnt, String des, Date tr_date) {
        transactionType = tr_type;
        amount = amnt;
        description = des;
        transactionDate = tr_date;
    }


}
