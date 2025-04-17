import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int count = 0;
        
        for(int i = A; i <= B; i++){
            int i1 = i / 10;
            int i2 = i % 10;

            if(i % 3 == 0 || check369(i))
                count++;
        }
        System.out.println(count);
    }

    public static boolean check369(int num){
        while(num > 0){
        int digit = num % 10;
        if(digit == 3 || digit == 6 || digit == 9)
            return true;
        num /= 10;
    }
    return false;
    }
}