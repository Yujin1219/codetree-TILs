import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int[] arr = new int[n];
        int gap = -1;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i <arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i == j){
                    continue;
                    gap = 0;
                }
                int tempgap = arr[i]- arr[j];
                if(tempgap < 0){
                    tempgap = 0;
                }
                if(gap < tempgap && j < i){
                    gap = tempgap;
                }
            }
        }
        System.out.print(gap);
    }
}