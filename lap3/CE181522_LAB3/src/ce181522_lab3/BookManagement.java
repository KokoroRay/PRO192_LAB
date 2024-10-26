/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ce181522_lab3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author CE181522 Nguyen Minh Tam IA181522
 */

public class BookManagement {
    // tạo array list EBook để lưu trử dữ liệu người dùng nhập
    Scanner scanner = new Scanner(System.in);
    ArrayList<EBook> listEBook = new ArrayList<EBook>();

    public BookManagement() {

    }

    // entryData để thêm dữ liệu vào array list
    public void entryData() {
        System.out.println("----- Add new ebook -----  ");
        System.out.printf("Input ID: ");
        String ID = scanner.nextLine();
        // nếu người dùng nhập độ vài khác 5 hoặc bị trùng ID sẽ return vì không đúng
        // yêu cầu
        if (ID.length() != 5 || searchBookByID(ID) != -1) {
            return;
        }

        System.out.printf("Input name: ");
        String name = scanner.nextLine();
        // isEmpty để ktr độ dài của của name
        // nếu độ dài người dùng nhập là rổng return
        if (name.isEmpty()) {
            return;
        }

        System.out.printf("Input year: ");
        int year = scanner.nextInt();
        // nếu năm người dùng nhập bé hơn 1990 hoặc lớn hơn 2024 return chương trình
        if (year < 1900 || year > 2024) {
            return;
        }
        scanner.nextLine();

        System.out.printf("Input authors: ");
        String authors = scanner.nextLine();
        // kiểm tra độ dài authors người dùng nhập nếu là rổng return
        if (authors.isEmpty()) {
            return;
        }
        System.out.printf("Input size (kilobyte): ");
        int size = scanner.nextInt();
        // nếu độ dài của chương trình bé hơn 0 return
        if (size < 0) {
            return;
        }
        scanner.nextLine();
        System.out.printf("Input url: ");
        String URL = scanner.nextLine();
        // tạo đối tượng ebook và lưu vào các đặt thuộc tính vừa nhập
        EBook ebook = new EBook(ID, name, year, authors, size, URL);
        // lưu dự liệu của đối tượng ebook vào array list
        listEBook.add(ebook);
        System.out.println("Ebook created and added to list of ebooks successfully!");
    }

    public void printData() {
        // nếu array list của listEBook là rổng return chương trình
        if (listEBook.isEmpty()) {
            return;

        }
        System.out.println("--------------------------------BOOK MANAGEMENT-------------------------------------+");
        System.out.println("| NO. | ID      | Name              | Year | Author        | Size  | URL            |");
        System.out.println("+-----+---------+-------------------+------+---------------+-------+----------------+");
        int count = 0;
        // dùng for each để in ra tất cả giá trị trong array list
        for (EBook ebook : listEBook) {
            count++;
            // .get để lấy giá trị của đối tượng ebook
            System.out.printf("|  %d  | %-7s | %-17s | %-4d | %-13s | %-3dKB | %-15s|\n",
                    count, ebook.getID(), ebook.getName(), ebook.getYear(), ebook.getAuthor(), ebook.getSize(),
                    ebook.getURL());
            System.out.println("+-----+---------+-------------------+------+---------------+-------+----------------+");
        }
    }

    public void sort() {
        // sort để sắp xếp tăng dần
        // Comparator.comparing() để sắp xếp đối tượng EBook trong listEBook dựa theo
        // size
        // reversed để sắp xếp ngược lại
        listEBook.sort(Comparator.comparingInt(EBook::getSize).reversed());
    }

    public int searchBookByID(String ID) {
        // for chạy từ phần tử 0 đến phần tử cuối cùng của listEBook
        for (int i = 0; i < listEBook.size(); i++) {
            // nếu: lấy giá trị của phần tử i ID trong listEBook và phần tử ID vừa được nhập
            // để so sánh
            if (listEBook.get(i).getID().equals(ID)) {
                // nếu ID vưa nhập giống với ID đã có sẵn trả về i
                return i;
            }
        }
        // nếu khác return -1
        return -1;
    }

    public EBook searchBookObjetByID(String ID) {
        // tạo index có giá trị là thuộc tính searchBookByID
        int index = searchBookByID(ID);
        // nếu index có giá trị khác -1 tức là ID đó có tồn tại
        if (index != -1) {
            // return giá trị vị trí của ID đó
            return listEBook.get(index);
        }
        // nếu không có trả về null
        return null;
    }

    public void biggestSize() {
        if (listEBook.isEmpty()) {
            return;
        }
        // tạo một stream từ danh sách listEBook
        // mapToList(EBook::getSize) để ánh xạ mỗi EBook trong stream thành giá trị int
        // có kích thước của nó
        // max tìm giá trị lớn nhất trong các giá trị int
        // orElse nếu không có giá trị mà thêm vô phòng ngừa là chính
        int maxSize = listEBook.stream().mapToInt(EBook::getSize).max().orElse(0);
        listEBook.stream() // tạo một steam từ listBook
                // Lọc các cuốn sách trong stream, chỉ giữ lại những cuốn sách có kích thước
                // bằng maxSize.
                .filter(book -> book.getSize() == maxSize)
                .forEach(book -> {
                    // Với mỗi cuốn sách trong kết quả lọc, in thông tin của cuốn sách đó ra màn
                    // hình.
                    System.out.printf("|   1  | %-7s | %-17s | %-4d | %-13s | %-3dKB | %-15s|\n",
                            book.getID(), book.getName(), book.getYear(), book.getAuthor(), book.getSize(),
                            book.getURL());

                });

    }

    public void deleteBookByID(String ID) {
        int index = searchBookByID(ID);
        // như ở searchBookObjetByID thì nếu ID đó có tồn tại thì sẽ xóa nó
        if (index != -1) {
            // remove để xóa ID đó
            listEBook.remove(index);
            System.out.println("Delete successfully");
        } else {
            System.out.println("Not found");
        }
    }

}
