package ArraysAndHashing;
//https://leetcode.com/problems/valid-anagram/description/
public class ValidAnagram {
     public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 7 };
        System.out.println(isAnagram("anagram", "nagaram"));
    }
     public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] freq = new int[26];
        for (char ch : s.toCharArray()) {
            freq[ch-'a']++;
        }

        for (char ch : t.toCharArray()) {
            freq[ch-'a']--;
            if(freq[ch-'a'] < 0){
                return false;
            }
        }
        return true;
        
    }


}
