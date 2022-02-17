/**
 * TestBankAccount
 */
public class TestBankAccount {
    public static void main(String[] args) {

        // Simulaciones de la aplicación

        // Prueba creación de instancias y mostrar numberOfAccounts de la clase
        BankAccount bankAccount1 = new BankAccount();
        BankAccount bankAccount2 = new BankAccount();
        BankAccount bankAccount3 = new BankAccount();
        System.out.println("\n----- Prueba creación de instancias y mostrar numberOfAccounts de la clase -----");
        System.out.println("Bank Account 1: " + bankAccount1);
        System.out.println("Bank Account 2: " + bankAccount2);
        System.out.println("Bank Account 3: " + bankAccount3);
        System.out.println("La Clase BankAccount tiene: " + BankAccount.getNumberOfAccounts() + " instancias.");
        
        // Prueba hacer depósito en la cuenta corriente de bankAccount1
        System.out.println("\n----- Prueba hacer depósito en la cuenta corriente de bankAccount1 -----");
        bankAccount1.makeDeposit("checking", 2000);
        
        // Prueba hacer depósito en la cuenta de ahorros de bankAccount1
        System.out.println("\n----- Prueba hacer depósito en la cuenta de ahorros de bankAccount1 -----");
        bankAccount1.makeDeposit("savings", 3000);

        // Prueba hacer retiro en la cuenta corriente de bankAccount1
        System.out.println("\n----- Prueba hacer depósito en la cuenta corriente de bankAccount1 -----");
        bankAccount1.makeWithdrawal("checking", 3000);
        bankAccount1.makeWithdrawal("checking", 1000);

        // Prueba hacer retiro en la cuenta de ahorros de bankAccount1
        System.out.println("\n----- Prueba hacer depósito en la cuenta de ahorros de bankAccount1 -----");
        bankAccount1.makeWithdrawal("savings", 4000);
        bankAccount1.makeWithdrawal("savings", 2000);

        // Prueba ver dinero total en la cuenta corriente y de ahorros de bankAccount1
        System.out.println("\n----- Prueba ver dinero total en la cuenta corriente y de ahorros de bankAccount1 -----");
        bankAccount1.displayBankAccount();
        
        // Prueba ver dinero toal en bankAccount1
        System.out.println("\n----- Prueba ver dinero toal en la clase (totalOfBankAccount) -----");
        System.out.println(BankAccount.getTotalOfBankAccount());

        // Prueba ver Id de bankaccount1
        System.out.println("\n----- Prueba ver Id de bankaccount1 -----");
        System.out.println(bankAccount1.getIdAccount());
    }
}