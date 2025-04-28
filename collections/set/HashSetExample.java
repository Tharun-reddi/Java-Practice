package collections.set;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> hs= new HashSet<>();

        hs.add(1);
        hs.add(2);
        hs.add(4);
        hs.add(7);
        hs.add(7);
        System.out.println(hs);
        // hs.add(4);
        // System.out.println(hs);
    }

}
