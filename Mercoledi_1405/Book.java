package Mercoledi_1405;


public class Book {
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String title, String author, boolean isAvailable){
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public boolean getIsAvailable(){
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable){
        this.isAvailable = isAvailable;
    }

    public void displayBookInfo(){
        System.out.println("Titolo: " + title);
        System.out.println("Autore: " + author);
        System.out.println("Disponibile: " + (isAvailable ? "Si" : "No"));
    }

    
}