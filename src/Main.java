import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        arr = reverseArray(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    // Method to reverse the array
    static int[] reverseArray(int[] arr) {
        // Write your code here
        StringBuilder builder = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            builder.append(arr[i]).append(" ");
        }
        String[] reverse = builder.toString().split(" ");
        int[] reverseArray = new int[reverse.length];
        for (int i = 0; i < reverse.length; i++) {
            reverseArray[i] = Integer.parseInt(reverse[i]);
        }
        return reverseArray;
    }
}