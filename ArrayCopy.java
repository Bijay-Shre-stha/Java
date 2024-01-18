public class ArrayCopy {
    public static void main(String[] args) {
        String[] arry1 = {
                "one",
                "two",
                "three",
        };
        System.out.println("Before copying");
        for (int i = 0; i < arry1.length; i++) {
            System.out.println("arry1: " + arry1[i]);
        }
        System.out.println("After copying");
        String[] arry2 = new String[arry1.length];
        System.arraycopy(arry1, 0, arry2, 0, arry1.length);
        for (int i = 0; i < arry2.length; i++) {
            System.out.println("arry2: " + arry2[i]);
        }

    }
}
