class SavingsAccount extends Bank {
    double limit;

    SavingsAccount(String a, double b, double l) {
        this.account = a;
        this.balance = b;
        this.limit = l;
    }

    public void CreditAmount(double b) {
        this.balance += b;
    }

    public void calculateInterest(double interestRate) {
        this.balance += this.balance * interestRate;
    }
}