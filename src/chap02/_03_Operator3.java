package chap02;

public class _03_Operator3 {
    public static void main(String[] args) {
        // 비교 연산자
        System.out.println(5 > 3);      // True
        System.out.println(5 >= 3);     // True
        System.out.println(5 >= 5);     // True
        System.out.println(5 >= 7 + '\n');     // False

        System.out.println(5 < 3);      // False
        System.out.println(5 <= 3 + '\n');     // False

        System.out.println(5 == 5);     // True
        System.out.println(5 == 3 + '\n');     // False

        System.out.println(5 != 5);     // False
        System.out.println(5 != 3);     // True
    }
}
