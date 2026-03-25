public class _09_02_Class {
    public static void main(String[] args) {

        /* 추상클래스 : 아직 완성되지 않은 클래스 */
        
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

        Square s1 = new Square(5);
        System.out.println(String.format("사각형의 넓이는 %f", s1.calculateArea()));

        System.out.println("------------");

        class Circle extends Shape {
            private double r;

            public Circle(double r) {
                this.r = r;
            }

            public double calculateArea() {
                return Math.PI * r * r;
            }
        }

        Circle r1 = new Circle(5);
        System.out.println(String.format("원의 넓이는 %f", r1.calculateArea()));

    }
    
}
