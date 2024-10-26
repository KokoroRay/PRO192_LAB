/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ce181522_program01;

/**
 *
 * @author CE181522 Nguyen Minh Tam IA181522
 */
import java.util.Scanner;

public class CE181522_Program01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // tạo Scanner để nhập dữ liệu
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Please enter a word: ");
        // chuyền dữ liệu vào biến inputValueString
        String inputValueString = scanner.nextLine();
        // dùng contains trong string
        // contains dùng để kiểm tra một kí tự hoặc từ có tồn tại trong chuổi không
        // trả về giá trị true false
        boolean checkF = inputValueString.contains("a");
        boolean checkS = inputValueString.contains("A");
        // nếu đầu tiên để ktr xem code có tồn tại a hoặc A không
        if (checkF == true || checkS == true) {
            // nếu thứ hai em dùng ngược lại để trách code bị lỗi nếu trong chuổi có cả a và
            // A
            if (checkS == false) {
                System.out.println("Yes, it starts with a lower case 'a'.");
            } else {
                System.out.println("Yes, it starts with an upper case 'A'.");
            }
        } else {
            System.out.println("No, it does not start with upper or lower case 'a'.");
        }

    }

}
