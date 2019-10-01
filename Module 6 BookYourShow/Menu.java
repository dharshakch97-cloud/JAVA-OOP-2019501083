class Menu {
    public static void main(String[] args) {
        Card C1 = new Card("harry", "Potter", "thriller");
        C1.Get_Title();
        C1.Get_Author();
        C1.Get_Subject();
        Card C2 = new Card("histopan", "aditya bravo", "action");
        C2.Get_Title();
        C2.Get_Author();
        C2.Get_Subject();
        Card C3 = new Card("half girl friend", "chetal bhagat", "romance");
        C3.Get_Title();
        C3.Get_Author();
        C3.Get_Subject();
        CardCatalog cat = new CardCatalog();
        cat.AddCard(C1);
        cat.AddCard(C2);
        cat.AddCard(C3);
        cat.print_Catalog();
        
    }
}