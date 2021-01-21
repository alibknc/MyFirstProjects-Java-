package shapes;

import java.util.ArrayList;

public abstract class Shape {
    String classroom;
    int x, y;
    int id;
    static int no = 0;
    private static final ArrayList<Shape> list = new ArrayList<>();
    
    void addList(){
       list.add(this);
       no++;
    }
    
    double area(){
        return 0.0;
    }
    
    double perimeter(){
        return 0;
    }
    
    void listing(){
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Created at " + list.get(i).id + ". place");
            System.out.println("Shape class: " + list.get(i).classroom);
            System.out.println(" X: " + list.get(i).x + "\n Y: " + list.get(i).y);
        }
    }
    
    void top(){
        Shape last = list.get(list.size()-1);
        System.out.println("Shape class: " + last.classroom);
        System.out.println(" X: " + last.x + "\n Y: " + last.y + "\n Area: " + last.area() + "\n Perimeter: " + last.perimeter());
    }
    
    void remove(int id){
        list.remove(id);
    }
    
}
