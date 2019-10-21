class Patron {
    String Pname;
    String Pnumber;
    String ticket;

    Patron(String pname, String pnumber) {
        Pname = pname;
        Pnumber = pnumber;
    }

    public void setTicket(String t) {
        this.ticket = t;
    }

    public String toString() {
        return this.ticket;
    }
}