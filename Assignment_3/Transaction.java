import java.util.Date;

public class Transaction {
    String transactionType;
    double amount;
    String description;
    Date transactionDate;

    public Transaction(String tr_type, double amnt, String des, Date tr_date) {
        transactionType = tr_type;
        amount = amnt;
        description = des;
        transactionDate = tr_date;
    }


}
