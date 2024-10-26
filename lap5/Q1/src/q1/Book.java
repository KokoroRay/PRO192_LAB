/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1;

/**
 *
 * @author CE181522 Nguyen Minh Tam IA181522
 */
public class Book extends Document {
    private int page;
    private int status;

    public Book(String ID, String name, int page, int status) {
        super(ID, name);
        this.page = page;
        this.status = status;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    
    public String entryBook() {
        String availability = (status == 0) ? "available" : "unavailable";
        return "Add book: " + getID() + " - " + getName() + " - " + getPage() + " pages - " + availability;
    }
    
    public String printBook() {
       String availability = (status == 0) ? "available" : "unavilable";
       return getID() + " - " + getName() + " - " + getPage() + " pages - " + availability;
    }
    
    public void borrowBook() {
        this.status = 1;
    }
    
    public void returnBook() {
        this.status = 0;
        
    }
    
    
    
}
