import java.lang.classfile.instruction.StackInstruction;
import java.util.ArrayList;
import java.util.List;

import javax.management.AttributeList;

public class Quiz_08 {
    public static void main(String[] args) {
        /*
        Quiz
        온라인 쇼핑몰을 만들려고 합니다.
        
        1. 고객이 상품을 주문
        2. 상품별 가격을 관리
        3. 중복상품은 제거
        4. 전체 주문 금액을 계산

        ***조건***
        1) 배열 또는 리스트 활용
        2) 배열 또는 리스트 순회 (반복문)
        3) 상품 목록
            1. 노트북 : 1,000,000원
            2. 마우스 :    50,000원
            3. 키보드:    100,000원
        4) 100만원 이상 주문 시 10%할인, 50만원 이상 주문시 5%할인

        *** 문제 ***
        우리 쇼핑몰은 이벤트로 모든 제품의 가격을 5% 할인하여 판매하기로 했씁니다.
        단, 고객당 주문할 수 있는 제품은 품목당 1개만 가능합니다.

        홍길동 고객은 노트북, 키보드, 마우스를 구매합니다.
        이대호 고객은 키보드만 구매합니다.


        *** 출력 ***

        고객명 :
        구매금액 :
        할인금액 :
        결제 금액 :

        */

        

       

        class Customer {
            public String name;
            double totalPrice; //총 물품 금액
            double discountPrice; //할인 금액
            double purchasePrice; //결제금액

            class Goods {
            String name;
            double price;
            boolean isBought = false;

            public Goods(String name, double price){
                this.name = name;
                this.price = price;
                }

            }

            Goods keyboard = new Goods("키보드",(100000 * 0.95));
            Goods notebook = new Goods("노트북", (1000000 * 0.95));
            Goods mouse = new Goods("마우스", (50000 * 0.95));

            

            public Customer(String name) {
                this.name = name;
            }

            public void buy(String name) {
                if (name == this.keyboard.name && !this.keyboard.isBought) {
                    this.keyboard.isBought = true ;
                    this.totalPrice += keyboard.price;
                }
                if (name == this.notebook.name && !this.notebook.isBought) {
                    this.notebook.isBought = true ;
                    this.totalPrice += notebook.price;
                }
                if (name == this.mouse.name && !this.mouse.isBought) {
                    this.mouse.isBought = true ;
                    this.totalPrice += mouse.price;
                }
            }

            public void output() {
                if (totalPrice >= 1000000) {
                    discountPrice = totalPrice * 0.1;
                }
                else if (totalPrice >= 500000) {
                    discountPrice = totalPrice * 0.05;
                }

                purchasePrice = totalPrice - discountPrice;

                

                System.out.println(String.format("고객명 : %s", this.name));
                System.out.println(String.format("구매금액 : %s", this.totalPrice));
                System.out.println(String.format("할인금액 : %s", this.discountPrice));
                System.out.println(String.format("결제금액 : %s", this.purchasePrice));
            }


        }

        Customer hong = new Customer("홍길동");
        hong.buy("키보드");
        hong.buy("노트북");
        hong.buy("노트북");
        hong.buy("마우스");
        hong.output();

        Customer lee = new Customer("이대호");
        lee.buy("키보드");
        lee.output();


        

    }
}
