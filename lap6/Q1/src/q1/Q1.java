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
    String result = "";
    MyCala myCala = new MyCala();
    
    //--FIXED PART - DO NOT EDIT ANY THINGS HERE--
    //--START FIXED PART--------------------------    
    String fi, fo;
    
    /**
     * Set input and output file for automatic rating
     * @param args path of input file and path of output file
     */
    public void setFile (String[] args){
        fi = args.length >= 2 ? args[0] : inputFile;
        fo = args.length >= 2 ? args[1] : outputFile;
    }
    
    /**
     * Reads data from input file
     */
    public void read(){
        try (Scanner sc = new Scanner(new File(fi))){
    //--END FIXED PART----------------------------
            
            //INPUT - @STUDENT: ADD YOUR CODE FOR INPUT HERE:
            n = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < n; i++) {
                line = sc.nextLine();
                list.add(line);
            }

    //--FIXED PART - DO NOT EDIT ANY THINGS HERE--
    //--START FIXED PART--------------------------    
            sc.close();
        } catch (FileNotFoundException ex){
            System.out.println("Input Exception # " + ex);
        }
    }
    //--END FIXED PART----------------------------
    
    //--FIXED PART - DO NOT EDIT ANY THINGS HERE--
    //--START FIXED PART--------------------------    
    /**
     * Main algorithm
     */
    public void solve(){
    //--END FIXED PART----------------------------

        //ALGORITHM - @STUDENT: ADD YOUR CODE HERE:
for (String str : list) {
            String[] arr = str.split("\\s+");
            if (arr[0].equals("Cala")) {
                String owner = arr[1];
                int price = Integer.parseInt(arr[2]);
                Cala cala = new Cala(owner, price);
                myCala.addCala(cala);
            } else if (arr[0].equals("Print")) {
                result += "---Print---\n" + myCala.printData() + "\n";
            } else if (arr[0].equals("F1")) {
                result += "---F1---\n" + myCala.f1(null) + "\n";
            } else if (arr[0].equals("F2")) {
                result += "---F2---\n";
                if (myCala.printData().equals("Empty")) {
                    result += "Empty\n";
                } else {
                    String beforeDeleting = myCala.printData();
                    myCala.f2(null);
                    String afterDeleting = myCala.printData();
                    result += "Before Deleting: " + beforeDeleting + "\n";
                    result += "After Deleting: " + afterDeleting + "\n";
                }
            } else if (arr[0].equals("F3")) {
                result += "---F3---\n";
                if (myCala.printData().equals("Empty")) {
                    result += "Empty\n";
                } else {
                    String beforeSorting = myCala.printData();
                    myCala.f3(null);
                    String afterSorting = myCala.printData();
                    result += "Before Sorting: " + beforeSorting + "\n";
                    result += "After Sorting: " + afterSorting + "\n";
                }
            }}

    //--FIXED PART - DO NOT EDIT ANY THINGS HERE--
    //--START FIXED PART-------------------------- 
    }
    
    /**
     * Write result into output file
     */
    public void printResult(){
        try {
            FileWriter fw = new FileWriter(fo);
    //--END FIXED PART----------------------------
                
            //OUTPUT - @STUDENT: ADD YOUR CODE FOR OUTPUT HERE:
            fw.write(result);

    //--FIXED PART - DO NOT EDIT ANY THINGS HERE--
    //--START FIXED PART-------------------------- 
            fw.flush();
            fw.close();
        } catch (IOException ex){
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
