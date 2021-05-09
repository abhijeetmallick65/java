import java.util.Scanner;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int val = 0;
        while (val != 5) {
            if (input.hasNextInt()) {
                System.out.println("i run as an int");
                val = input.nextInt();
            } else {
                System.out.println("i run as a string");
                input.nextLine();
            }
        }
        input.close();
        /*
         * int val; do { val = input.nextInt(); } while (val <= 10);
         * System.out.println("interger greater than 10 detected"); input.close(); int
         * val = input.nextInt(); switch (val) { case 1: System.out.println("got 1");
         * break; case 66: System.out.println("got 66"); break; default:
         * System.out.println("got something else"); } input.close(); int val =
         * input.nextInt(); while (val != 5) { val = input.nextInt(); }
         * System.out.println("Got it !"); input.close(); CarTEST car = new
         * CarTEST("my car"); car.start(); System.out.println(car.getName()); // 5
         * String[][] arr = new String[2][3]; String[][] arr2 = { { "dog", "cat", "bat"
         * }, { "fox", "box", "hat" }, {} }; int[] arr3 = { 1, 2, 3, 40 }; int arr4[] =
         * { 1, 2, 3, 40 };
         * 
         * // System.out.println(arr2[1][2]); System.out.println(arr2.length); for (int
         * i = 0; i < arr2.length; i++) { for (int j = 0; j < arr2[i].length; j++) {
         * System.out.println(arr2[i][j]); } } //4 double[] values = { 0.1, 5.2, 5.3,
         * 6.3, 83.3 }; for (double i : values) { //
         * System.out.print((String.format("%.2f", i))); System.out.printf("%.2f ", i);
         * } // 3 float a[] = { 1.0f, 2.0f, 3.0f, 4.0f }; double b[] = { 1.2, 3.2, 1.5,
         * 2.4 }; System.out.println(a[1]); // 1 System.out.println("Hello World"); // 2
         * Scanner input = new Scanner(System.in); int value = input.nextInt(); if
         * (value < 10) System.out.println("TO less"); else
         * System.out.println("too big"); input.close();
         */
    }
}