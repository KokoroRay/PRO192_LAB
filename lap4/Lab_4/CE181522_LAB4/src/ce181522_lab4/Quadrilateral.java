/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ce181522_lab4;

/**
 *
 * @author CE181522 Nguyen Minh Tam IA181522
 */
public abstract class Quadrilateral extends Shape {
    private double width;
    private double height;

    // Constructor với các tham số
    public Quadrilateral(String ID, String color, Boolean filled, double width, double height) {
        super(ID, color, filled); // Gọi constructor của lớp cha Shape
        if (height <= 0 || width <= 0) {
            System.exit(1);
        }
        this.width = width;
        this.height = height;
    }
    //phương thức getter và setter của Width và Height
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void showProfile() {
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
    }

}
