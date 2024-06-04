import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i = 1 ; i <=n ; i++){
            int f = i / 10;
            int s = i % 10;

            if(i < 10 || s==0){
                if(i %3 == 0){
                System.out.print("0 ");
                }   
                else{
                System.out.print(i + " ");
                }
            }
            else {
                if((i %3 == 0) || (f % 3 ==0) || (s % 3 ==0)){
                System.out.print("0 ");    
                }
                else{
                System.out.print(i+ " ");
                }
            }
            
        }
    }
}