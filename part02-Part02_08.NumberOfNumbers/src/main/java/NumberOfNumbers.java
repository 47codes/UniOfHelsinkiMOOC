
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int input = 0;
        int count = 0;
        
        while(true){
            count = count + 1; // this adds 1 to counts
            // count+=1, different way of adding 1, can use any number with this way
            // count = count + 1
            
            System.out.println("Give a number:");
            input = scanner.nextInt();
            
            if(input == 0){
                break;
            }
            
        }// end of loop
        
        System.out.println("Number of numbers: " + (count - 1) );
    }// end of main
}
