class Bank implements BankAbstract {
    String account;
    double balance;
    
    public void CreditAmount(double b) {
        this.balance += b;
        System.out.println("Updated balance: " + this.balance);
    }

    public void CalculateInterest(double interestRate) {
        this.balance += this.balance * interestRate;
    }

    public void DebitAmount(double b) {
        this.balance -= b;
        System.out.println("Updated balance: " + this.balance);
    }
}

class BankAccount {
    public static void main(String[] args) {
        CheckingAccount ca = new CheckingAccount("7890654123", 200000.00, 20000.00); // Checking account of user
        System.out.println("Account number of user: " + ca.account);
        System.out.println("Available Balance of Checking account: " + ca.balance);
        System.out.println("Usage limit: " + ca.limit);

        SavingsAccount sa = new SavingsAccount("8905674312", 1000000.00, 20000.00); // Savings account of user
        System.out.println("Account number of user: " + sa.account);
        System.out.println("Available Balance of Savings account: " + sa.balance);
        System.out.println("Usage limit: " + sa.limit);

        CertificateOfDeposit cod = new CertificateOfDeposit("4563217809", 500000.00, 20000.00); // Certificate of deposit of user
        System.out.println("Account number of user: " + cod.account);
        System.out.println("Available Balance of Certificate of deposit: " + cod.balance);
        System.out.println("Usage limit: " + cod.limit);
        System.out.println();
        // Crediting amount 
        ca.CreditAmount(20000.00);
        sa.CreditAmount(2000.00);
        cod.CreditAmount(200000.00);
        System.out.println();
        // Calculating and adding interest amount
        ca.CalculateInterest(0.08);
        sa.CalculateInterest(0.08);
        cod.CalculateInterest(0.08);
        System.out.println();
        // CheckingAccount ca = new CheckingAccount(); // Checking account of user
        System.out.println("Account number of user: " + ca.account);
        System.out.println("Available Balance of Checking account: " + ca.balance);
        System.out.println("Usage limit: " + ca.limit);
        System.out.println();
        // SavingsAccount sa = new SavingsAccount(); // Savings account of user
        System.out.println("Account number of user: " + sa.account);
        System.out.println("Available Balance of Savings account: " + sa.balance);
        System.out.println("Usage limit: " + sa.limit);
        System.out.println();
        // CertificateOfDeposit cod = new CertificateOfDeposit(); // Certificate of deposit of user
        System.out.println("Account number of user: " + cod.account);
        System.out.println("Available Balance of Certificate of deposit: " + cod.balance);
        System.out.println("Usage limit: " + cod.limit);
        System.out.println();
        ca.DebitAmount(10000.00);
        sa.DebitAmount(20000.00);
        cod.DebitAmount(30000.00);
    }
}