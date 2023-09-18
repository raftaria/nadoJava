package Chap01;

public class _03_variables {
    public static void main(String[] args) {
        String name = "고객";
        int hour = 15;

        System.out.println(name + " 야 필 소 굿\n" + hour + "대 때리맥이고");

        double score = 90.5;
        char grade = 'A';
        name = "강백호";

        System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
        System.out.println("학점은 " + grade + " 입니다.");

        boolean pass = true;
        System.out.println("이번 시험에 합격 했을까요? " + pass);

        double d = 3.14;
        float f = 3.14f;

        System.out.println(d);
        System.out.println(f);

        long l = 1000000000000L;
        l = 1_000_000_000_000L;
        System.out.println(l);
    }
}
