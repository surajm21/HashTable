package com.bridglabz;

import java.util.HashMap;
import java.util.Map;

public class UseCase2 {
    public static void main(String[] args) {

        String str = "Paranoids are not paranoid because they are paranoid but"+
                " because they keep putting themselves deliverately into paranoid"+
                "avoidable situations";

        Map<String, Integer> hashMap = new HashMap<>();

        String[] words = str.split(" ");

        for (String word : words) {
            // containsKey(key) will return a boolean value
            // i.e. true if it contains the key and false if
            // it doesn't.
            if (hashMap.containsKey(word))
                hashMap.put(word, hashMap.get(word) + 1);
            else
                hashMap.put(word, 1);
        }
        System.out.print(hashMap);
    }
}
