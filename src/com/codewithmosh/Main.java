package com.codewithmosh;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Mosh");
        map.put(2, "John");
        map.put(3, "Mary");
        System.out.println(map.get(2));
        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("Weed"));
        System.out.println(map);

        for (var item : map.entrySet()) {
            System.out.println(item.getValue());
        }
    }
}
