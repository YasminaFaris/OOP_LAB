
public class Library {
    public String libraryName;
    public Book book1;
    public Book book2;
    public Book book3;
    
    public void addBook(Book book, int slot){
        switch(slot){
            case 1:book1=book;break;
            case 2:book2=book;break;
            case 3:book3=book;break;
        }
    }
    public void removeBook(int slot){
        switch(slot){
            case 1:book1=null;break;
            case 2:book2=null;break;
            case 3:book3=null;break;
        }
    }
    public void printLibraryDetails(){
        System.out.println("Library: "+libraryName);
        if(book1 != null)book1.printDetails();
        if(book2 != null)book2.printDetails();
        if(book3 != null)book3.printDetails();
    }
    public void checkBookAvailability(int slot){
        Book book = null;
        switch(slot) {
            case 1: book = book1; break;
            case 2: book = book2; break;
            case 3: book = book3; break;
        }
        if (book != null) {
            System.out.println(book.title + " is available.");
        } else {
            System.out.println("Book in slot "+slot+" is not available.");
        }
    }
    public void updateBookPrice(int slot, double newPrice){
        Book book = null;
        switch(slot) {
            case 1: book = book1; break;
            case 2: book = book2; break;
            case 3: book = book3; break;
        }
        if (book != null) {
            System.out.println("Updated price of" + book.title + " to $" + newPrice);
        } else {
            System.out.println("No book in this slot.");        
        }
        
    }
    public void printBookDetails(Book book){
        if(book!=null){
            book.printDetails();
        }else{
            System.out.println("No book in this slot.");
        }
    }
}
