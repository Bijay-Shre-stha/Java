import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        System.out.println("Enter the first number:");
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b= sc.nextInt();
        switch (a > b ? 1 : 2) {
            case 1:
                System.out.println("a is greater than b");
                break;
            case 2:
                System.out.println("b is greater than a");
                break;
            default:
                System.out.println("a is equal to b");
        }
    }
}
