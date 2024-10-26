/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ce181522_lab4;
import java.text.SimpleDateFormat;
/**
 *
 * @author CE181522 Nguyen Minh Tam IA181522
 */
public class Circle extends Shape {
    // Thuộc tính của Circle
    private double radius;
    
    // Constructor với các tham số
    public Circle(String ID, double radius, String color, boolean filled) {
        super(ID, color, filled);

        this.radius = radius;
    }
    //phương thức setter và getter của Radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Phương thức tính chu vi hình tròn
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius; // Chu vi = 2 * π * bán kính
    }
     // Phương thức tính diện tích hình tròn
    public double getArea() {
        return Math.pow(radius, 2) * Math.PI; // Diện tích = π * (bán kính ^ 2)
    }

    // Phương thức hiển thị thông tin của hình tròn
    @Override
    public void showProfile() {
        // Định dạng ngày tạo
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = sdf.format(getDateCreated());
        // Lấy và định dạng ngày tạo của hình tròn
        
        System.out.printf("|Circle:     |%5s|%11s|%10s|%6b|%5.1f|    -|    -|%5.1f|%5.1f|",
            getID(), formattedDate, getColor(), isFilled(), getRadius(), getArea(), getPerimeter());
       }

}
