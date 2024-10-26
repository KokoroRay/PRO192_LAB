/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ce181522_program07;

/**
 *
 * @author CE181522 Nguyen Minh Tam IA181522
 */
import java.util.Scanner;

public class CE181522_Program07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // tạo hàm nhập dữ liệu
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Please enter a password: ");
        String passwordInput = scanner.nextLine();
        int passwordLength = passwordInput.length();
        if (passwordLength < 8) {
            System.out.println("Your password is too short.");
        }
        boolean passwordCheckG = passwordInput.contains("G");
        boolean passwordCheckSpace = passwordInput.contains(" ");
        if (passwordCheckG == false) {
            System.out.println("Your password does not start with a 'G'.");
        }
        if (passwordCheckSpace == true) {
            System.out.println("Your password contains spaces.");
        }
        if (passwordCheckG == true && passwordLength > 8 && passwordCheckSpace == false) {
            System.out.println("Well done. Your entered a valid password.");
        }

    }

}
