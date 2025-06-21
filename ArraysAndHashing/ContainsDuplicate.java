package ArraysAndHashing;

import java.util.Arrays;
import java.util.HashSet;

//https://leetcode.com/problems/contains-duplicate/
public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 7 };
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        // return Arrays.stream(nums).distinct().count() < nums.length;
        HashSet<Integer> set = new HashSet<>();

        for (Integer integer : nums) {
            if (set.contains(integer)) {
                return true;
            }
            set.add(integer);
        }

        return false;

    }
}