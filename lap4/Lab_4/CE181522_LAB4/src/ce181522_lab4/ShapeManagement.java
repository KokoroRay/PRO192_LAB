/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ce181522_lab4;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author CE181522 Nguyen Minh Tam IA181522
 */
public class ShapeManagement {
    // Danh sách các hình học được quản lý
    private ArrayList<Shape> shapes = new ArrayList<>();
    

    // Phương thức thêm hình tròn vào danh sách
    public void addCircle(String ID, double Radius, String Color) {
        
        shapes.add(new Circle(ID, Radius, Color, true));
    }

    // Phương thức thêm hình tam giác vào danh sách
    public void addTriangle(String ID, double slide_1, double slide_2, double slide_3, String color, boolean isFilled) {
        if (slide_1 <= 0 || slide_2 <= 0 || slide_3 <= 0) {
            return;
        }
        shapes.add(new Triangle(ID, slide_1, slide_2, slide_3, color, isFilled));
    }

    // Phương thức thêm hình chữ nhật vào danh sách
    public void addRectangle(String ID, double width, double height, String color, boolean isFilled) {
        if (width <= 0 || height <= 0) {
            return;
        }
        shapes.add(new Rectangle(ID, width, height, color, isFilled));
    }

    // Phương thức thêm hình vuông vào danh sách
    public void addSquare(String ID, double edge, String color, boolean isFilled) {
        if (edge <= 0) {
            return;
        }
        shapes.add(new Square(ID, edge, color, isFilled));
    }

     // Phương thức hiển thị tất cả các hình trong danh sách
    public void showAllShapes() {
        for (Shape shape : shapes) {  // Duyệt qua từng hình trong danh sách
            shape.showProfile();// Hiển thị thông tin của hình
            System.out.println(); // Xuống dòng
        }
    }

    // Phương thức tìm và hiển thị hình có diện tích lớn nhất
    public void biggestShape() {
        Shape biggestArea = shapes.get(0);  // Giả định hình đầu tiên có diện tích lớn nhất
        for (Shape shape : shapes) { // Duyệt qua từng hình trong danh sách
            if (shape.getArea() > biggestArea.getArea()) { // Nếu hình hiện tại có diện tích lớn hơn
                biggestArea = shape; // Cập nhật hình có diện tích lớn nhất
            }
        }
        biggestArea.showProfile(); // Hiển thị thông tin của hình có diện tích lớn nhất
    }

    // Phương thức sắp xếp các hình theo diện tích tăng dần
    public void sortShapeArea() {
        shapes.sort(Comparator.comparingDouble(Shape::getArea)); // Sắp xếp danh sách các hình theo diện tích tăng dần
        showAllShapes(); // Hiển thị tất cả các hình sau khi sắp xếp
    }
    
    // Phương thức tìm kiếm hình theo ID
    public Shape searchShapeID(String ID) {
        for (Shape shape : shapes) {  // Duyệt qua từng hình trong danh sách
            if (shape.getID().equals(ID)) { // Nếu tìm thấy hình có ID khớp
                return shape; // Trả về hình đó
            }
        }
        return null; // Nếu không tìm thấy hình nào có ID khớp, trả về null
    }
    
    // Phương thức kiểm tra ID của hình
    public int checkShapeID(String ID) {
        for (int i = 0; i < shapes.size(); i++) { // Duyệt qua từng hình trong danh sách
            if (shapes.get(i).getID().equals(ID)) {  // Nếu tìm thấy hình có ID khớp
                return i; // Trả về chỉ số của hình đó trong danh sách
            }
        }
        return -1; // Nếu không tìm thấy hình nào có ID khớp, trả về -1
    }
}