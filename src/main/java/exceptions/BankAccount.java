package exceptions;

// Custom exception for insufficient funds
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// Custom exception for invalid withdrawal amount
class InvalidWithdrawalException extends Exception {
    public InvalidWithdrawalException(String message) {
        super(message);
    }
}

// BankAccount class
class BankAccount {
    private double balance;

    // Constructor to initialize the balance
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Method to withdraw money
    public void withdraw(double amount) throws InsufficientFundsException, InvalidWithdrawalException {
        // Check if the withdrawal amount is negative
        if (amount < 0) {
            throw new InvalidWithdrawalException("Withdrawal amount cannot be negative");
        }

        // Check if there are sufficient funds
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds for withdrawal");
        }

        // Perform the withdrawal
        balance -= amount;
        System.out.println("Withdrawal of $" + amount + " successful. Remaining balance: $" + balance);
    }
}



