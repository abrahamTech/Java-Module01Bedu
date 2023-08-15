package Session07.Challenge01.myChallenge01;

import java.util.Collections;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeMap;

public class Challenge01b {
    public static void main(String[] args) {
        Map<String, Queue<Phone>> directory = new TreeMap<>();

        directory.put("Carlos", new PriorityQueue<Phone>());
        directory.put("Beto", new PriorityQueue<Phone>());
        directory.put("Abigail", new PriorityQueue<Phone>());
        directory.put("César", new PriorityQueue<Phone>());
        directory.put("Mónica", new PriorityQueue<Phone>());
        directory.put("Fernando", new PriorityQueue<Phone>());

        Collections.addAll(directory.get("Carlos"), new Phone("5824-6397", 1), new Phone("8271-9346", 2));
        Collections.addAll(directory.get("Beto"), new Phone("6185-7961", 1));
        Collections.addAll(directory.get("Abigail"), new Phone("6848-6573", 1), new Phone("4152-6378", 2));
        Collections.addAll(directory.get("César"), new Phone("7418-5296", 1));
        Collections.addAll(directory.get("Mónica"), new Phone("7698-1254", 1), new Phone("1973-4682", 2));
        Collections.addAll(directory.get("Fernando"), new Phone("9753-8642", 1));


        for (String name : directory.keySet()) {
            Queue<Phone> phones = directory.get(name);

            System.out.print(name + ": ");

            Phone pho = null;

            while ((pho = phones.poll()) != null){
                System.out.print("\t" + pho.getNumber() + "\n");
            }
        }
    }
}
