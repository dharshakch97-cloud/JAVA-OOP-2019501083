class CardCatalog {
    Card[] cardArray;
    int count;

    CardCatalog() {
        this.count = 0;
        this.cardArray = new Card[100];
    }

    public void AddCard(Card card) {
        cardArray[count] = card;
        count++;
    }

    public Card searchTitle(String searchTitle) {
        for (int i = 0; i < count; i++) {
            if (cardArray[i].getTitle() == searchTitle) {
                return cardArray[i];
            }
        }
        return null;
    }

    public Card searchAuthor(String searchAuthor) {
        for (int i = 0; i < count; i++) {
            if (cardArray[i].getAuthor() == searchAuthor) {
                return cardArray[i];
            }
        }
        return null;
    }

    public Card searchSubject(String searchSubject) {
        for (int i = 0; i < count; i++) {
            if (cardArray[i].getSubject() == searchSubject) {
                return cardArray[i];
            }
        }
        return null;
    }
        
    public boolean removeCard(String removeTitle) {
        for (int i = 0; i < count; i++) {
            if (cardArray[i].getTitle() == removeTitle) {
                for (int j = i + 1; j < count; j++) {
                    cardArray[i] = cardArray[j];
                    i++;
                }
                cardArray[count] = null;
                count--;
                return true;
            }
        }
        return false;
    }
    
    public void printCatalog() {
        for (int i = 0; i < count; i++) {
            System.out.println(cardArray[i]);
        }
    }
}