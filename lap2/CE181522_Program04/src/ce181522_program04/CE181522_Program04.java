/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ce181522_program04;

/**
 *
 * @author CE181522 Nguyen Minh Tam IA181522
 */
import java.util.Scanner;

public class CE181522_Program04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Please enter a name: ");
        String nameInputValue = scanner.nextLine();
        // dùng mathod length để xác định chuỗi có bao nhiêu ký tự
        int length = nameInputValue.length();
        System.out.printf("Please enter a number: ");
        int numberInputValue = scanner.nextInt();
        // nếu đầu tiên nếu số nhập lớn hơn độ dài trong chuổi in ra đáp án sai
        if (numberInputValue <= length) {
            // dùng hàm charAt để lấy kí tự cụ thể người dùng nhập
            char charNumber = nameInputValue.charAt(numberInputValue);
            System.out.println("The letter at position " + numberInputValue + " is " + charNumber);
        } else {
            System.out.println("Sorry, that number is to big.");
        }
    }

}
