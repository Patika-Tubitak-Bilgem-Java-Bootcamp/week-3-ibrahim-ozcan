import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
	Book b1 = new Book("Tetikci");
	Book b2 = new Book("Icimizdeki Seytan");
	Book b3 = new Book("Dava");
	Book b4 = new Book("Satranc");
	Book b5 = new Book("Oluler evinden anilar");

        Set<Book> bookSet = new HashSet<>();
        bookSet.add(b1);
        bookSet.add(b2);
        bookSet.add(b3);
        bookSet.add(b4);
        bookSet.add(b5);

        Set<Book> bookSet2 = new TreeSet<>(new compareBook());
        bookSet2.add(b1);
        bookSet2.add(b2);
        bookSet2.add(b3);
        bookSet2.add(b4);
        bookSet2.add(b5);

//        for(Book b:bookSet){
//            System.out.println(b.getBookName());
//        }

        for(Book b:bookSet2){
            System.out.println(b.getBookName());
        }
    }
}
