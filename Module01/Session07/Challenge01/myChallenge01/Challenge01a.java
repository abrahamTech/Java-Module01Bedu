package Session07.Challenge01.myChallenge01;

import java.util.Map;
import java.util.TreeMap;

public class Challenge01a {
    public static void main(String[] args) {
        Map<String, String> directory = new TreeMap<>();

        directory.put("Carlos", "5824-6397");
        directory.put("Beto", "6185-7961");
        directory.put("Abigail", "6848-6573");
        directory.put("César", "7418-5296");
        directory.put("Mónica", "7698-1254");
        directory.put("Fernando", "9753-8642");

        for(String name: directory.keySet()) {
            System.out.println("Contact: " + name + " #Phone: " + directory.get(name));
        }
    }
    
}
