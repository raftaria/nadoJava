package chap03;

public class _Quiz_03 {
    public static void main(String[] args) {
        // 주민등록 번호에서 생년월일 및 성별까지만 출력하는 프로그램을 작성하시오.
        /* 주민등록번호는 13자리의 숫자로 구성
        * 앞 6자리는 생년월일 정보, 뒷 7자리 중 첫 번째 숫자는 성별 정보
        * 입력 데이터는 '-'을 포함한 14자리의 문자열 형태
        */
        String ID = "000831-1111111";
        System.out.println(ID.substring(0, 8));

        // 0 위치부터 - 위치 + 2 직전까지
        System.out.println(ID.substring(0, ID.indexOf("-") + 2));

    }
}
