class Rectangle {
    int length;
    int width;

    void setValue(int len, int wid) {
        this.length = len;
        this.width = wid;
    }

    void getLength() {
        System.out.println("Length of the rectangle is : " + length);
    }

    void getWidth() {
        System.out.println("Width of the rectangle is : " + width);
    }
    int area(){
        return this.length*this.width;
    }
    
}

class RectangleClass {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.setValue(10, 20);
        r1.getLength();
        r1.getWidth();
        System.out.println("Area of the rectangle is : " + r1.area());
    }
}
