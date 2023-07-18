package standardlibusage;

import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("apple", 5);
        hashMap.put("banana", 10);
        hashMap.put("cake", 15);
        hashMap.put("remcake", 15);
        // get value of hashmap
        int applecount = hashMap.get("apple");
        System.out.println("Apple's key : " + applecount);
        // check key in hashmap
        boolean containsBanana = hashMap.containsKey("banana");
        System.out.println("Banana? : " + containsBanana);
        // remove
        hashMap.remove("remcake");
        // iteration
        for (String key : hashMap.keySet()) {
            int val = hashMap.get(key);
            System.out.println("value of " + key + ": " + val);
        }
    }

}
