/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ce181522_lab4;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author CE181522 Nguyen Minh Tam IA181522
 */
public abstract class Shape {
    // Thuộc tính của Shape
    private String ID;
    private String color;
    private Boolean filled = true;
    private Date dateCreated;

    // Constructor mặc định
    public Shape() {

    }

    // Constructor với các tham số
    public Shape(String ID, String color, Boolean filled) {
        this.ID = ID;
        this.color = color;
        this.filled = filled;
        this.dateCreated = new Date(); // Tạo đối tượng với ngày hiện tại
        this.filled = filled;
    }
    //phương thức getter và setter
    String getID() {
        return ID;
    }

    String getColor() {
        return color;
    }

    boolean isFilled() {
        return filled;
    }

    Date getDateCreated() {
        return dateCreated;
    }

    public void setID(String iD) {
        ID = iD;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

     // Phương thức toString ghi đè
    @Override
    public String toString() {
        return super.toString();
    }

    // Phương thức trừu tượng để tính diện tích
    public abstract double getArea();

    // Phương thức trừu tượng để tính chu vi
    public abstract double getPerimeter();

    // Phương thức trừu tượng để hiển thị thông tin hình
    public abstract void showProfile();

}
