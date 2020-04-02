package telran;

public class TwoNumbers {
    public static void main(String[] args) {
        twoNumbers(10, 10);
    }

    public static void twoNumbers(int a, int b) {
        String str = ""; // можно этот String и  возвращать, если метод не void, а String
        if (a == b) {
            str += a + ", ";
        } else if (a > b) {
            for (int i = a; i >= b; i--) {
                str += i + ", ";
            }
        } else {
            for (int i = a; i <= b; i++) {
                str += i + ", ";
            }
        }
        System.out.println(str.substring(0, str.length() - 2));
    }
}
