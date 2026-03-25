public class _09_03_Interface {
    public static void main(String[] args) {
        
        // 인터페이스 : 클래스의 기본 뼈대
        interface Shape {
            double calculateArea();
        }

        class Square implements Shape {
            private double x;
            public Square(double x) {
                this.x = x;
            }
            public double calculateArea() {
                return x * x;
            }
        }

        Square s1 = new Square(5);
        System.out.println(String.format("사각형의 넓이는 %f", s1.calculateArea()));

        /*
        
        질문) 추상클래스와 인터페이스의 차이 
        추상 클래스는 공통의 기능 + 미완성 기능을 가진 **부모 클래스
        인터페이스는 기능의 규칙을 정의한 것

        */

        System.out.println("--------------");

        abstract class Animal {
            public void eat() {
                System.out.println("먹는다.");
            }

            abstract void sound();
        }

        class Dog extends Animal {
            @Override
            public void sound() {
                System.out.println("멍멍");
            }
        }

        Dog dog = new Dog();
        dog.eat();
        dog.sound();

        System.out.println("--------------");

        interface Animal_i {
            void sound();
        }

        class Cat implements Animal_i {
            public void eat() {
                System.out.println("먹는다.");
            }
            public void sound() {
                System.out.println("야옹");
            }
        }

        Cat cat = new Cat();
        cat.eat();
        cat.sound();
    }
}
