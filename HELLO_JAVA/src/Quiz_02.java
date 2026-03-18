import java.util.Scanner;

public class Quiz_02 {
    public static void main(String[] args) {
        double r = 0;
        double area =0;
        final double pi = 3.14;


        Scanner sc = new Scanner(System.in);
        System.out.println("반지름을 입력하세요");
		r = sc.nextDouble();

        area = pi * r * r;

        System.out.println(String.format("반지름 : {%.2f}", r));
        System.out.println(String.format("원의 넓이 : {%.2f}", area));

    }
}
