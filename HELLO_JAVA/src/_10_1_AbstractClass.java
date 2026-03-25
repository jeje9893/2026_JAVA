public class _10_1_AbstractClass {
    public static void main(String[] args) {
        
        /*
        추상 클래스 : 아직 완성하지 않은 클래스

        abstract class 클래스명 {
            구현하지 않은 클래스
        }
        
        */
       abstract class Shape {
        abstract double calculateArea();

       }

       class Square extends Shape {
        private double x;
        public Square(int x) {
            this.x = x;

        }
        public double calculateArea() {
            return x * x;
        }
       }

        class Circle extends Shape {
        private double x;
        public Circle(int x) {
            this.x = x;

        }
        public double calculateArea() {
            return x * x * Math.PI;
        }
       }       

       Square square = new Square(5);
       System.out.println(String.format("한 변의 길이가 %.2f인 사각형의 넓이는 %.2f입니다.", square.x, square.calculateArea()));
       Circle circle = new Circle(5);
       System.out.println(String.format("반지름의 길이가 %.2f인 원의 넓이는 %.2f입니다.", circle.x, circle.calculateArea()));
    
    }
}
