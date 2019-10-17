class Menu {
    public static void main(String[] args) {
        Card card1 = new Card("harry", "Potter", "thriller");
        Card card2 = new Card("histopan", "aditya bravo", "action");
        Card card3 = new Card("half girl friend", "chetal bhagat", "romance");
        CardCatalog cardcatalog = new CardCatalog();
        cardcatalog.AddCard(card1);
        cardcatalog.AddCard(card2);
        cardcatalog.AddCard(card3);
        cardcatalog.print_Catalog();
        Card get_title = cardcatalog.GetATitle("harry");
        System.out.println(get_title);
        // cardcatalog.delete("harry");
        // Card[] get_subject = cardcatalog.getSubject("action");
        // cardcatalog.print_Catalog();
    }
}