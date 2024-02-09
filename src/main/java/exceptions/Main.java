package exceptions;

// Main class
public class Main {
    public static void main(String[] args) {
        // Create a BankAccount instance with initial balance
        BankAccount account = new BankAccount(1000);

        // Demonstrate scenarios: successful withdrawal, attempting to withdraw more money than the account balance,
        // attempting to withdraw a negative amount
        try {
            // Scenario 1: Successful withdrawal
            account.withdraw(500);

            // Scenario 2: Attempting to withdraw more money than the account balance
            account.withdraw(800);
        } catch (InsufficientFundsException e) {
            // Catch and handle insufficient funds exception
            System.out.println("Error: " + e.getMessage());
        } catch (InvalidWithdrawalException e) {
            // Catch and handle invalid withdrawal exception
            System.out.println("Error: " + e.getMessage());
        }

        try {
            // Scenario 3: Attempting to withdraw a negative amount
            account.withdraw(-200);
        } catch (InvalidWithdrawalException e) {
            // Catch and handle invalid withdrawal exception
            System.out.println("Error: " + e.getMessage());
        } catch (InsufficientFundsException e) {
            throw new RuntimeException(e);
        }
    }
}
