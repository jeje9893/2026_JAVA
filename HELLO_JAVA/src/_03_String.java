public class _03_String {
    public static void main(String[] args) {
        
        // String s = new String("Hello World");
        
        // System.out.println(s.length());
        // System.out.println(s.toUpperCase());
        // System.out.println(s.toLowerCase());
        // System.out.println(s.concat(" Yeonsu!"));
        // System.out.println(s.contains("Hello"));
        // System.out.println(s.replace("World", "Java"));
        // System.out.println(s.substring(6));
        // System.out.println(s.indexOf("W"));

        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println(s1 == s2);


        String name = "홍길동";
        System.out.println(String.format("%s 님 안녕하세요", name));

        /*
        %s → 문자열(String)
        %d → 정수(int, long)
        %f → 실수(float, double)
        %c → 문자(char)
        %n → 줄바꿈(플랫폼 독립적)
        */

    }
    
}
