import java.util.Scanner;

public class Quiz_04 {
    public static void main(String[] args) {
        
        double price = 0 ;
        double off = 0;
        double totalPrice = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("구매할 물품의 총 금액을 입력하세요");
		price = sc.nextDouble();

        if(price >= 100000)
            off = price * 10 / 100; //구매가격의 10퍼
        else if (price >= 50000)
            off = price * 5 / 100; //구매가격의 5퍼
        else
            off = 0;

        totalPrice = price - off;

        System.out.println(String.format("구매 금액 : %.0f원 \n 할인 금액 : %.0f원 \n 결제 금액 : %.0f원", price,off,totalPrice));

    }
}
