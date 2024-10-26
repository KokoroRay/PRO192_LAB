/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ce181522_program08;

/**
 *
 * @author CE181522 Nguyen Minh Tam IA181522
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class CE181522_Program08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // tạo hàm nhập dữ liệu
        Scanner scanner = new Scanner(System.in);
        // tạo hàm nhập dữ liệu cho arraylist vì số phần tử nhập vào mảng không xác định
        // nên
        // phải dùng array list thay vì array thông thường
        ArrayList<String> arrayList = new ArrayList<String>();
        // vòng while để lập giá trị cho arraylist
        while (true) {
            System.out.printf("Please enter a name (quit to exit!): ");
            String inputValueName = scanner.nextLine();
            // hàm kiểm tra nếu người dùng nhập "quit" hoặc "QUIT" break chương trình
            // nếu không hàm .add() thêm phần tử tiếp theo vào arraylist
            if (inputValueName.contains("quit") || inputValueName.contains("QUIT")) {
                break;
            }
            arrayList.add(inputValueName);
        }
        // chương hợp phần tử của arraylist == 0 thì in ra kết quả khong có phần tử
        // trong arraylist
        if (arrayList.size() == 0) {
            System.out.println("The player list is empty!");
        } else {
            int count = 0;
            System.out.println("List of players:");
            // dùng for each để in chuỗi
            for (String i : arrayList) {
                System.out.println(++count + ".  " + i);
            }
            // tạo hàm Random
            Random random = new Random();
            // .get lấy một phần tử trong chuỗi
            // random. để chọn 1 phần tử bất kì và phía sau là số lượng phần tử Random
            String randomLastName = arrayList.get(random.nextInt(arrayList.size()));
            String randomFirstName = arrayList.get(random.nextInt(arrayList.size()));
            String randomLuckyWinner = arrayList.get(random.nextInt(arrayList.size()));
            // tạo và dùng mothed để tách họ và tên ra được random ra
            String[] lastNameSplit = FullNameSplitter.splitFullName(randomLastName);
            String[] firstNameSplit = FullNameSplitter.splitFullName(randomFirstName);
            String[] luckyWinner = FullNameSplitter.splitFullName(randomLuckyWinner);

            System.out.println("#. List of players with the last name '" + lastNameSplit[0] + "':");

            // lọc danh sách người có last name random
            ArrayList<String> lastNameArrayList = FullNameSplitter.filterByLastName(arrayList, lastNameSplit[0]);
            ArrayList<String> firstNameArrayList = FullNameSplitter.filterByFirstName(arrayList, firstNameSplit[1]);

            int countOutLast = 0, countOutFirst = 0;
            // in ra danh sách họ được method lọc ra
            for (String lastNameOutput : lastNameArrayList) {
                ++countOutLast;
                System.out.println(countOutLast + ".  " + lastNameOutput);
            }
            // in ra tên được method lọc ra
            System.out.println("#. List the players named '" + firstNameSplit[1] + "':");
            for (String firstNameOutput : firstNameArrayList) {
                ++countOutFirst;
                System.out.println(countOutFirst + ". " + firstNameOutput);
            }
            // gọi method và in ra tên bất kì
            System.out.println("#. The name of the lucky winner:");
            String randomLuckyWinnerPrint = FullNameSplitter.randomLuckyWinner(arrayList);
            System.out.println(randomLuckyWinnerPrint);

        }
    }

}
