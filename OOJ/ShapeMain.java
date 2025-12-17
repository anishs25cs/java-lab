abstract class Shape {
    int a, b;
    abstract void printArea();
}

class Rectangle extends Shape {
    Rectangle(int l, int w) { a = l; b = w; }
    void printArea() {
        System.out.println("Rectangle Area: " + (a * b));
    }
}

class Triangle extends Shape {
    Triangle(int base, int height) { a = base; b = height; }
    void printArea() {
        System.out.println("Triangle Area: " + (0.5 * a * b));
    }
}

class Circle extends Shape {
    Circle(int r) { a = r; }
    void printArea() {
        System.out.println("Circle Area: " + (Math.PI * a * a));
    }
}

public class ShapeMain {
    public static void main(String[] args) {
        new Rectangle(5, 4).printArea();
        new Triangle(6, 3).printArea();
        new Circle(7).printArea();
    }
}
