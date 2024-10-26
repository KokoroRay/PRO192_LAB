/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ce181522_program05;

/**
 *
 * @author CE181522 Nguyen Minh Tam IA181522
 */
import java.util.Scanner;

public class CE181522_Program05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // tạo hàm nhập giá trị
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Please enter a word: ");
        String word = scanner.nextLine();
        System.out.printf("Please enter a sentence: ");
        String sentence = scanner.nextLine();
        // tạo thêm 2 String để thử dễ so sánh tìm kiếm kí tự
        String wordUpCase = word.toUpperCase();
        String sentenceUpCase = sentence.toUpperCase();
        // dùng hàm contains để tìm kiểm tra kí tự có trong chuổi không
        // dùng 2 biến mới đc tạo để so sánh vì biến mới có đc in hoa hết
        boolean testCase = sentenceUpCase.contains(wordUpCase);
        if (testCase == false) {
            System.out.println("The word '" + word + "' is not in the sentence.");
        } else {
            System.out.println("The word '" + word + "' is in the sentence");
        }

    }

}
