package ArraysAndHashing;

import java.util.HashSet;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int longStreak = 0;

        for (int num : nums) {  // Iterate over the original array to avoid modification errors
            if (!set.contains(num - 1)) {  // Start of a sequence
                int currNum = num;
                int currStreak = 1;

                while (set.contains(currNum + 1)) {  
                    set.remove(currNum + 1);  // Safe removal after lookup
                    currNum++;
                    currStreak++;
                }

                longStreak = Math.max(longStreak, currStreak);
            }
        }

        return longStreak;
    }

}
