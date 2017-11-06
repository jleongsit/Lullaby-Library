
//package librarygroupproject;


public class LibraryGroupProject {
    public static Library Lullaby = new Library();
    public static void main(String[] args) {
        Lullaby.loadBooksFromFile("Books.txt");
        new LibraryGUI().setVisible(true);
    }//end main
    
}//end class
