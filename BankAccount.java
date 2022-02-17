import java.text.DecimalFormat;
import java.util.Random;
/**
 * BankAccount
 */
class BankAccount {

    private String idAccount;
    private double checkingAccount;
    private double savingsAccount;
    private static double totalOfBankAccount;
    private static int numberOfAccounts;

    public BankAccount() {
        idAccount = getRandomId();
        totalOfBankAccount = checkingAccount + savingsAccount;
        numberOfAccounts++;
    }

    // getter for idAccount
    public String getIdAccount() {
        return idAccount;
    }

    // getter for checkingAccount
    public double getCheckingAccount() {
        return checkingAccount;
    }

    // getter for savingsAccount
    public double getSavingsAccount() {
        return savingsAccount;
    }

    // getter for totalPerAccount
    public static double getTotalOfBankAccount() {
        return totalOfBankAccount;
    }

    // getter for numberOfAccounts
    public static int getNumberOfAccounts() {
        return numberOfAccounts;
    }

    public void makeDeposit(String accountType, double depositAmount) {
        if (accountType == "Checking" || accountType == "checking") {
            checkingAccount += depositAmount;
            totalOfBankAccount += depositAmount;
            System.out.println("Deposit made successfully");
        } else if (accountType == "Savings" || accountType == "savings") {
            savingsAccount += depositAmount;
            totalOfBankAccount += depositAmount;
            System.out.println("Deposit made successfully");
        }
    }
    
    public void makeWithdrawal(String accountType, double withdrawalAmount) {
        if (accountType == "Checking" || accountType == "checking") {
            if (withdrawalAmount <= checkingAccount) {
                checkingAccount -= withdrawalAmount;
                totalOfBankAccount -= withdrawalAmount;
                System.out.println("Withdrawal made successfully");
            } else System.out.println("Not enough funds");
        } else if (accountType == "Savings" || accountType == "savings") {
            if (withdrawalAmount <= savingsAccount) {
                savingsAccount -= withdrawalAmount;
                totalOfBankAccount -= withdrawalAmount;
                System.out.println("Withdrawal made successfully");
            } else System.out.println("Not enough funds");
        }
    }

    public void displayBankAccount() {
        DecimalFormat frmtDouble = new DecimalFormat("$###,###");
        System.out.println("Saldo en la cuenta corriente: " + frmtDouble.format(checkingAccount));
        System.out.println("Saldo en la cuenta de ahorros: " + frmtDouble.format(savingsAccount));
    }

    private int getRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    private String getRandomId() {
        String result = "";
        for (int i = 0; i < 10; i++) {
            result += getRandomNumber(0, 9);
        }
        return result;
    }
}