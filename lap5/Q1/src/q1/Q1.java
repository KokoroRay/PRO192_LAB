/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Q1 {
    //Change the name of input and output file based on practical paper
    String inputFile = "input.txt";
    String outputFile = "output.txt";

    //--VARIABLES - @STUDENT: DECLARE YOUR VARIABLES HERE:
	
    int n;
    String line;
    ArrayList<String> list = new ArrayList<>();
    String retult = "";
    ArrayList<Document> listDoc = new ArrayList<>();


	//--FIXED PART - DO NOT EDIT ANY THINGS HERE--
	//--START FIXED PART--------------------------    
    String fi, fo;
    
    /**
     * Set input and output file for automatic rating
     * @param args path of input file and path of output file
     */
    public void setFile (String[] args){
        fi = args.length>=2? args[0]: inputFile;
        fo = args.length>=2? args[1]: outputFile;
    }
    
    /**
     * Reads data from input file
     */
    public void read(){
        try (Scanner sc  = new Scanner(new File(fi))){
    //--END FIXED PART----------------------------

            //INPUT - @STUDENT: ADD YOUR CODE FOR INPUT HERE:

            int n = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < n; i++) {
                line = sc.nextLine();
                list.add(line);
            }


	//--FIXED PART - DO NOT EDIT ANY THINGS HERE--
	//--START FIXED PART--------------------------    
            sc.close();
        }catch(FileNotFoundException ex){
            System.out.println("Input Exception # " + ex);
        }
    }
    //--END FIXED PART----------------------------
    
    //ALGORITHM - @STUDENT: ADD YOUROWN METHODS HERE (IF NEED):
    

    
	//--FIXED PART - DO NOT EDIT ANY THINGS HERE--
	//--START FIXED PART--------------------------    
    /**
     * Main algorithm
     */
    public void solve(){
    //--END FIXED PART----------------------------

        //ALGORITHM - @STUDENT: ADD YOUR CODE HERE:
        
        for (String str: list) {
            String[] arr = str.split("\\s+");
            if (arr[0].equalsIgnoreCase("Document")){
                String str1 = arr[1];
                String str2 = arr[2];
                Document d1 = new Document(str1, str2);
                retult += d1.entryDoc() + "\n";
                listDoc.add(d1);
            } else if (arr[0].equalsIgnoreCase("Book")){
                String s1 = arr[1];
                String s2 = arr[2];
                int page1 = Integer.parseInt(arr[3]);
                int sta1 = Integer.parseInt(arr[4]);
                    Book b1 = new Book(s1, s2, page1, sta1);
                    retult += b1.entryBook() + "\n";
                    listDoc.add(b1);
                
            } else if (arr[0].equalsIgnoreCase("Print")) {
                retult += "---Print---\n";
                for (Document doc: listDoc) {
                    if (doc instanceof Book) {
                        retult += ((Book) doc).printBook() + "\n";
                    } else {
                            retult += doc.printDoc() + "\n";
                            }
                }
                
            } else if (arr[0].equalsIgnoreCase("Clear")) {
                listDoc.clear();
                retult += "----------\n";
                retult += "* Remove all\n";
            }


	//--FIXED PART - DO NOT EDIT ANY THINGS HERE--
	//--START FIXED PART-------------------------- 
        }
    }
    
    /**
     * Write result into output file
     */
    public void printResult(){
	    try{
            FileWriter fw = new FileWriter(fo);
	//--END FIXED PART----------------------------
                
        	//OUTPUT - @STUDENT: ADD YOUR CODE FOR OUTPUT HERE:
            fw.write( retult );



	//--FIXED PART - DO NOT EDIT ANY THINGS HERE--
	//--START FIXED PART-------------------------- 
            fw.flush();
            fw.close();
        }catch (IOException ex){
            System.out.println("Output Exception # " + ex);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Q1 q = new Q1();
        q.setFile(args);
        q.read();
        q.solve();
        q.printResult();
    }
	//--END FIXED PART----------------------------    
}