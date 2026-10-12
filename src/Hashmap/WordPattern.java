package Hashmap;

import java.util.HashMap;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] str = s.split(" ");
        if (pattern.length() != str.length) {
            return false;
        }
        HashMap<Character, String> mp = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            if (mp.containsKey(pattern.charAt(i))) {
                if (!(mp.get(pattern.charAt(i)).equals(str[i]))) {
                    return false;
                }
            } else {
                if (mp.containsValue(str[i])) {
                    return false;
                }
                mp.put(pattern.charAt(i), str[i]);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        WordPattern wordPattern = new WordPattern();
        System.out.println(wordPattern.wordPattern("abba", "dog cat cat dog"));
    }
}
