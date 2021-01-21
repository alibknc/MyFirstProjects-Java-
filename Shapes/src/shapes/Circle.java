package shapes;

public class Circle extends Shape{
    int radius;
    double pi = 3.141592653589793;
    
    public Circle(int x, int y){
        classroom = "circle";
        this.x = x;
        this.y = y;
        radius = 1;
        id = no;
        addList();
        System.out.println(classroom + " was created");
    }
    
    public Circle(int x, int y, int radius){
        classroom = "circle";
        this.x = x;
        this.y = y;
        this.radius = radius;
        id = no;
        addList();
        System.out.println(classroom + " was created");
    }
    
    @Override
    double area(){
         return pi * radius * radius;
    }
    
    @Override
    double perimeter(){
        return 2 * pi * radius;
    }
    
    void enlarge(int k){
        radius+=k;
    }
    
    void remove(){
        super.remove(id);
        System.out.println(id + " was removed");
    }
   
}
