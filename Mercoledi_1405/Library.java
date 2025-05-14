package Mercoledi_1405;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    
    public Library(){
        books = new ArrayList<>();
    }

    public void addBooks(Book book){
        books.add(book);
    }
    
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("La biblioteca è vuota.");
        } else {
            for (Book book : books) {
                book.displayBookInfo();
            }
        }
    }

    public void borrowBook(String title){
        boolean found = false;
        for(Book book : books){
            if(book.getTitle().equalsIgnoreCase(title)){
                found = true;
                if(book.getIsAvailable() == true){
                    book.setIsAvailable(false);
                     System.out.println("Hai preso in prestito il libro: " + title);
            } else {
                System.out.println("Il libro '" + title + "' non è disponibile.");
            }
                break;
            }
        }
        
    }
    
}        