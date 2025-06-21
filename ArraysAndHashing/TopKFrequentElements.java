package ArraysAndHashing;

import java.util.HashMap;
import java.util.PriorityQueue;
// https://leetcode.com/problems/top-k-frequent-elements/
public class TopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {

        int[] ans = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> a[1] - b[1]);

        for (int key : map.keySet()) {
            queue.offer(new int[] { key, map.get(key) });
            if (queue.size() > k) {
                queue.poll();
            }
        }
        int i = 0;
        while (!queue.isEmpty()) {
            ans[i] = queue.poll()[0];
            i++;
        }
        return ans;
    }

}
