import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the numbers: ");      // E.g. 2 7 11 15
        String[] input = scanner.nextLine().split(" ");

        int[] nums = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }

        System.out.print("Enter the target: ");       // E.g. 9
        int target = scanner.nextInt();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("The indices are " + i + ", " + j);
                    System.out.println("Because nums[" + i + "] + nums[" + j + "] = "
                                       + nums[i] + " + " + nums[j] + " = " + target);
                    return;
                }
            }
        }

        System.out.println("No two numbers add up to the target.");
    }
}
