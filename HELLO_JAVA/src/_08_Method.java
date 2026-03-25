public class _08_Method {
    public static void main(String[] args) {
        
        /* 
        
        메소드 : 특정 기능을 수행하기 위한 코드의 묶음
        
        쉽게 이야기하면 반복해서 쓰는 기능을 하나로 묶은 것입니다. 

        왜 사용하는가? 
        1) 코드 재사용
        2) 가독성 향상
        3) 쉬운 유지보수 

        접근제어자 반환타입 메소드명(매개변수) {
           실행코드
           return;
        }

        */

        introduce("김철수");
        introduce(20);

        introduce("홍길동", 25, "농구");
    }

    // public static void introduce(String name) {
    //     System.out.println("안녕하세요.");
    //     System.out.println(String.format("제 이름은 %s입니다.", name));
    // }

    // public static void introduce(Integer age) {
    //     System.out.println("안녕하세요.");
    //     System.out.println(String.format("제 나이는 %d살입니다.", age));
    // }

    // public static <T> void introduce(T t) {
    //     System.out.println(t);
    // }

    public static void introduce(String name) {
        introduce(name, -1, "");
    }

    public static void introduce(Integer age) {
        introduce("", age, "");
    }

    public static void introduce(String name, Integer age, String hobby) {
        if (name.length() > 0)
            System.out.println(String.format("이름은 %s입니다. ", name));

        if  (age >= 0)
            System.out.println(String.format("나이은 %d살입니다. ", age));

        if (hobby.length() > 0)
            System.out.println(String.format("취미은 %s입니다. ", hobby));
    }
    

}
