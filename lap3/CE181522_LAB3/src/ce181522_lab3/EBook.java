/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ce181522_lab3;

/**
 *
 * @author CE181522 Nguyen Minh Tam IA181522
 */
public class EBook extends Book {
    // tạo thêm thuộc tính URL
    public String URL;

    public EBook(String ID, String name, int year, String author, int size, String URL) {
        // dùng super để tránh code bị override dữ liệu
        super(ID, name, year, author, size);
        this.URL = URL;

    }

    // tạo thêm get và set như class book
    public String getURL() {
        return URL;
    }

    public void setURL(String uRL) {
        URL = uRL;
    }

}
