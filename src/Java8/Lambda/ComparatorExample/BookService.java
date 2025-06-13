package Java8.Lambda.ComparatorExample;


import java.util.List;

public class BookService {

    public List<Book> sortedBooks(){
        List<Book> books =new BookDAO().getBooks();
//        Collections.sort(books,new MyComparator());
        books.sort((b1,b2) -> b1.getName().compareTo(b2.getName()));
        return books;
    }

    public static void main(String[] args) {
        System.out.println(new BookService().sortedBooks());
    }
}
//class MyComparator implements Comparator<Book>{
//    public int compare(Book o1, Book o2){
//        return o1.getName().compareTo(o2.getName());
//    }
//}
