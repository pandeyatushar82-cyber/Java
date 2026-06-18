class BankAccount {

    private double balance = 1000;

    public void withdraw(double amount) {

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Remaining Balance: "
                    + balance);
        }

        else {
            System.out.println("Invalid Withdrawal");
        }
    }
}

