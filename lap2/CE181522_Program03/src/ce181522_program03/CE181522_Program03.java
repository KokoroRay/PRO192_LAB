/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ce181522_program03;

/**
 *
 * @author CE181522 Nguyen Minh Tam IA181522
 */
import java.util.Scanner;

public class CE181522_Program03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // tạo hàm nhập
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Please enter your first name: ");
        String firstName = scanner.nextLine();
        System.out.printf("Please enter your last name: ");
        String lastName = scanner.nextLine();
        // lúc này em dùng mathod toUpperCase để chuyển tất cả chuổi thành In hoa
        // sau đó em dùng hàm charAt giống bài 3 để lấy kí tự đầu tiên của mỗi chuỗi
        // lý do em up chuỗi lên trước vì method toUpperCase trả về chuỗi String
        // không trả về kiểu char
        firstName = firstName.toUpperCase();
        lastName = lastName.toUpperCase();
        char firstChar = firstName.charAt(0);
        char lastChar = lastName.charAt(0);
        System.out.println("Result: " + firstChar + "." + lastChar + ".");
    }

}
