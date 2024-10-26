package q1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Q1 {
    String inputFile = "input.txt";
    String outputFile = "output.txt";

    int n;
    String line;
    ArrayList<String> list = new ArrayList<>();
    String result = "";
    SongList songList = new SongList();

    String fi, fo;

    public void setFile(String[] args) {
        fi = args.length >= 2 ? args[0] : inputFile;
        fo = args.length >= 2 ? args[1] : outputFile;
    }

    public void read() {
        try (Scanner sc = new Scanner(new File(fi))) {
            int n = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < n; i++) {
                line = sc.nextLine();
                list.add(line);
            }
            sc.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Input Exception # " + ex);
        }
    }

    public void solve() {
        for (String str : list) {
            String[] arr = str.split("\\s+");
            if (arr[0].equalsIgnoreCase("AddSong")) {
                int duration = Integer.parseInt(arr[2]);
                String name = arr[1];
                String composer = arr[3];
                songList.inputData(name, duration, composer);
                result += songList.getInfo();
            } else if (arr[0].equalsIgnoreCase("MaxSong")) {
                songList.getSongMaxDuration();
                result += songList.getInfo();
            } else if (arr[0].equalsIgnoreCase("Top3Ranking")) {
                songList.getTop3Ranking();
                result += songList.getInfo();
            } else if (arr[0].equalsIgnoreCase("Clear")) {
                songList.removeSongMaxDuration();
                result += songList.getInfo();
            } else if (arr[0].equalsIgnoreCase("ClearAll")) {
                songList.removeAllData();
                result += songList.getInfo();
            }
        }
    }

    public void printResult() {
        try {
            FileWriter fw = new FileWriter(fo);
            fw.write(result);
            fw.flush();
            fw.close();
        } catch (IOException ex) {
            System.out.println("Output Exception # " + ex);
        }
    }

    public static void main(String[] args) {
        Q1 q = new Q1();
        q.setFile(args);
        q.read();
        q.solve();
        q.printResult();
    }
}
