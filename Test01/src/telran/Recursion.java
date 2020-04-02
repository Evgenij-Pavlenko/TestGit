package telran;

import javax.sound.midi.Soundbank;

public class Recursion {
    public static void main(String[] args) {
        recursion(5);
    }

    public static void recursion(int n) {
        int temp = n;
        while (n > 1) {
            System.out.print(n + ", ");
            n -= 2;
        }
        System.out.println(n % 2 == 0 ? "0" : "1");
    }
}
