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
public class Triangle extends Shape {
    // Các thuộc tính của tam giác
    private double slide_1, slide_2, slide_3;
    // Constructor của lớp Triangle
    public Triangle(String ID, double slide_1, double slide_2, double slide_3, String color, boolean isFilled) {
        super(ID, color, isFilled);
        this.slide_1 = slide_1;
        this.slide_2 = slide_2;
        this.slide_3 = slide_3;

    }

    // Getter và setter cho các cạnh của tam giác
    public double getSlide_1() {
        return slide_1;
    }

    public void setSlide_1(double slide_1) {
        this.slide_1 = slide_1;
    }

    public double getSlide_2() {
        return slide_2;
    }

    public void setSlide_2(double slide_2) {
        this.slide_2 = slide_2;
    }

    public double getSlide_3() {
        return slide_3;
    }

    public void setSlide_3(double slide_3) {
        this.slide_3 = slide_3;
    }

    // Phương thức ghi đè để tính diện tích tam giác
    @Override
    public double getArea() {
        double s = (slide_1 + slide_2 + slide_3) / 2; // Tính nửa chu vi của tam giác
        return Math.sqrt(s * (s - slide_1) * (s - slide_2) * (s - slide_3)); // Tính diện tích theo công thức Heron
    }

    // Phương thức ghi đè để tính chu vi tam giác
    @Override
    public double getPerimeter() {
        return slide_1 + slide_2 + slide_3;
    }

    // Phương thức ghi đè để hiển thị thông tin của tam giác
    @Override
    public void showProfile() {
        // Định dạng ngày tạo
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = sdf.format(getDateCreated());
        // Lấy và định dạng ngày tạo của tam giác
        
        System.out.printf("|Triangle:   |%5s|%11s|%10s|%6b|%5.1f|%5.1f|%5.1f|%5.1f|%5.1f|",
                getID(), formattedDate, getColor(), isFilled(), getSlide_1(), getSlide_2(), getSlide_3(), getArea(),
                getPerimeter());
    }
}
