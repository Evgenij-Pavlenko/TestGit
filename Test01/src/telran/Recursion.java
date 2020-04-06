package telran;

import javax.sound.midi.Soundbank;

public class Recursion {
    public static void main(String[] args) {
        recursion(5);
    }

    public static void recursion(int n) {
        if (n>1){
            System.out.print(n + ", ");
            recursion(n-2);
        } else System.out.print(n % 2 == 0 ? "0" : "1");
    }
}
