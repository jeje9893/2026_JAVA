public class _09_Class {
    public static void main(String[] args) {
        /*
        클래스 : 설꼐도
        객체 : 설계도를 통해 만들어진 제품

        class className(Parameter){
            인스턴스 변수
            클래스 변수

            인스턴스 매서드
            클래스 매서드
        }

        */

        class Person{
            String name;
            int age;

            public Person(String name, int age) {
                this.name = name;
                this.age = age;
            }

            public void introduce() {
                System.out.println(String.format("이름 : %s", this.name));
                System.out.println(String.format("나이 : %d", this.age));
                System.out.println(String.format("취미는 %s입니다.", hobby));
            }

            static String hobby;
            public static void introduceHobby(){
                System.out.println(String.format("취미는 %s입니다.", hobby));
            }


            //getter
            public String getName() {
                return this.name;
            }
            public void setName() {
                this.name = name;
            }
        }


        Person.hobby = "축구";
        Person.introduceHobby();

        
        Person person = new Person("홍길동", 20);
        person.name = "이대호";
        person.introduce();
    }
}
