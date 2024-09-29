import java.util.Scanner;

public class code3{
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(maxOfMins(arr, k));
    }

    public static int maxOfMins(int[] arr, int k) {
        int n = arr.length;
        int maxMin = Integer.MIN_VALUE;

        for (int i = 0; i <= n - k; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = i; j < i + k; j++) {
                min = Math.min(min, arr[j]);
            }
            maxMin = Math.max(maxMin, min);
        }

        return maxMin;
    }
}
