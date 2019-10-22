class Menu {
    public static void main(String[] args) {
        Card card1 = new Card("harry", "Potter", "thriller");
        Card card2 = new Card("histopan", "aditya bravo", "action");
        Card card3 = new Card("half girl friend", "chetal bhagat", "romance");

        CardCatalog cardcatalog = new CardCatalog();
        
        cardcatalog.AddCard(card1);
        cardcatalog.AddCard(card2);
        cardcatalog.AddCard(card3);
        
        cardcatalog.printCatalog();
        System.out.println();
        Card getTitle = cardcatalog.searchTitle("harry");
        System.out.println(getTitle);
        cardcatalog.removeCard("harry");
    
        Card getSubject = cardcatalog.searchSubject("action");
        System.out.println();    
        cardcatalog.printCatalog();
    }
}