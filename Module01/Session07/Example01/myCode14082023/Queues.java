package Session07.Example01.myCode14082023;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        //Queue Instance
        Queue<String> queue01 = new PriorityQueue<>();

        queue01.add("one");
        queue01.add("two");
        queue01.add("three");
        queue01.add("four");
        queue01.add("five");

        System.out.println("-Only using a FOR:");
        for (String q: queue01) {
            System.out.println(q);
        }

        System.out.println("\n-----------------");

        //Now using the specific methods for the class PriorityQueue
        String value = null;


        //PEEK()
        System.out.println("-PEEK() -> Only retrieves the item with the highest priority");
        System.out.println(queue01.peek());

        //POLL()
        System.out.println("-POLL() -> Retrieves and removes the item with the highest priority");

        //Retrieves and removes the item with the highest priority from this queue and returns "null" when the queue is empty
        while((value = queue01.poll()) != null) {
            System.out.println(value);
        }
        //It will be ordered according to priority, which in this case is in alphabetical order

        //PEEK()
        System.out.println("-PEEK() -> Only retrieves the item with the highest priority");
        System.out.println(queue01.peek());
        System.out.println("Note: Is null because the queue is now empty after the poll method");



        //Book Class
        System.out.println("\n-----------------");
        Queue<Book> queueBook01 = new PriorityQueue<>();

        queueBook01.add(new Book("one",10));
        queueBook01.add(new Book("two",-7));
        queueBook01.add(new Book("three",0));


        Book bookPriority = queueBook01.peek();
        //In order with compareTo method defined in Book class the highest priority is the highest negative number
        System.out.println("-Peek -> Show priority value");
        System.out.println(bookPriority.getTitle());

        Book bookNull = null;

        System.out.println("\n-Poll -> Retrieves and removes the item with the highest priority from this queue ");
        while((bookNull = queueBook01.poll()) != null) {
            System.out.println(bookNull.getTitle());
        }
    }
}
