import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt(); // 월
        int D = sc.nextInt(); // 일

        // 2021년 기준 월별 날짜 수 (윤년 아님)
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // 월이 1~12이고, 일이 해당 월의 범위 내인지 확인
        if (M >= 1 && M <= 12 && D >= 1 && D <= daysInMonth[M - 1]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
