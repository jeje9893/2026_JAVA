public class _06_Array {
    public static void main(String[] args) {
        
        /* 
        배열 : 크기가 정해진 값들의 묶음 
        
        1) 1차원 배열
        자료형[] 변수명 = new 자료형[크기]
        자료형 변수명[] = new 자료형[크기]
        자료형[] 변수명 = { 값1, 값2, ... }
                
        2) 2차원 배열
        자료형[][] 변수명 = new 자료형[행크기][열크기]

        3) 3차원 배열 
        자료형[][][] 변수명 = new 자료형[면크기][열크기][행크기]
        */
       
        String[] fruits = new String[2];
        fruits[0] = "사과";
        fruits[1] = "딸기";
        //fruits[2] = "키위";
        //fruits[3] = "바나나";

        String[] students = { "김철수", "김영희", "홍길동" };
        for (String name:students) {
            System.out.println(name);
        }

        int[][] axis = new int[][] {
            {1,2,3,4,5}, 
            {6,7,8,9,10} 
        };
        
        for (int i = 0; i < axis.length; i++) {
            for (int j = 0; j < axis[i].length; j++) {
                System.out.println(axis[i][j]);

            }
        }

        
    }
    
}
