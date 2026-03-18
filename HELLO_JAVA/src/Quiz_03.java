import java.util.Scanner;

public class Quiz_03 {
    
    public static void main(String[] args) {
        
        int score = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("학생의 점수를 입력하세요");
		score = sc.nextInt();

        if(score >= 90)
            System.out.println(String.format("학생의 점수는 %d점으로 A등급입니다", score));
        else if(score >=80)
            System.out.println(String.format("학생의 점수는 %d점으로 B등급입니다", score));
        else if(score >=70)
            System.out.println(String.format("학생의 점수는 %d점으로 C등급입니다", score));
        else
            System.out.println(String.format("학생의 점수는 %d점으로 D등급입니다.", args));
    }
}
