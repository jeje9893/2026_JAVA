public class _09_01_Class {
    public static void main(String[] args) {
        
        class Person {
            // instance variable
            String name;
            int age;
            String hobby;
            // constructor
            public Person(String name, int age, String hobby) {
                this.name = name;
                this.age = age;
                this.hobby = hobby;
            }
            // instance method
            public void introduce() {
                System.out.println(String.format("이름 : %s", this.name));
                System.out.println(String.format("나이 : %s", this.age));
                System.out.println(String.format("취미 : %s", this.hobby));
            }

            // class varaible
            static String gender;
            // class method
            public static void printGender() {
                System.out.println((gender == "남성") ? "성별 : 남성" : "성별 : 여성");
            }

            // setter
            public void setName(String name) {
                this.name = name;
            }

            // getter
            public String getName() {
                return this.name;
            }
        }

        Person person = new Person("김철수", 20, "축구");
        person.introduce();

        // 클래스 변수와 메소드는 객체를 생성하지 않고도 사용할 수 있다.
        Person.gender = "남성";
        Person.printGender();

        System.out.println("----------------");

        person.setName("홍길동");
        person.introduce();

        if (person.getName() == "홍길동")
            System.out.println("이름이 홍길동입니다.");

        System.out.println("----------------");

        // 상속
        class Student extends Person {
            String university;

            public Student(String name, int age, String hobby, String university) {
                super(name, age, hobby);
                this.university = university;
            }

            @Override
            public void introduce() {
                super.introduce();
                System.out.println(String.format("학교 : %s", this.university));
            }

            public void study(String subject) {
                System.out.println(String.format("강좌 : %s", subject));
            }
        }

        Student s1 = new Student("홍길동", 25, "농구", "동의대학교");
        s1.introduce();
        s1.study("웹 프로그래밍");

    }
    
}
