
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, count = 0;
        System.out.println("Last number?");
        int ln = scanner.nextInt();
        
//        for(int i = 0; i <= ln; i++){
//            sum += i;
//        }
//        
//        System.out.println("The sum is " + sum);
        
        while(ln <= count){
            sum += count;
            count++;
        }
        
        System.out.println("The sum is " + sum);
    }
}
