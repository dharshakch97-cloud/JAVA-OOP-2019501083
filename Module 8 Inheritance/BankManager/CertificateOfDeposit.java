class CertificateOfDeposit extends Bank {
    double limit;

    CertificateOfDeposit(String a, double b, double l) {
        this.account = a;
        this.balance = b;
        this.limit = l;
    }
}