/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package lullabylibrary_my.classes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author a.margel2
 */
public class Library {
    private ArrayList<Book> inventory;
    private ArrayList<Person> people;
    private double balance;
    private double membershipPrice;
    public Library(){
        balance = 1000.00;
        membershipPrice = 20;
        inventory = new ArrayList<Book>();
        people = new ArrayList<Person>();
    }
    public Person login(String name, String password){
        for(Person p:people){
            if(p.getUsername().equals(name)&&p.checkPassword(password))
                return p;
        }
        return null;
    }
    public  ArrayList<Book> findBookName(String name){
        ArrayList<Book> books = new ArrayList<Book>();
        for(Book b:inventory){
            if(b.getBookTitle().equals(name)){
                books.add(b);
            }
        }
        return books;
    }
    public ArrayList<Book> findBookGenre(String genre){
        ArrayList<Book> books = new ArrayList<Book>();
        for(Book b:inventory){
            if(b.getBookGenre().equals(genre)){
                books.add(b);
            }
        }
        return books;
    }

    public void payEmployees(){
        for(Person p:people){
            if(p instanceof Employee){
                Employee temp= (Employee) p;
                balance-=temp.getSalary();
            }
        }
    }
    public void chargeMembers(){
        for(Person p:people){
            if(p instanceof Customer){
                Customer temp= (Customer) p;
                //temp.chargeMembers();
                balance+=membershipPrice;
            }
        }
    }
    public boolean signUpMember(String username,String password){
        boolean match=false;
        for(Person p:people){
            if(p.getUsername().equals(username)){
                match=true;
            }
        }
        if(!match){
            people.add(new Customer(username,password,new ArrayList<Book>()));
        }
        return !match;
    }
    public boolean signUpEmployee(String username,String password){
        boolean match=false;
        for(Person p:people){
            if(p.getUsername().equals(username)){
                match=true;
            }
        }
        if(!match){
            people.add(new Employee(username,password));
        }
        return !match;
    }
    public boolean signUpManager(String username,String password){
        boolean match=false;
        for(Person p:people){
            if(p.getUsername().equals(username)){
                match=true;
            }
        }
        if(!match){
            people.add(new Manager(username,password));
        }
        return !match;
    }
    public void setMemPrice(double price){
        membershipPrice=price;
    }
    public void addBook(Book book){
        inventory.add(book);
    }
    public void removeBook(Book book){
        for(int i=inventory.size()-1;i>=0;i--){
            if(inventory.get(i)==book){
                inventory.remove(i);
            }
        }
    }
    public void loadBooksFromFile(String fileName){
        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }   

            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }
        if(line!=null){
            inventory=loadBooks(line);
        }
        
    }
    private ArrayList<Book> loadBooks(String books){
        ArrayList<Book> tempBooks= new ArrayList<Book>();
        try{
            String[] parts1 = books.split(";");
            for(int i=0;i<parts1.length;i++){
                tempBooks.add(loadBook(parts1[i]));
            }
        }catch(Exception e){
            System.out.println("books could not be loaded from text file");
        }
        return tempBooks;
    }
    private Book loadBook(String book){
        String[] parts2 = book.split(",");
        int[] ratings = new int[parts2.length-2];
        for(int j=2;j<parts2.length;j++){
            ratings[j-2]=Integer.parseInt(parts2[j]);
        }
        return new Book(parts2[0],parts2[1],ratings);
    }
    public void loadPeopleFromFile(String fileName){
        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }   

            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }
        if(line!=null){//|type,name,password-bookName,bookGenre,ratings...;(more books)|
            try{
                String[] parts1 = line.split("|");
                for(int i=0;i<parts1.length;i++){
                    String[] parts2 = parts1[i].split("-");
                    String[] parts3 = parts2[0].split(",");
                    if(parts3[0].equals("Customer")){
                        ArrayList<Book> temp= loadBooks(parts2[1]);
                        people.add(new Customer(parts3[1],parts3[2],temp));
                    }else if(parts3[0].equals("Manager")){
                        people.add(new Manager(parts3[1],parts3[2]));
                    }else if(parts3[0].equals("Employee")){
                        people.add(new Employee(parts3[1],parts3[2]));
                    }
                }
            }catch(Exception e){
                System.out.println("books could not be loaded from text file");
            }
        }
        
    }
}
