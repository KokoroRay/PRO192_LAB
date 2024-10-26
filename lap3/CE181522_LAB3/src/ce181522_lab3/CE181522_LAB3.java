/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ce181522_lab3;

import java.util.Scanner;

/**
 *
 * @author CE181522 Nguyen Minh Tam IA181522
 */
public class CE181522_LAB3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // tạo đối tượng mangement có thuộc tính là BookManagenment
        BookManagement management = new BookManagement();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("-------BOOK MANAGEMENT-------");
            System.out.println("1. Adds new book.");
            System.out.println("2. Shows all books.");
            System.out.println("3. The biggest book.");
            System.out.println("4. Search a book by ID.");
            System.out.println("5. Sort the list of books ascending by size.");
            System.out.println("6. Delete a books by ID.");
            System.out.println("7. Quit.");
            System.out.println("Please select a function:");
            int input = scanner.nextInt();
            switch (input) {
                case 1:
                    // gọi phương thức entyData
                    management.entryData();
                    break;
                case 2:
                    // gọi phương thức printData
                    management.printData();
                    break;
                case 3:
                    System.out
                            .println(
                                    "--------------------------------BOOK MANAGEMENT-------------------------------------+");
                    System.out
                            .println(
                                    "| NO. | ID      | Name              | Year | Author        | Size  | URL            |");
                    System.out
                            .println(
                                    "+-----+---------+-------------------+------+---------------+-------+----------------+");
                    // gọi phương thức biggestSize
                    management.biggestSize();
                    System.out
                            .println(
                                    "+-----+---------+-------------------+------+---------------+-------+----------------+");

                    break;
                case 4:
                    scanner.nextLine();
                    System.out.printf("Please enter book's ID to search: ");
                    String ID = scanner.nextLine();

                    EBook ebook = management.searchBookObjetByID(ID);
                    if (ebook != null) {
                        System.out.println(
                                "--------------------------------BOOK MANAGEMENT-------------------------------------+");
                        System.out.println(
                                "| NO. | ID      | Name              | Year | Author        | Size  | URL            |");
                        System.out.println(
                                "+-----+---------+-------------------+------+---------------+-------+----------------+");
                        System.out.printf("|   1  | %-7s | %-17s | %-4d | %-13s | %-3dKB | %-15s|\n",
                                ebook.getID(), ebook.getName(), ebook.getYear(), ebook.getAuthor(), ebook.getSize(),
                                ebook.getURL());
                        System.out.println(
                                "+-----+---------+-------------------+------+---------------+-------+----------------+");
                    } else {
                        System.out.println("Not Found");
                    }
                    break;
                case 5:
                    management.sort();
                    management.printData();
                    break;
                case 6:
                    scanner.nextLine();
                    System.out.printf("Please enter book's ID to deletes: ");
                    String deletesID = scanner.nextLine();
                    management.deleteBookByID(deletesID);
                    break;
                case 7:
                    System.out.println("THANK FOR USING OUR APPLICATION!");
                    System.out.println("SEE YOU AGAIN!");
                    return;
                default:
                    System.out.println("The function of application muse be from 1 to 7!");
                    break;
            }
        }
    }

}
