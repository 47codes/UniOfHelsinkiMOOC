
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int in1 = sc.nextInt();
        int in2 = sc.nextInt();
        
        if(in1 > in2){
            System.out.println(in1 + " is greater than " + in2 + ".");
        } else if (in2 > in1){
            System.out.println(in2 + "is smaller than  " + in2 + ".");
        } else {
            System.out.println(in1 + " is equal to " + in2 + ".");
        }
    }
}
