import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        // бонус: если клиент пополняет счёт более чем на 1000 рублей,
        // то сотовый оператор дарит ему по 1 рублю за каждые полные 100 рублей пополнения.

        int AccountBalance;
        int AccountRefill;
        int BonusQuant;
        int BonusThreshold;
        AccountBalance = 100;
        BonusQuant = 100;
        BonusThreshold = 1000;
        AccountRefill = 1100;
        if (AccountRefill <= BonusThreshold) {
            AccountBalance = AccountBalance + AccountRefill;
            System.out.println("Account Refill: " + AccountRefill + " Rub");
            System.out.println("Account Balance: " + AccountBalance + " Rub");
        } else {
            AccountBalance = AccountBalance + AccountRefill + AccountRefill / BonusQuant;
            System.out.println("Account Refill: " + AccountRefill + " Rub");
            System.out.println("Account Balance: " + AccountBalance + " Rub");
        }
    }
}