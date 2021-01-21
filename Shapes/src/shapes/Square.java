package shapes;

public class Square extends Shape{
    int width, height;

    public Square(int x, int y) {
        classroom = "square";
        width = 1;
        height = 1;
        super.x = x;
        super.y = y;
        id = no;
        addList();
        System.out.println(classroom + " was created");
    }
    
    public Square(int x, int y, int width, int height){
        classroom = "square";
        this.width = width;
        this.height = height;
        super.x = x;
        super.y = y;
        id = no;
        addList();
        System.out.println(classroom + " was created");
    }
    
    @Override
    double area(){
        return width * height;
    }
    
    @Override
    double perimeter(){
        return 2 * (width + height);
    }
    
    void remove(){
        super.remove(id);
        System.out.println(id + " was removed");
    }
    
}
