class Books {
    public String Title;
    public String Author;
    public int year;
    public double price;

    public Books() {
    }

    public Books(String t,String a,int y,double p) {
        super();
        this.Title = t;
        this.Author = a;
        this.year = y;
        this.price = p;
    }

    public String getTitle() {
        return this.Title;
    }

    public String getAuthor() {
        return this.Author;
    }

    public int getYear() {
        return this.year;
    }

    public double getPrice() {
        return this.price;
    }
}
