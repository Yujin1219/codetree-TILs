import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int idx = n - 1; //인덱스 위치
        while(idx > 0){
            int max = arr[idx];
            for(int i = idx - 1; i >= 0; i--){
                if(max <= arr[i]){
                    max = arr[i];
                    idx = i;
                }
            }
            System.out.print((idx + 1) + " ");
        }
    }
}