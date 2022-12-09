
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int in = sc.nextInt();
        int ans;
        
        if(in < 0){
            System.out.println(in *= -1);
        } else {
            System.out.println(in);
        }
    }
}
