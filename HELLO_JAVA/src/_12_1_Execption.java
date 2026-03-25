import javax.annotation.processing.SupportedSourceVersion;

public class _12_1_Execption {
    public static void main(String[] args) {

        /*
        try
        catch
        finally
         */


        // int[] numbers = { 1, 2, 3};
        // int index = 5;
        // try {
        //     int result = numbers[index];
        // }
        // catch (Exception e) {
        //     System.out.println("_12_1Execption {0} Error");
        // }

        try {
            int age  = -5;
            if(age < 0)
                throw new Exception("나이가 0살보다 작을 수 없습니다.");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            divide(3,0);
        }
        catch (Exception e) {
            System.out.println("0으로 나눌 수 없습니다.");
        }




    }

    public static int divide(int a, int b) throws Exception {
        return a / b;
    }
}
