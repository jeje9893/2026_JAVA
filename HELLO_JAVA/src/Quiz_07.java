public class Quiz_07 {
    public static void main(String[] args) {
        /*
        학생 5명의 점수가 배열에 저장되어 있습니다.

        점수 목록 : 75 , 80, 95, 60, 85

        조건
        1) 배열 사용
        2) 반복문으로 모든 점수 출력
        3) 총합과 평균 출력
         */

        int[] score = {75,80,95,60,85};
        int sum = 0;
        double avg = 0;

        int i=0;
        while(i<5){
            System.out.println(String.format("%d", score[i]));
            sum += score[i];
            i++;
        }
        avg = sum / (double)score.length;

        System.out.println(String.format("총합 : %d\n평균 : %.2f", sum,avg));

    }
}
