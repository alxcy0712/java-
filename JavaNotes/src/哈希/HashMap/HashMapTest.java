package 哈希.HashMap;

import java.util.HashMap;


public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Integer,StringBuilder> hashMap = new HashMap<>();
        hashMap.put(1,new StringBuilder("hello"));
        hashMap.put(2,new StringBuilder("world"));
        System.out.println(hashMap.get(1));
    }
}
