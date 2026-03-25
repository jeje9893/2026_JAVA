public class _02_Variable {
    public static void main(String[] args) {
        /*
        변수 : 데이터를 담는 그릇
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

        int x = 100;
        int y = 100;

        if (x == y)
            System.err.println("True");
        else 
            System.out.println("False");

        String a = "True";
        String b = "True";
        
        if (a == b)
            System.err.println("True");
        else 
            System.out.println("False");

        String newA = new String("True");
        String newB = new String("True");

        if (newA == newB)            
            System.err.println("True");
        else 
            System.out.println("False");

        // final String studentName = "철수";
        // studentName = "영희";

        // System.out.println(studentName);

        
        float score_f = 90.3F;
        double score_d = 90.12;

        System.out.println((int)score_f);


        // 숫자를 문자열로 
        String nine = String.valueOf(9);
        System.out.println(nine);

        
        // 문자열을 숫자로 
        int i = Integer.parseInt("90");
        System.out.println(i);

        double d = Double.parseDouble("90.3");
        System.out.println(d);

    }
    
}
