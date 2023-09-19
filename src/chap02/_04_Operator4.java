package chap02;

public class _04_Operator4 {
    public static void main(String[] args) {
        // 논리 연산자
        boolean kimchi = false;
        boolean eggyaki = true;
        boolean yakiniku = true;

        System.out.println(kimchi | eggyaki | yakiniku);
        System.out.println(kimchi & eggyaki & yakiniku);

        // and 연산
        System.out.println((5 > 3) & (3 > 1));  // ture
        System.out.println((5 > 3) & (3 < 1));  // false

        // or 연산
        System.out.println((5 > 3) | (3 > 1));  // true
        System.out.println((5 > 3) | (3 < 1));  // true
        System.out.println((5 < 3) | (3 < 1));  // false

        // 논리 부정 연산자
        System.out.println(!true);      // false
        System.out.println(!false);     // true
        System.out.println(!(5 == 5));  // false
        System.out.println(!(5 == 3));  // true
    }
}
