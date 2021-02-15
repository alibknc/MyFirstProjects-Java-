package classoperations;

import java.util.Scanner;

public class ClassOperations {

    public static void main(String[] args) {
        //Operations Class Test
        
        Operations operation = new Operations(8);
        
        System.out.println("Add : " + operation.add(7));
        System.out.println("Subtract : " + operation.subtract(3));
        System.out.println("Multiply : " + operation.multiply(2));
        System.out.println("Division : " + operation.division(4));
        System.out.println("Is 10 greater than " + operation.value_1 + " ? : " + operation.isBigger(10));
        System.out.println("Is 10 less than " + operation.value_1 + " ? : " + operation.isLess(10));
        System.out.println("Is 10 equal to " + operation.value_1 + " ? : " + operation.isEqual(10));
        
        //Circle Test
       
        Circle circle1 = new Circle(5);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        int radius = sc.nextInt();
        
        Circle circle2 = new Circle(radius);
        
        System.out.println("Circle 1's perimeter is larger than its area: " + circle1.isPerimeterBigger());
        System.out.println("Circle 1's perimeter is smaller than its area: " + circle1.isPerimeterSmaller());
        
        System.out.println("Circle 2's perimeter is larger than its area: " + circle2.isPerimeterBigger());
        System.out.println("Circle 2's perimeter is smaller than its area: " + circle2.isPerimeterSmaller());
        
        //Factorial Test
        
        Factorial fact1 = new Factorial();
        fact1.setValue(10);
        fact1.calculate();
        fact1.printScreen();
        
        Factorial fakt2 = new Factorial();
        fakt2.setValue(4);
        fakt2.calculate();
        fakt2.printScreen();
        
    }
}
