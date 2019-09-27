class Card {
    String title;
    String author;
    String subject;

    public Card() {
    }    
    public Card(String t, String a, String s) {
        this.title = t;
        this.author = a;
        this.subject = s;
    }
    // public void setTitle(String title) {
    //     this.title = title;
    // }

    // public void setAuthor(String author) {
    //     this.author = author;
    // }

    // public void setSubject(String subject) {
    //     this.subject = subject;
    // }

    // public String getTitle() {
    //     return this.title;
    // }
    // public String getAuthor() {
    //     return this.author;
    // }
    // public String getSubject() {
    //     return this.subject;
    // }
    public String toString() {
        return "Book Title :" + this.title + " , " + "Author of Book :" + this.author + " , " + "Subject of Book :" + this.subject;
    }
}
