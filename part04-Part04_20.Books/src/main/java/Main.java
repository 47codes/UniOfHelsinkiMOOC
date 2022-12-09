import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> book = new ArrayList<>();
        
        while(true){
            System.out.println("Enter book");
            String title = sc.nextLine();
            
            if(title.isEmpty()){
                break;
            }
            
            System.out.println("Pages: ");
            int pages = Integer.valueOf(sc.nextLine());
            
            System.out.println("publication Year: ");
            int year = Integer.valueOf(sc.nextLine());
            
            book.add(new Book(title, pages, year));
            
        }
        
        System.out.println("What information will be printed?");
        String printOut = sc.nextLine();
        
        for(Book books : book){
            if(printOut.equals("everything")){
                System.out.println(books.getInstanceTitle() + ", " + books.getInstancePages() + " pages, " + books.getInstanceYear());
            } else if (printOut.equals("name")){
                System.out.println(books.getInstanceTitle());
            }
        }

    }
}
