package tasks;

import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        String b = scanner.next();

        System.out.println(compareString(a, b));
    }

    public static String compareString(String a, String b) {
        if (a.equals(b)) {
            return "Строки идентичны";
        } else {
            return "Строки не идентичны";
        }
    }
}
