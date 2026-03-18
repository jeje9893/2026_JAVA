import java.util.ArrayList;
import java.util.HashMap;

public class _07_List {
    public static void main(String[] args) {
        
        /*
        리스트 : 크기가 정해지지 않은 값들의 묶음
        ArrayList - add / get / contains / set / remove / clear
        LinkedList - getFirst
        HeshSet
        HashMap
        */


        ArrayList<String> names = new ArrayList<>();
        names.add("홍길동");
        names.add("홍길순");
        names.add("김철수");

        if(names.contains("홍길동"))
            System.out.println("홍길동이 존재합니다.");
        else
            System.out.println("홍길동이 존재하지 않습니다.");
            
        System.out.println();
        
        HashMap<String , Integer> map = new HashMap<>();
        map.put("홍길동", 95);
        map.put("김영희 ", 89);
        map.put("김철수", 100);

        

        
    }
}
