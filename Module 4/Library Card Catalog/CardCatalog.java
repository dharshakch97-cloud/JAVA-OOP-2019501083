class CardCatalog {

    private Card[] myCards;
    private int cardCount;

    CardCatalog() {
        final int hundr = [100];
        this.myCards = new Card[five];
        this.cardCount = 0;
    }

    public void AddCard(Card[] card) {
        myCards[cardCount] = card;
        cardCount++;
    }
    public Card searchATitle(String title) {
        for (int i = 0; i < cardCount; i++) {
            if (myCards[i].getTitle() == title) {
                return myCards[i];
            }
        }
        return null;
    }
    public Card searchAnAuthor(String author) {
        cArr[] cardArray;
        count = 0;
        for (int i = 0; i < cardCount; i++) {
            if (myCards[i].getAuthor() == author) {
                // System.out.println(myCard[i]);
                cArr[count] = myCards[i];
                count++;
            }
        }
        return cArr;
    }
    public Card searchSubject(String subject) {
        cArr[] cardArray;
        count = 0;
        for (int i = 0; i < cardCount; i++) {
            if (myCards[i].getSubject() == subject) {
                // System.out.println(myCard[i]);
                cArr[count] = myCards[i];
                count++;
            }
        }
        return cArr;
    }
    public boolean removeCard(String searchTitle) {
        //  Your code goes here....
        for (int i = 0; i < cardCount; i++) {

            if (myCards[i].getTitle() == searchTitle) {
                
                // i is the match index
                for (int j = i + 1; j < cardCount; j++) {
                    myCards[i] = myCards[j];
                    i++;
                }
                myCards[cardCount] = null;
                cardCount--;
                return true;
            }
        }
        return false;
    }
}