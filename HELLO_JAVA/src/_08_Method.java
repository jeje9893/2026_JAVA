public class _08_Method {
    public static void main(String[] args) {
        /*
        매서드 : 특정한 기능을 수행하는 코드의 묶음
        
        왜 사용하는가 ?
        1) 코드 재사용성
        2)가독성 향상
        3)쉬운 유지 보수

        접근 제어자 반환타입 메서드명 (전달변수) {
            실행코드
            return 반환값;
        }
        */

        // int a = 10;
        // int b = 5;
        // System.out.println(a + b);
        // System.out.println(sum(a, b));

        // System.out.println("안녕하세요");
        // System.out.println("제 이름은 홍길동입니다.");
        // System.out.println("제 나이는 20살입니다.");
        // System.out.println("저는 축구를 좋아합니다.");

        introduce("홍길동",20,"농구");
        introduce("김철수");
        introduce("김영희");
        introduce("김동수");
        introduce("이대호");

    }

    public static int sum(int a, int b){
        return a + b;
    }

    
    public static void introduce(String name){
        introduce(name, -1, "");
    }

    public static void introduce(String name, Integer age){ //매서드 오버로딩 : 매서드 호출에 필요한 변수가 입력되지 않은 채로 호출될 때 오류가 나지 않게 하기 위한 것
        introduce(name, age, "");
    }

    public static void introduce(String name, Integer age, String hobby){
        System.out.println(String.format("제 이름은 %s입니다.", name));
        if(age >= 0){
            System.out.println(String.format("제 나이는 %d살입니다.", age));
        }
        if(hobby.length() > 0){
            System.out.println(String.format("제 취미는 %s입니다.", hobby));
        }
    }
}
