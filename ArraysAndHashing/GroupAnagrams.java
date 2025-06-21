package ArraysAndHashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// https://leetcode.com/problems/group-anagrams/description/
public class GroupAnagrams {

    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            Map<String, List<String>> map = new HashMap<>();
            for (String str : strs) {
                char[] charArray = str.toCharArray();
                Arrays.sort(charArray);
                String news = new String(charArray);
                if (!map.containsKey(news)) {
                    map.put(news, new ArrayList<>());
                }
                map.get(news).add(str);
            }

            return new ArrayList<>(map.values());
        }

        // public List<List<String>> groupAnagrams(String[] strs) {
        // List<List<String>> ans = new ArrayList<>();
        // boolean[] vis = new boolean[strs.length];
        // for (int i = 0; i < strs.length; i++) {
        // List<String> cur = new ArrayList<>();
        // if(vis[i]){
        // continue;
        // }
        // vis[i]= true;
        // cur.add(strs[i]);
        // for (int j = i + 1; j < strs.length; j++) {
        // if(isAnagram(strs[i],strs[j])){
        // vis[j] = true;
        // cur.add(strs[j]);
        // }
        // }
        // ans.add(cur);
        // }

        // public boolean isAnagram(String s, String t) {

        // if (s.length() != t.length()) {
        // return false;
        // }

        // int[] freq = new int[26];

        // for (char c : s.toCharArray()) {
        // freq[c - 'a']++;
        // }

        // for (char ch : t.toCharArray()) {
        // freq[ch - 'a']--;

        // if (freq[ch - 'a'] < 0) {
        // return false;
        // }
        // }
        // return true;
        // }
    }

}
