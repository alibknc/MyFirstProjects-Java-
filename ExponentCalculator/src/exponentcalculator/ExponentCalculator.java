package exponentcalculator;

import java.util.Scanner;

/**
 *
 * @author alibknc
 */
public class ExponentCalculator {

    public static void main(String[] args) {
        
        int x, k, total = 1;
        Scanner sc = new Scanner(System.in);

        System.out.println("-------------------");
        System.out.println("Exponent Calculator");
        System.out.println("-------------------");
        System.out.println("Enter base number: ");
        x = sc.nextInt();
        System.out.println("Enter exponent number: ");
        k = sc.nextInt();

        if (k == 0) {
            System.out.println("Result: 1\n");
        } else {
            for (int i = 0; i < k; i++) {
                total = total * x;
            }
            System.out.println("Result: " + total);
        }
    }
    
}
