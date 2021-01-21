package shapes;

public class Main {

    public static void main(String[] args) {
        Circle c1 = new Circle(1, 1);
        Circle c2 = new Circle(2, 3, 2);
        Square sq1 = new Square(2, 2);
        System.out.println(c1.area());
        System.out.println(c2.area());
        System.out.println(sq1.area());
        c1.top();
        c2.top();
        sq1.top();
        c1.listing();
        c2.remove();
        c1.listing();
    }

}
