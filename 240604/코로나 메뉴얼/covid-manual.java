import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);
        
        char q; 
        int e = 0;//emergency
        for(int i = 1; i<=3;i++){        
        char p = sc.next().charAt(0); //체온
        int temp = sc.nextInt();
        if(p == 'Y'){
            if(temp >=37){
                q = 'A';
                e++;
                } else q = 'C';
        }
        else{
            if(temp >=37) q = 'B';
            else q = 'D';
        }
        }
        if(e >=2) System.out.println("E");
        else System.out.println("N");
    }
}