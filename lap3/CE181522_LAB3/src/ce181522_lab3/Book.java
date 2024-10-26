/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ce181522_lab3;

/**
 *
 * @author CE181522 Nguyen Minh Tam IA181522
 */
public class Book {
    // tạo thuộc tính
    private String ID;
    private String name;
    private int year;
    private String author;
    private int size;

    // tạo các menthod
    public Book() {

    }

    public Book(String ID, String name, int year, String author, int size) {
        this.ID = ID;
        this.name = name;
        this.year = year;
        this.author = author;
        this.size = size;
    }

    // get và set để lấy và gọi giá trị
    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }

    public int getSize() {
        return size;
    }

    public void setID(String iD) {
        ID = iD;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setSize(int size) {
        this.size = size;
    }

    // em code cho đúng bài chứ em cũng hông biết để làm gì =)))
    public void showinfo() {

    }
}
