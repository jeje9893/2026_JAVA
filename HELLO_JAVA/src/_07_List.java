import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.*;

public class _07_List {
    public static void main(String[] args) {
        /*
        리스트 : 크기가 정해지지 않은 값들의 묶음

        ArrayList
        LinkedList
        HashSet
        HashMap
        
        Iterator : 컬렉션의 모든 데이터 순회

        Stream : 배열 또는 컬렉션 데이터를 편리하게 처리 
        */

        
        // ArrayList 
        ArrayList<String> list = new ArrayList<>();
        list.add("철수");
        list.add("영희");

        for (String name:list) {
            System.out.println(name);
        }

        /*
        add : 리스트에 데이터 추가 - list.add("TEST")
        get : 리스트 인덱스에 해당하는 데이터 가져오기 - list.get(0)
        size : 리스트 크기  - list.size()
        set : 리스트 데이터 수정 - list.set(0, "TEST")
        contains : 포함 여부 - list.contains("TEST")
        remove : 리스트 데이터 삭제 - list.remove("TEST")
        clear : 전체 삭제 - list.clear()
        */

        // LinkedList : 연결 리스트, 데이터 빠른 삽입 또는 삭제 가능 
        LinkedList<String> nameLists = new LinkedList<>();
        nameLists.add("철수");
        nameLists.add("영희");
        /*
        add()
        get()
        getFirst() : 처음 요소 가져오기
        getLast() : 마지막 요소 가져오기 
        addFirst() : 처음 요소 앞에 추가 
        addLast() : 마지막 요소 뒤에 추가 
        clare()
        */

        // HashSet : 순서, 중복을 허용하지 않는 집합 
        HashSet<String> hashSetName = new HashSet<>();
        hashSetName.add("철수");
        hashSetName.add("영희");
        hashSetName.add("철수");
        /*
        add()
        contains()
        size()
        remove()
        clare()
        */

        // HashMap : key-value, 순서, 중복을 허용하지 않는 집합
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("철수", 90);
        hashMap.put("영희", 100);
        /*
        put() 
        get()
        size()
        containsKey() : key 포함 여부 
        remove()
        clear()
        */


        // Iterator 
        Iterator<String> keys = hashMap.keySet().iterator();
        while (keys.hasNext()) {
            System.out.println(keys.next());
        }

        // Entry
        for (HashMap.Entry<String, Integer> elem : hashMap.entrySet()) {
            System.out.println(elem.getKey() + " " + elem.getValue());
        }

        // KeySet
        for (String key : hashMap.keySet()) {
            System.out.println(key + " " + hashMap.get(key));
        }

        // forEach

        // Iterator : 컬렉션의 모든 데이터 순회
        for (String name:list) {
            System.out.println(name);
        }

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        /*
        hasNext() : 다음 요소 확인
        next() : 다음 요소 가져오기
        remove() : 삭제
        */



        


        // Stream : 배열 또는 컬렉션 데이터를 편리하게 처리 
        List<Integer> streamNumbers = Arrays.asList(1, 2, 3, 4, 5);
        streamNumbers.stream()
            .filter(n -> n % 2 == 0)
            .map(n -> n * 2)
            .forEach(System.out::println);
        
    }
    
}
