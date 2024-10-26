/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ce181522_lab4;

import java.util.Scanner;

/**
 *
 * @author CE181522 Nguyen Minh Tam IA181522
 */
public class CE181522_LAB4 {
    public static void main(String[] args) {
        ShapeManagement shapeManagement = new ShapeManagement(); //Tạo một đối tượng ShapeManagement mới
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        // Bắt đầu vòng lặp chính của ứng dụng
        do {
            // Hiển thị các tùy chọn menu cho người dùng
        System.out.println("\n----- SHAPE MANAGEMENT-----");
        System.out.println("1. Adds new Circle.");
        System.out.println("2. Adds new Triangle.");
        System.out.println("3. Adds new Rectangle.");
        System.out.println("4. Adds new Square.");
        System.out.println("5. Shows all Shapes.");
        System.out.println("6. The biggest area shape.");
        System.out.println("7. Sort ascending by shape area.");
        System.out.println("8. Search a shape.");
        System.out.println("9. Quit.");
        System.out.println("Please select a function:");
        input = scanner.nextInt();
        scanner.nextLine();        
            switch (input) {
                case 1:
                    addCircle(scanner, shapeManagement); // Thêm hình tròn
                    break;
                case 2:
                    addTriangle(scanner, shapeManagement); // Thêm hình tam giác
                    break;
                case 3:
                    addRectangle(scanner, shapeManagement);  // Thêm hình chữ nhật
                    break;
                case 4:
                    addSquare(scanner, shapeManagement); // Thêm hình vuông
                    break;
                case 5:
                    System.out.println("----- List of Shapes -----");
                    shapeManagement.showAllShapes(); // Hiển thị tất cả các hình
                    break;
                case 6:
                    System.out.println("----- List of the biggest Area Shapes -----");
                    shapeManagement.biggestShape(); // Hiển thị hình có diện tích lớn nhất
                    break;
                case 7:
                    System.out.println("----- List of Shapes -----");
                    shapeManagement.sortShapeArea(); // Sắp xếp các hình theo diện tích
                    break; 
                case 8:
                    searchShape(scanner, shapeManagement); // Tìm kiếm một hình
                    break; 
                case 9:
                    System.out.println("THANK FOR USING OUR APPLICATION!");
                    System.out.println("SEE YOU AGAIN!");
                     scanner.close();   
                    System.exit(0);
                    break;
                default:
                    System.out.println("The function of application must be from 1 to 9!");
                    break;
            }
        } while (input != 9);
        scanner.close();
    }
    
    private static void addCircle(Scanner scanner, ShapeManagement shapeManagement) {
        System.out.println("----- Add new Circle -----");
        System.out.printf("Input: ID: ");
        String ID = scanner.nextLine(); // Đọc ID của hình tròn
        if (checkID(ID, shapeManagement) == 1) { // Kiểm tra độ dài ID
            return;
        }
        if (checkID(ID, shapeManagement) == 2) { // Kiểm tra ID đã tồn tại
            System.out.println("The %s is alreay exists");
            return;
        }
        System.out.printf("Input color: ");
        String Color = scanner.nextLine(); // Đọc màu của hình tròn
        System.out.printf("Input radius: ");
        double Radius = scanner.nextDouble();  // Đọc bán kính của hình tròn
        scanner.nextLine();  // Nhận kí tự xuống dòng
        if (Radius <= 0) {
            return;
        }
        shapeManagement.addCircle(ID, Radius, Color); // Thêm hình tròn vào ShapeManagement
        System.out.println("Circle created and added to list of shapes successful!");
    }
        // 3 phần còn lại giống addCircle với do dài với có tính lặp lại cao nên nên em commet đoạn đầu thui nha thầy :>>
    private static void addTriangle(Scanner scanner, ShapeManagement shapeManagement) {
        System.out.println("----- Add new Triangle -----");
        System.out.printf("Input: ID: ");
        String ID = scanner.nextLine(); 
        if (checkID(ID, shapeManagement) == 1) {
            return;
        }
        if (checkID(ID, shapeManagement) == 2) {
            System.out.println("The %s is alreay exists");
            return;
        }
        System.out.printf("Input color: ");
        String Color = scanner.nextLine();
        System.out.printf("Input slide_1: ");
        double slide_1 = scanner.nextDouble();
        if (slide_1 <= 0) {
            return;
        }
        System.out.printf("Input slide_2: ");
        double slide_2 = scanner.nextDouble();
        if (slide_2 <= 0) {
            return;
        }        
        System.out.printf("Input slide_3: ");
        double slide_3 = scanner.nextDouble();
        if (slide_3 <= 0) {
            return;
        } 
        shapeManagement.addTriangle(ID, slide_1, slide_2, slide_3, Color, true);        
        System.out.println("Triangle created and added to list of shapes successful!");
    }
    private static void addRectangle(Scanner scanner, ShapeManagement shapeManagement) {
        System.out.println("----- Add new Rectangle -----");
        System.out.printf("Input: ID: ");
        String ID = scanner.nextLine();
        if (checkID(ID, shapeManagement) == 1) {
            return;
        }
        if (checkID(ID, shapeManagement) == 2) {
            System.out.println("The %s is alreay exists");
            return;
        }
        System.out.printf("Input color: ");
        String color = scanner.nextLine();
        System.out.printf("Input width: ");
        double width = scanner.nextDouble();
        if (width <= 0) {
            return;
        }
        System.out.printf("Input height: ");
        double height = scanner.nextDouble();
        if (height <= 0) {
            return;
        }
        shapeManagement.addRectangle(ID, width, height, color, true);
        System.out.println("Rectangle created and added to list of shapes successful!");
    }
    private static void addSquare(Scanner scanner, ShapeManagement shapeManagement) {
        System.out.println("----- Add new Square -----");
        System.out.printf("Input: ID: ");
        String ID = scanner.nextLine();
        if (checkID(ID, shapeManagement) == 1) {
            return;
        }
        if (checkID(ID, shapeManagement) == 2) {
            System.out.println("The %s is alreay exists");
            return;
        }
        System.out.printf("Input color: ");
        String color = scanner.nextLine();
        System.out.printf("Input edge: ");
        double edge = scanner.nextDouble();
        if (edge <= 0) {
            return;
        }
        shapeManagement.addSquare(ID, edge, color, true);
        System.out.println("Square created and added to list of shapes successful!");
    }
    
    // kiểm tra ID đó có tồn tại hay không
    private static int checkID (String ID, ShapeManagement shapeManagement) {
        if (ID.length() != 2) {
            //nếu độ dài khác 2 trả về 1
            return 1;
        }
        else if (shapeManagement.checkShapeID(ID) != -1) {
            //nếu ID tồn tại trả về 2
            return 2;
        }
        else {
            return -1;
            
        }
    }
    //tìm kiếm ID 
    private static void searchShape(Scanner scanner, ShapeManagement shapeManagement) {
        System.out.printf("Find Shape:\n");
        System.out.printf("Input ID to find: ");
        String findID = scanner.nextLine();
        Shape shape = shapeManagement.searchShapeID(findID);
        if (shape != null) {
            shape.showProfile();
        }
        else{
        System.out.println("Not found!");
        }
    }
    
}