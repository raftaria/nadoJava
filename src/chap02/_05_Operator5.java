package chap02;

public class _05_Operator5 {
    public static void main(String[] args) {
        // 삼항 연산자
        // 결과 = 조건 ? 참 : 거짓
        int x = 5;
        int y = 3;
        int max = (x > y) ? x : y;
        int min = (x < y) ? x : y;

        System.out.println(max);    // 5
        System.out.println(min);    // 3

        boolean b = (x == y) ? true : false;    // false
        System.out.println(b);

        String s = (x != y) ? "달라요." : "같아요";
        System.out.println(s);
    }
}
