import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        // 최대 공약수 계산 후 출력
        int gcdValue = gcd(n, m);
        System.out.println(gcdValue);
    }

    // 최대 공약수(GCD) 계산 함수
    public static int gcd(int n, int m) {
        // 유클리드 알고리즘을 사용하여 GCD 계산
        while (m != 0) {
            int temp = m;
            m = n % m;
            n = temp;
        }
        return n;  // GCD 값 반환
    }
}
