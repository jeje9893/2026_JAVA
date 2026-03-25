public class Quiz_09 {
    public static void main(String[] args) {
        /*

        조건 
        1) 부모 클래스 : Delivery
        1. 속성
           weight (lg)
        2.매서드
          calculateFee()
          기본 배송비 5,000원
          1kg당 1,000원

        2)자식 클래스 : Express
            1. 추가 속성
            priorty (우선 배송 여부 : True, False)
            2. 매서드
               calculateFee() 오버라이딩
               우선 배송인 경우 추가 2,000원

        *** 문제 ***
        홍길동이 이대호에게 2kg 노트북을 우선배송으로 발송합니다
        홍길동의 배송비를 구하세요.

        */

        class Delivery {
            double weight;

            public Delivery(double weight){
                this.weight = weight;
            }
            public double calculateFee() {
                double fee = 5000;
                fee += weight * 1000;
                return fee;
            }            
        }
        class Express extends Delivery {
                boolean priorty;

                public Express(double weight, boolean priorty){
                    super(weight);
                    this.priorty = priorty;
                }

                @Override
                public double calculateFee() {
                    double fee = 5000;
                    fee += weight * 1000;
                    if (priorty = true) {
                        fee += 2000;
                    }
                    return fee;
            }
        }

        Express hong = new Express(2,true);
        System.out.println(String.format("홍길동의 배송비는 %.2f원입니다", hong.calculateFee()));

    }
}
