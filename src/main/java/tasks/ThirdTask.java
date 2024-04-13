package tasks;

import java.util.Scanner;

public class ThirdTask {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i< n; i++) {
            nums[i] = scanner.nextInt();
        }
        evenNumbers(nums);
    }

    public static void evenNumbers(int[] numbers) {
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
    }
}
