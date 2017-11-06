
//package librarygroupproject;
import java.util.*;

public class Book {
    private String bookTitle;
    private String bookGenre;
    private ArrayList<Integer> rating;
    
    public Book(String title, String genre, int[] r){
        bookTitle = title;
        bookGenre = genre;
        for(int i = 0; i < r.length; i++){
            rating.add(r[i]);
        }//end for
    }
    
    public void rate(int r){
        rating.add(r);
    }
    
    public double getAvgRating(){
        double total = 0;
        double avg;
        for(int i = 0; i < rating.size(); i++){
            total+= rating.get(i);
        }//end for
        avg = total/(rating.size());
        return avg;
    }
    
    public void setBookTitle(String title){
        bookTitle = title;
    }
    
    public void setBookGenre(String genre){
        bookGenre = genre;
    }
    
    public String getBookTitle(){
        return bookTitle;
    }
    
    public String getBookGenre(){
        return bookGenre;
    }
    
}//end class