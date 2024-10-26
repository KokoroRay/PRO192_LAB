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
public class Document {
    private String ID;
    private String name;

    public Document(String ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String entryDoc() {
        return String.format("Add document: %s - %s", getID(), getName());
    }
    
    public String printDoc() {
        return String.format("%s - %s", getID(), getName());
    }
}
