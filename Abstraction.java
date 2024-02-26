abstract class Shape {
    abstract int calculateArea();
}

class circle extends Shape {
    int calculateArea() {
        System.out.println("Area of circle");
        return 1;
    }
}

class Abstraction {
    public static void main(String[] args) {
        Shape s = new circle();
        s.calculateArea();
    }
}
