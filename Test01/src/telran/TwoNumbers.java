package telran;

public class TwoNumbers {
    public static void main(String[] args) {
        twoNumbers(10, 10);
    }

    public static void twoNumbers(int a, int b) {
        if (a == b) {
            System.out.print(a);
        } else if (a > b) {
            for (int i = a; i > b; i--) {
                System.out.print(i + ", ");
            }
            System.out.println(b);
        } else {
            for (int i = a; i < b; i++) {
                System.out.print(i + ", ");
            }
            System.out.println(b);
        }
    }
}
