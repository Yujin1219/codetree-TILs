import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 숫자를 문자열로 바꾼 후 문자 배열로 변환
        String str = String.valueOf(n);
        char[] arr = str.toCharArray();


        // 각 자리 숫자를 정수로 변환해서 더함
        int sum = (arr[0] - '0') + (arr[1] - '0');

        // 조건 확인
        if (n % 2 == 0 && sum % 5 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
