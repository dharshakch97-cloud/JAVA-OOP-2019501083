import java.util.*;
class BookInformation {
    public static void main(String[] args) {
        float[] array = new float [10];
        List<Books> list = new ArrayList<Books>();
        list.add(new Books("Gitanjali","Rabindra Nath Tagore",1912,200));
        list.add(new Books("Godan","Munshi Premchand",1936,300));
        list.add(new Books("My Experiments With Truth","Mahatma Gandhi",1927,150));
        list.add(new Books("Macbeth","William Shakespeare",1623,400));
        list.add(new Books("My Truth","Indira Gandhi",1980,145));
        Scanner input=new Scanner(System.in);
        System.out.println("Enter book name:");
        String st=input.nextLine();
        
        for (Books s: list) {
            if(st.equals(s.getTitle())){
                System.out.println(s.getTitle() + " " + s.getAuthor() + " " + s.getYear() + " " + s.getPrice());
                // System.out.println(list.get(i));
            }
        }    
    }
}