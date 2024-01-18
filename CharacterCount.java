import java.util.Scanner;

public class CharacterCount {

    public static void main(String[] args) {
        System.out.println("Enter the string to count: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) != ' ') {
                count++;
            }
        }
        System.out.println("The number of characters in the string: " +count);
    }
}
