
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.println("Give a number:");
            int in = scanner.nextInt();
            
            if(in == 0){
                break;
            }
            
            if(in < 0){
                System.out.println("Unsuitable number");
                continue;
            }
            
            System.out.println(in * in);
        }   
    }
}
