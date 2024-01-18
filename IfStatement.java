import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Using if-else statement");
        if (n < 0) {
            System.out.println(n + " is negative number");
        } else if (n > 0) {
            System.out.println(n + " is positive number");
        } else {
            System.out.println(n + " is zero");
        }

        System.out.println("Using switch statement");
        switch (Integer.compare(n, 0)) {
            case -1:
                System.out.println(n + " is negative number");
                break;
            case 1:
                System.out.println(n + " is positive number");
                break;
            default:
                System.out.println(n + " is zero");
        }
    }
}
