import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int count = 0;

        for (int i = A; i <= B; i++) {
            if (isPrime(i) && isDigitSumEven(i)) {
                count++;
            }
        }

        System.out.println(count);
    }

    // 소수 판별 함수
    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // 자릿수 합이 짝수인지 판별
    static boolean isDigitSumEven(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum % 2 == 0;
    }
}
