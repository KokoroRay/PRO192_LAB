/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ce181522_program06;

/**
 *
 * @author CE181522 Nguyen Minh Tam IA181522
 */
import java.util.Scanner;

public class CE181522_Program06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // tạo hàm nhập dữ liệu
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Please enter a sentence: ");
        String sentence = scanner.nextLine();
        System.out.printf("Please enter a color: ");
        String color = scanner.nextLine();
        // hàm kiểm tra có red trong chuỗi không
        boolean test = sentence.contains("red");
        if (test == false) {
            System.out.println("There is not 'red' word in the sentence");
        } else {
            // ở đây em dùng method replace để thay đổi color thành code người dùng nhập
            String colorNew = sentence.replace("red", color);
            System.out.println(colorNew);
        }
    }

}
