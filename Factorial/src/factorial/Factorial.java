package factorial;
import java.util.Scanner;

/**
 *
 * @author alibknc
 */
public class Factorial {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int number, i;
        int total = 1;
        
        System.out.println("Please enter a number: ");
        number = sc.nextInt();
        
        for(i=1; i<=number; i++){
            total = total*i;
        }
        
        System.out.println(number + "! = " + total);
    }
    
}
