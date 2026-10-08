package lt.vcd;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.print("Iveskite skaiciu: ");
        int num = in.nextInt();
        int count = 0;

        for (int i = 2; i <= num; i += 2) {
            System.out.println(i);
            count++;
        }

        System.out.print("Count: " + count);
    }
}
