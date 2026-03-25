public class _01_DataType {
    public static void main(String[] args) {
        
        /* 

        자료형 (DataType)
        기본 자료형과 참조 자료형으로 구분할 수 있다. 
        
        1) 기본 자료형 
        int, long, float, double, boolean, char

        2) 참조 자료형
        String, class, interface, arrayList, enum 등 기본 자료형 외 모든 자료형

        기본 자료형은 실제 값을 그대로 저장
        참조 자료형은 데이터가 저장된 메모리 주소의 값을 저장 

        -------------------------------------------------------------------
        
        변수 : 값(자료)을 저장하기 위한 공간 
        자료형 변수명 = 값

        ** 변수명 짓는 권장사항 
        1. 밑줄(_), 문자(abc ...), 숫자(123 ...) 사용 가능, 공백문자 사용 불가능
        2. 밑줄 또는 문자로 시작, 숫자로 시작 불가
           보통 전역 변수를 밑줄로 시작 
        3. 소문자 시작, 2개 이상의 단어인 경우 2번째 단어의 첫 글자 대문자 
        4. 예약어 사용 불가 
           public, static, void, int, float, 등 
        5. 대소문자 구분 
           myName, myname 은 다른 변수로 인식 

        상수 : 변하지 않는 고정 값을 저장하기 위한 공간
        final 자료형 변수명 = 값

        */

        String name = "철수";
        int age = 20;
        double score = 99.9;

        System.out.println(name);
        System.out.println(age);
        System.out.println(score);

        double age_d = (double)age;

        System.out.println(String.format("정수: %d, 실수: %.2f", 10, 3.14159));

        System.out.println(name.getClass().getName());
        System.out.println(((Object)age).getClass().getName());
        System.out.println(((Object)age_d).getClass().getName());

        
    }
    
}
