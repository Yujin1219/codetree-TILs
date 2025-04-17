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

            if(i % 3 == 0 || check369(i1) || check369(i2))
                count++;
        }
        System.out.println(count);
    }

    public static boolean check369(int i){
        if(i == 3 || i == 6 || i == 9)
            return true;
        else
            return false;
    }
}