package classoperations;

public class Circle {
    public double PI = 3.14;
    public int radius;
    
    public Circle(int radius){
        this.radius = radius;
    }
    
    public double  calculateArea(){
        Operations operation = new Operations(radius);
        operation.value_1 = operation.multiply(radius);
        double area = operation.multiply(PI);
        return area;
    }
    
    public double calculatePerimeter(){
        Operations operation = new Operations(2);
        operation.value_1 = operation.multiply(PI);
        double perimeter = operation.multiply(radius);
        return perimeter;
    }
    
    public boolean isPerimeterBigger(){
        if(calculatePerimeter()>calculateArea()){
            return true;
        }
        return false;
    }
    
    public boolean isPerimeterSmaller(){
        if(calculatePerimeter()<calculateArea()){
            return true;
        }
        return false;
    }
    
    public void printScreen(){
        System.out.println("Perimeter: " + calculatePerimeter() + " Area: " + calculateArea());
    }
   
}
