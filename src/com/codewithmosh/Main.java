package com.codewithmosh;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        /*Map<Integer, String> map = new HashMap<>();
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

        String words = "a green apple";
        char lowest = findFirstNonRepeatingCharacter(words);

        System.out.println(lowest);*/

        Set<Integer> set = new HashSet<>();
        int[] numbers = {1, 1, 3, 2, 2, 4, 3, 5, 6 , 7, 9};
        for (var number : numbers) {
            set.add(number);
        }
        System.out.println(set);
    }

    private static char findFirstNonRepeatingCharacter(String words) {
        var wordArr = words.toCharArray();

        Map<Character, Integer> map = new HashMap<>();

        for (char letter : wordArr) {
            if (map.containsKey(letter)) {
                map.put(letter, map.get(letter) + 1);
                continue;
            }
            map.put(letter, 1);
        }
        System.out.println(map);
        for (char letter : wordArr) {
            if (map.get(letter) == 1) {
                return letter;
            }
        }
        return Character.MIN_VALUE;
    }
}
