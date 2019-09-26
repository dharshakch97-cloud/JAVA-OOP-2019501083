class Card {
    String title;
    String author;
    String subject;

    Card(final String t,final String a,final String s){
        this.title = t;
        this.author = a;
        this.subject = s;
    }
    public String getTitle() {
        return this.title;
    }
    public String getAuthor() {
        return this.author;
    }
    public String getSubject(){ 
        return this.subject; 
    }

    public void setTitle(final String toSet) {
        this.title = toSet;
    }
    public void setAuthor(final String toSet) {
        this.author = toSet;
    }
    public void setSubject(final String toSet) {
        this.subject = toSet;
    }
}