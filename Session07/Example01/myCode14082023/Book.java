package Session07.Example01.myCode14082023;

public class Book implements Comparable<Book>{
        //implements Comparable<Book> -> Compare Books with Books

        private String title;
        private int priority;
    
        public Book(String title, int priority) {
            this.title = title;
            this.priority = priority;
        }
    
        public String getTitle() {
            return title;
        }
    
        //Comparable METHOD
        @Override
        public int compareTo(Book book) {
            //priority variable is going to be our priority
            return this.priority - book.priority;
            //this.priority = book.priority -> 0
            //this.priority > book.priority -> +
            //this.priority < book.priority -> -
    
        }
}
