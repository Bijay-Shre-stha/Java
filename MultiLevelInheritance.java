interface Swimmer{
    void swim();
}
interface Flyer{
    void fly();
}

class Bird implements Swimmer, Flyer{

    public void swim(){
        System.out.println("Bird is swimming");
    }

    public void fly(){
        System.out.println("Bird is flying");
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        Bird b = new Bird();
        b.swim();
        b.fly();
    }
}
