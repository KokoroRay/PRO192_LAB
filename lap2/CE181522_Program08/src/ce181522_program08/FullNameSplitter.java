package ce181522_program08;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 *
 * @author CE181522 Nguyen Minh Tam IA181522
 */
public class FullNameSplitter {
    // hàm tách họ và tên
    public static String[] splitFullName(String fullName) {
        // .trim để loại bỏ các khoảng trắng dư thừa trong chuỗi như đầu cuối
        // .split để tách chuỗi ra dựa trên khoảng trắng và chuyền nó vào một mảng
        // String parts
        // '\\s+' có nghĩa là 1 hoặc nhiều kí tự có khoảng trắng
        String[] parts = fullName.trim().split("\\s+");
        // lúc này vị trí 0 tương đương với từ đầu tiên trong chuỗi vừa tách là họ
        String lastName = parts[0];
        // và vị trí cuối cùng là tên ta chỉ cần lấy tổng số phần từ - 1 vì phần tử cuối
        // là null
        // ta sẽ có tên và được gán vào biến first name
        String firstName = parts[parts.length - 1];
        // sao đó trả về 2 giá trị
        return new String[] { lastName, firstName };
    }s

    // method lọc danh sách array list theo lastname được random
    // method nhận 2 giá trị là array list và 1 String lastName
    public static ArrayList<String> filterByLastName(ArrayList<String> arrayList, String lastName) {
        // tạo một stream có đầu vào là arraylist để xử lý danh sách
        List<String> filteredList = arrayList.stream()
                // đây là chuỗi phương thức lambda
                // đầu tiên là phương thức filet để lọc
                // name trong stream để ktr xem name bằng đầu bằng chuỗi lastName + khoảng trắng
                // hay không
                // nếu đúng name sẽ giữ lại trong stream
                .filter(name -> name.startsWith(lastName + " "))
                // collect để thu thập các phần tử trong stream sau khi đã lọc
                .collect(Collectors.toList());
        return new ArrayList<>(filteredList);
    }

    // method lọc danh sách array list theo firstname được random
    // tương tự như filterByLastNames
    public static ArrayList<String> filterByFirstName(ArrayList<String> arrayList, String firstName) {
        List<String> filteredList = arrayList.stream()
                .filter(name -> name.endsWith(" " + firstName))
                .collect(Collectors.toList());
        return new ArrayList<>(filteredList);
    }

    // dùng thư viện Random có sẵn trong Java
    // chuyền vào arraylist danh sách họ và tên
    public static String randomLuckyWinner(ArrayList<String> arrayList) {
        Random random = new Random();
        // trả về giá trị được lấy ngẫu nhiên trong tập có arrayList size phần tử
        return arrayList.get(random.nextInt(arrayList.size()));
    }
}