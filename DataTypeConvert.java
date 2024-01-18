import java.util.Scanner;

public class DataTypeConvert {
    public static void main(String[] args) {
        
            System.out.println("Convert int to string and vice versa:");
            System.out.print("Enter an integer: ");
            Scanner sc = new Scanner(System.in);
            
            // Read an integer from the user
            int n = sc.nextInt();
            
            // Convert int to String
            String str = Integer.toString(n);
            System.out.println("String: " + str);

            // Convert String to int
            int num = Integer.parseInt(str);
            System.out.println("Integer: " + num);
        } 
    }

