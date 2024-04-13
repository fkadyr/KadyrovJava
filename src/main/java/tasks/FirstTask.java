package tasks;

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double res = 0;
        double res2 = 0;
        if (a > b) {
            System.out.println("a > b");
        } else if (a == b) {
            System.out.println("a = b");
        } else {
            System.out.println("a < b");
        }


        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b) + "\n" + "b - a = " + (b - a));
        System.out.println("a * b = " + (a * b));
        res = (double) a / (double) b;
        res2 =(double) b / (double) a;
        System.out.println("a / b = " + res + "\n" + "b / a = " + res2);
    }
}
