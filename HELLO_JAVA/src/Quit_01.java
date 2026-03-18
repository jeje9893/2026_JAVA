import java.text.DecimalFormat;
import java.util.HashMap;

public class Quit_01 {
    public static void main(String[] args) {
        /*
        1.카페 주문 시스템 (변수 + 연산)
        
        quiz)
        메뉴
        아메리카노 4,000원
        라뗴 4,500원

        고객이 아메리카노 2잔과 라떼 3잔을 주문했씁니다.

        총 결제 금액을 계산하여 출력하세요.

        *** 조건 ***
        1)변수 3개 이상 사용할 것(가격, 수량 등)
        2) 총 금액은 하나의 변수로 계산
        3)문자열 + 숫자 결함 출력

        *** 출력 ***
        총 결제 금액 : {0}원
        */

        HashMap<String, Integer> map = new HashMap<>();

        map.put("아메리카노", 4500);
        map.put("라떼", 4500);

        int americano = 4000;
        int latte = 4500;

        int totalPrice = 0;

        totalPrice = americano*3 + latte * 2;

        DecimalFormat df = new DecimalFormat("###,###");
        System.out.println(String.format("총 결제금액 : %d원", df.format(totalPrice)));
    }
    
}
