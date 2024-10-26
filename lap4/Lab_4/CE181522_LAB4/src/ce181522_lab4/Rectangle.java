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
public class Rectangle extends Quadrilateral {
    
    // Constructor của lớp Rectangle
    public Rectangle(String ID, double width, double height, String color,
            boolean isFilled) {
        super(ID, color, isFilled, width, height);

    }
    
    // Phương thức ghi đè để tính diện tích hình chữ nhật
    @Override
    public double getArea() {
        return getWidth() * getHeight(); // Diện tích = chiều rộng * chiều cao
    }

    // Phương thức ghi đè để tính chu vi hình chữ nhật
    
    @Override
    public double getPerimeter() {
        return 2 * (getHeight() + getWidth()); // Chu vi = 2 * (chiều rộng + chiều cao)
    }

    // Phương thức ghi đè để hiển thị thông tin của hình chữ nhật
    @Override
    public void showProfile() {
        // Định dạng ngày tạo
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String formttedDate = sdf.format(getDateCreated());
        // Lấy và định dạng ngày tạo của hình chữ nhật
        
        
        System.out.printf("|Rectangle:  |%5s|%11s|%10s|%6b|%5.1f|%5.1f|    -|%5.1f|%5.1f|",
                getID(), formttedDate, getColor(), isFilled(), getWidth(), getHeight(), getArea(), getPerimeter());
    }
}

