package edu.usc.changgu;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            else  {
                map.put(nums[i], i);
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) throws IOException {
        Solution solution = new Solution();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] parts = br.readLine().trim().split("\\s+");
        int[] arr = Arrays.stream(parts).mapToInt(Integer::parseInt).toArray();
        int target = Integer.parseInt(br.readLine().trim());
        int[] result = solution.twoSum(arr, target);
        System.out.println(result[0] + " " + result[1]);
    }

}