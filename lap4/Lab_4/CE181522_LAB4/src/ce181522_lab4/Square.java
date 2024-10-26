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
public class Square extends Rectangle {

    // Constructor của lớp Square
    public Square(String ID, double edge, String color, boolean isFilled) {
        super(ID, edge, edge, color, isFilled);
        // Gọi constructor của lớp cha Rectangle với chiều rộng và chiều cao bằng cạnh của hình vuông
    }

    // Phương thức để lấy độ dài cạnh của hình vuông
    public double edge() {
        return getWidth(); // Chiều rộng và chiều cao của hình vuông bằng nhau
    }

    // Phương thức ghi đè để hiển thị thông tin của hình vuông
    @Override
    public void showProfile() {
        // Định dạng ngày tạo
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = sdf.format(getDateCreated()); // Lấy và định dạng ngày tạo của hình
        
        System.out.printf("|Square:     |%5s|%11s|%10s|%6b|%5.1f|    -|    -|%5.1f|%5.1f|",
                getID(), formattedDate, getColor(), isFilled(), edge(), Math.pow(edge(), 2), edge() * 4);
    }

}
