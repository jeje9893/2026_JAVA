public class _10_Exception {
    public static void main(String[] args) {
        /*
        예외처리
        */

        int[] numbers = {1, 2, 3};
        int index = 5; 
        try {
            int result = numbers[index];
        }
        catch (Exception e) {
            System.out.println("Error");
        }

        // Catch : 예외를 다르게 처리하고 싶은 경우
        try {
            int result = numbers[index];
        }
        catch (ArrayIndexOutOfBoundsException e1) {

        }
        catch (Exception e2) {

        }

        // Throw : 의도적으로 예외를 발생시키는 경우 
        try {
            int age = -5;
            if (age < 0)
                throw new Exception("나이는 0보다 작을 수 없습니다.");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Finally : 마지막에 무조건 실행해야하는 경우 
        
        // 사용자 정의 오류 : Exception을 상속 받아 사용자가 재 정의할 수 있다.

        try {
            divide(3, 0);
        }
        catch (Exception e) {
            System.out.println("0으로 나눌 수 없습니다.");
        }
    }

    public static int divide(int a, int b) throws Exception {
        return a / b;
    } 
}
