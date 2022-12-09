
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = "";
        
        while(scanner.hasNext()){
            userInput = scanner.nextLine();
        
       
            String[] aSplit = userInput.split(" ");
        
            for(String word : aSplit){
                System.out.println(word);
            }
            
        }   
        
    }
}
