
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0, sum = 0, input;
        
        while(true){
            System.out.println("Give a number:");
            input = scanner.nextInt();
            
            if(input == 0){
                break;
            }
            
            if(input != 0){
                sum += input;
                count++;
            }
        }// end while loop
        
        System.out.println("Number of numbers: " + count);
        System.out.println("Sum of the numbers: " + sum);
    }// end of main
}// end of class
