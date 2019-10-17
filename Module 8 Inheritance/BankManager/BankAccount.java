class Bank {
    String account = "123456789";
    double balance = 200.00;
}

class CheckingAccount extends Bank {
    double limit;
}

class SavingsAccount extends Bank {
    double limit;
}

class CertificateOfDeposit extends Bank {
    double limit;
}

class BankAccount {
    public static void main(String[] args) {
        CheckingAccount ca = new CheckingAccount();
        // SavingsAccount sa = new SavingsAccount();
        // CertificateOfDeposit cod = new CertificateOfDeposit();

        System.out.println(ca.account);
        System.out.println(ca.balance);
        System.out.println(ca.limit);

        // System.out.println(sa.account);
        // System.out.println(sa.balance);
        // System.out.println(sa.limit);

        // System.out.println(cod.account);
        // System.out.println(cod.balance);
        // System.out.println(cod.limit);
    }
}