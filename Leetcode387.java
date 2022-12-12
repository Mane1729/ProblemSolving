import java.util.*;

public class Leetcode387 {
    public int firstUniqChar(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        int l = s.length();

        for(int i = 0; i < l; i++){
            char c = s.charAt(i);
            if (freq.containsKey(c)) {
                freq.put(c, freq.get(c) + 1);
            }
            else {
                freq.put(c, 1);
            }
        }

        for(int i = 0; i < l; i++){
            char c = s.charAt(i);
            if(freq.get(c) == 1){
                return i;
            }
        }

        return -1;
    }
}

/*
    Time complexity: O(n)
    (2 for loops are used each having complexity O(n).
     charAt() - O(1)
     containsKey() - O(1)
     put() - O(1)
     get() - O(1)
     For the last 3 methods it is the average case complexity in case of good
     hashcode implementation which distributes items across buckets. However,
     the worst case complexity is O(n))

     Space complexity: O(n)
     (hashmap is used to store the characters in the string and their frequencies,
      consequently the size of hashmap depends on the string)
 */
