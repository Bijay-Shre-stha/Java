 class Animal {
    void run() {
        System.out.println("Animal is running");
    }

}

 class Dog extends Animal {

    void run() {
        System.out.println("Dog is running  ");
    }
}

public class overriding {
    public static void main(String args[]) {
        Dog d = new Dog();
        d.run();
    }
}
