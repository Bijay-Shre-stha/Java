interface Drawable {
    void draw();
}

interface Clickable {
    void click();
}

class InteractiveButton implements Drawable, Clickable {
    @Override
    public void draw() {
        System.out.println("Drawing a button");
    }
    
    @Override
    public void click() {
        System.out.println("Button clicked");
    }
}

class RunProgram {
    public static void main(String[] args) {
        InteractiveButton b = new InteractiveButton();
        b.draw();
        b.click();
    }
}
