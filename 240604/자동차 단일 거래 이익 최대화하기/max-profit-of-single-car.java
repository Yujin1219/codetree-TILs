import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int gap = -1;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int tempgap = arr[j] - arr[i];
                if (gap < tempgap) {
                    gap = tempgap;
                }
            }
        }

        if (gap < 0) {
            gap = 0;
        }
        System.out.print(gap);
    }
}