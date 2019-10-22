class CheckingAccount extends Bank {
    double limit;

    CheckingAccount(String a, double b, double l) {
        this.account = a;
        this.balance = b;
        this.limit = l;
    }
}