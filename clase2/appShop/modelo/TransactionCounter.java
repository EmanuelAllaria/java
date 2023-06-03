import java.util.Random;

public class TransactionCounter {
    private static final int MAX_TRANSACTION_ID = 10000;

    public static int getNextTransactionId() {
        Random random = new Random();
        return random.nextInt(MAX_TRANSACTION_ID);
    }
}
