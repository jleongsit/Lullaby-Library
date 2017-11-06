import java.util.*;
public class Customer extends Person{
    ArrayList<Book> checkedBooks;
    public Customer(String u, String p, ArrayList<Book> cB){
        username = u;
        password = p;
        checkedBooks = cB;
    }//end constructor
    private void checkOut(Book b){
        checkedBooks.add(b);
        LibraryGroupProject.Lullaby.removeBook(b);
    }//end checkOut
    private void returnBook(Book b){
        int temp = -1;
        for(int i = 0; i < checkedBooks.size(); i++){
            if(b.getBookTitle().equals(checkedBooks.get(i).getBookTitle())){
                temp = i;
            }//end if
        }//end for
        LibraryGroupProject.Lullaby.addBook(checkedBooks.get(temp));
        checkedBooks.remove(temp);
    }//end return
}//end customer
