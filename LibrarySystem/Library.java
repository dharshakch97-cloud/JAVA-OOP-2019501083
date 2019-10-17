class Library {
    private String libraryName;
    private Borrower[] libraryUsers = new Borrower[20];
    private BookInformation [] libraryItems = new BookInformation[2];
    Scanner input = new Scanner(System.in);
    int x=0;
    int i=0;
    
    public Library(String libraryName) {
        this.libraryName=libraryName;
    }

    private String inputString(String prompt) {
        System.out.println(prompt); 
        return input.next();
    }

    private int inputInt(String prompt) {   
        int val = -1;   
        for(;;) {        
            System.out.println(prompt);      
            try {             
                val = Integer.parseInt(input.next());             
                break;       
            }
        
            catch (Exception ex) {            
                System.out.println("Invalid value, please try again.");      
            }  
        }   
        return val;
    }

    private double inputDouble(String prompt) { 

        double val = -1.00; 
        for(;;) {        
            System.out.println(prompt);      
            try {             
                val = Double.parseDouble(input.next());           
                break;       
            }
            catch (Exception ex) {            
                System.out.println("Invalid value, please try again.");      
            }   
        }   
        return val;
    }

    public void addUser(int choice) {
        if(choice==1) {
            String firstName = inputString("Please enter your first name ");
            String lastName = inputString("Please enter your last name ");
            String title = inputString("Please enter your title ");
            String dateOfBirth = inputString("Please enter your date of birth ");
            String homeAddress = inputString("Please enter your home address ");
            String phoneNumber = inputString("Please enter your phone number ");
            int barCode = inputInt("Please enter your library card barcode");
            String studentId = inputString("Please enter your Student ID ");
            StudentBorrower studentBor = new StudentBorrower(firstName, lastName, title, dateOfBirth, homeAddress, phoneNumber, barCode, studentId);
            libraryUsers[x]=studentBor;
            x++;
        }
        else if(choice==2)
        {
            String firstName = inputString("Please enter your first name ");
            String lastName = inputString("Please enter your last name ");
            String title = inputString("Please enter your title ");
            String dateOfBirth = inputString("Please enter your date of birth ");
            String homeAddress = inputString("Please enter your home address ");
            String phoneNumber = inputString("Please enter your phone number ");
            int barCode = inputInt("Please enter your library card barcode");
            String studentId = inputString("Please enter your Student ID ");
            StaffBorrower staffBor = new StaffBorrower(firstName, lastName, title, dateOfBirth, homeAddress, phoneNumber, barCode, studentId);
            libraryUsers[x]=staffBor;
            x++;
        }
    }

    public void addItem(int item) {
        if (choice == 1) {
            String title = inputString("Please enter your item code ");
            String author = inputString("Please enter the items due date ");
            String year = inputString("Please enter your items title ");
            String price = inputString("Please enter your books title ");
            //Cannot find symbol – constructor BookInformation(java.lang.String,java.lang.String,java.lang.String,java.lang.String)
            BookInformation book = new BookInformation(title,author,year,price);
            libraryItems[i] = book;
            i++;
        } else if (choice == 2) {
            String title = inputString("Please enter your item code ");
            String author = inputString("Please enter the items due date ");
            String pages = inputString("Please enter your items title ");
            String refNumber = inputString("Please enter your journals title ");
            Journal jnal = new Journal(title,author,pages,refNumber);
            libraryItems[x] = dvd;
            i++;
        }
    }

    public void getBorrowers() {
        for(int x=0; x<libraryUsers.length; x++) {
            if (libraryUsers[x] == null) {
                break;
            }  
            else {
                System.out.println(libraryUsers[x].toString());
            }
        }
    }

    public void getItems() {
        for(int x=0; x<libraryItems.length; x++) {
         System.out.println(libraryItems[x].toString());
        }
    }

    public Person[] searchUsers()
    {
        System.out.println("Please enter the surname of the user you wish to find");
        return null;
    }

    public BookInformation[] searchItems() {
        return null;
    }

    public int textMenu() {
        System.out.println("WELCOME TO " + libraryName + " LIBRARY" + "\n");
        System.out.println("To add a User, press 1" + "\n");
        System.out.println("To add an Item, press 2" + "\n");
        System.out.println("To list the users of this library, press 3" + "\n");
        System.out.println("To list the items in this library, press 4" + "\n");
        System.out.println("To search for a user, press 5" + "\n");
        System.out.println("To search for an Item, press 6" + "\n");
        System.out.println("To exit the system, press 7" + "\n");
        int choice = input.nextInt();
        return choice;
    }
}