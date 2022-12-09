
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give the first number:");
        int in1 = scan.nextInt();
        
        System.out.println("Give the first second:");
        int in2 = scan.nextInt();
        
        
        if(in1 > in2) {
            System.out.println("Greater number is: " + in1);
        } else if (in1 == in2){
            System.out.println("The numbers are equal!");
        } else {
            System.out.println("Greater number is: " + in2);
        }
    }
}