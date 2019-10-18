class CardCatalog {
    Card[]cardArray;
    int index = 0;

    CardCatalog() {
        cardArray = new Card[10];
    }

    public void AddCard(Card obj) {
        cardArray[index] = obj;
        index += 1;
    }
    public Card GetATitle(String s1) {
        for(int i = 0; i<cardArray.length; i++) {
            if(cardArray[i].title.equals(s1)) {
                return cardArray[i];
            }
        }
        return null;
    }
    public Card[] GetAuthor(String s2) {
        Card[] arr = new Card[index];
        int count = 0;
        for(int i = 0; i<cardArray.length; i++) {
            if(cardArray[i].author.equals(s2)) {
                arr[count] = cardArray[i];
                count++;
            }
        }
        return arr;
    }
            
    public Card[] getSubject(String s3) {
        Card[] arr = new Card[index];
        int count = 0;
        for(int i = 0; i<cardArray.length; i++) {
            if(cardArray[i].subject.equals(s3)) {
                arr[count] = cardArray[i];
                count++;
            }
        }
        return arr;
    }
    public void delete(String s4) {
        for(int i = 0; i<cardArray.length; i++) {
            if(cardArray[i].title.equals(s4)) {
                cardArray[i] = null;
            }
        } 
    }
    public void print_Catalog() {
        for(int i = 0; i<cardArray.length; i++) {
            if(this.cardArray[i] != null) {
                System.out.println(cardArray[i]);
            }
        }
    }
}