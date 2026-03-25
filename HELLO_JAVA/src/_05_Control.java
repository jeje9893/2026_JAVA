public class _05_Control {
    public static void main(String[] args) {
        /*
        
        제어문
        
        if
        switch
        for
        while
        do while

        continue
        break

        */

        // if 
        int age = 20;
        if (age < 10)
            System.out.println("나이가 10살보다 작습니다.");
        else if (age >= 10 && age <= 20)
            System.out.println("열살 이상이며 스무살 이하입니다. ");
        else 
            System.out.println("스무살보다 많습니다. ");

        // switch
        String fruitName = "사과";
        switch (fruitName) {
            case "사과":
                System.out.println("과일의 이름이 사과입니다. ");
                break;
            case "바나나":
                System.out.println("과일의 이름이 바나나입니다.");
                break;        
            default:
                break;
        }
        
        // for 
        String[] fruits = new String[]{ "사과", "바나나", "딸기" };
        for (int i = 0; i < fruits.length; i++){
            System.out.println(fruits[i]);
        }
        for (String fruit:fruits) {
            System.out.println(fruit);
        }

        // while
        int number = 0;
        while (number < 5) {
            System.out.println("number : " + number);
            number++;            
        }

        // do while
        number = 0;
        do {
            System.out.println("number : " + number);
            number++;            
        } while (number < 5);

    }
    
}
