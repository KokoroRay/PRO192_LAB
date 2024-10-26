/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ce181522_program02;

/**
 *
 * @author CE181522 Nguyen Minh Tam IA181522
 */
import java.util.Scanner;

public class CE181522_Program02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // tạo hàm nhập dữ liệu
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Please type a color: ");
        String inputColorName = scanner.nextLine();
        // dùng hàm charAt để lấy một kí tự cụ thể vị trí trong chuổi
        // hàm trả về giá trị char
        char first = inputColorName.charAt(0);
        char third = inputColorName.charAt(2);
        System.out.println("The first letter is " + first);
        System.out.println("The third letter is " + third);
    }

}
