
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int in1 = sc.nextInt();
        int in2 = sc.nextInt();
        
        double sqr = Math.sqrt(in1 + in2);
        
        System.out.println(sqr);
    }
}
