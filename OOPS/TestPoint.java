// Constructor Overloading
// Create a Point class with x and y coordinates. 
// Provide two constructors: one with no arguments (default at (0,0)), and one with both x and y as arguments.
// Demonstrate object creation using both constructors.
class Point {
    int x, y;
    public Point() {
        x = 0;
        y = 0;
    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void printPoint() {
        System.out.println("(" + x + ", " + y + ")");
    }
}

public class TestPoint {
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(5, 6);
        p1.printPoint();
        p2.printPoint();
    }
}
