package Session08.Example02.myCode16082023;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Text {
    //We need to add IOException because we have the FileWriter class
    public static void main(String[] args) throws IOException{
        //System.getProperty("user.home") -> Brings the root folder of the OS
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getProperty("user.home") + "/file01.txt"));

        bw.write("Hello, how are you today ?");
        bw.newLine();
        bw.write("Fine, thanks, and you ?\n");
        bw.write("I'm not bad, thanks!");
        bw.close();

        BufferedReader br = new BufferedReader(new FileReader(System.getProperty("user.home") + "/file01.txt"));
        String line = null;

        while((line = br.readLine()) != null) {
            System.out.println(line);
            System.out.println("-----------------");
        }
    }
}
