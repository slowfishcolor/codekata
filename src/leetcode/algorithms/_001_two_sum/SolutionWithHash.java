package leetcode.algorithms._001_two_sum;

import java.util.HashMap;
import java.util.Map;

public class SolutionWithHash {

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int required = target - nums[i];
            if (map.containsKey(required) && map.get(required) != i) {
                return new int[] {i, map.get(required)};
            }
        }

        throw new IllegalArgumentException("No answer!");
    }
}
